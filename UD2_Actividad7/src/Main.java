import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan; // Creando variable para scanner
        System.out.println("¡Bienvenido al clasico piedra papel o tijera! \n" + 
        "Estas jugando contra el ordenador. Las posibles aciones son \n" + 
        "- P: Piedra \n" +
        "- L: Papel \n" + 
        "- T: Tijeras \n" + 
        "Y si necesta salir pon una S. \n" +
        "Buena suerte.");


        String player;
        int puntosp = 0, puntosc = 0, partidas = 0;

        do { //Bucle para que empiece de nuevo hasta indicarse salir
            String [] jugadas = new String[] {"P", "L", "T", "S"};
            // Seleccion de la jugada del ordenador
            String com = jugadas[(int)(Math.random()*(jugadas.length-2))];

            boolean a = false;
            do {
                scan = new Scanner(System.in);
                System.out.print("Damela accion que has elegido: ");
                player = scan.next().toUpperCase();
                for (String i : jugadas){
                    if (player.equals(i)){
                        a = true;
                    }
                }
            } while (a != true);
            // If para los empates
            if (com.equals(player)) {
                puntosp++;
                puntosc++;
                System.out.println("Empate");
            // Else if para cuando pierdes.
            } else if (com.equals("T") && player.equals("L") ||
            com.equals("L") && player.equals("P") ||
            com.equals("P") && player.equals("T")) {
                puntosc++;
                System.out.println("Tu pierdes.");
            // Else if para cuando ganas.
            } else if (player.equals("T") && com.equals("L") ||
            player.equals("L") && com.equals("P") ||
            player.equals("P") && com.equals("T")) {
                puntosp++;
                System.out.println("Ganaste. ");
            }
            // Este if esta para cuando que no se ejecute esto cuando se introduce la S.
            if (!player.equalsIgnoreCase("S")) {
                System.out.println("Puntos jugador: " + puntosp + "\nPuntos ordenador: " + puntosc);
                System.out.println("Pulse intro para continuar: ");
                partidas++;
            }

        } while (!player.equalsIgnoreCase("S"));

        if (puntosc < puntosp) {
            System.out.print("Ganaste.");
        } else if (puntosc > puntosp) {
            System.out.print("Perdiste.");
        } else {
            System.out.println("Empataste con el ordendor.");
        }
        if (partidas != 0) {
            System.out.println(" A la de " + partidas + " partidas.");
        }
        scan.close();
    }
}
