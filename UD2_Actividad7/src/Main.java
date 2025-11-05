import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan; // Creando variable para scanner
        System.out.println("¡Bienvenido al clasico piedra papel o tijera! \n" + 
        "Estas jugando contra el ordenador. Las posibles aciones son \n" + 
        "- P: Piedra \n" +
        "- L: Papel \n" + 
        "- T: Tijeras \n" + 
        "Y si necesta salir pon una S. \n" +
        "Buena suerte.");


        String player;
        int puntosp = 0, puntosc = 0, partidas = -1;

        do { //Bucle para que empiece de nuevo hasta indicarse salir
            String [] jugadas = new String[] {"P", "L", "T", "S"};
            // Seleccion de la jugada del ordenador
            String com = jugadas[(int)(Math.random()*(jugadas.length-2))];

            do {
                scan = new Scanner(System.in);
                System.out.print("Damela accion que has elegido: ");
                player = scan.next();
            } while (Arrays.binarySearch(jugadas, player)== -1);
            if (com.equals(player)) {
                puntosp++;
                puntosc++;
                System.out.print("Empate");
            } else if (com.equals("T") && player.equals("L") ||
            com.equals("L") && player.equals("P") ||
            com.equals("P") && player.equals("T")) {
                System.out.println("Tu pierdes.");
            } else if (player.equals("T") && com.equals("L") ||
            player.equals("L") && com.equals("P") ||
            player.equals("P") && com.equals("T")) {
                puntosc++;
                System.out.println("Ganaste. ");
            }
            System.out.println("Puntos jugador: " + puntosp + "\nPuntos jugador: " + puntosc);
            System.out.println("Pulse intro ");
        } while (player.equals("S"));

        if (puntosp)

                System.out.println("Tu ganste esta partida. ");
            }
        } while (!player.equalsIgnoreCase("S"));

        if (puntosc < puntosp) {
            System.out.print("Ganaste.");
        } else {
            System.out.print("Perdiste.");
        }
        System.out.println(" A la de " + partidas + " partidas.");
        scan.close();

    }
}
