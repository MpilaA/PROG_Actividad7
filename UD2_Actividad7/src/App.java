import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan; // La variable se inicializa al pedir la jugada
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

            partidas++;

            do {// Bucle para pedir la jugada
                scan = new Scanner(System.in);
                System.out.print("Dame tu jugada: ");
                player = scan.next().toUpperCase();
            } while (Arrays.binarySearch(jugadas, player)== -1);
            // If para los empates
            if (com == player) {
                puntosp++;
                puntosc++;
                System.out.print("Empate");
            // Else if con las posibilidades en las que se pierde.
            } else if (com.equals("T") && player.equals("L") || 
            com.equals("L") && player.equals("P") || 
            com.equals("P") && player.equals("T")) {
                System.out.println("Tu pierdes esta partida. ");
            // Else if con las posibilidades en las que se gana.
            } else if (player.equals("T") && com.equals("L") ||
            player.equals("L") && com.equals("P") ||
            player.equals("P") && com.equals("T")) {
                puntosc++;
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
