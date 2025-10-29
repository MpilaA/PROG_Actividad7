import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan; // Creando variable para scanner
        System.out.println("¡Bienvenido al clasico piedra papel o tijera! \n" + 
        "Estas jugando contra el ordenador. Las posibles aciones son " + 
        "- P: Piedra \n" +
        "- L: Papel \n" + 
        "- T: Tijeras \n" + 
        "Y si necesta salir pon una S. \n" +
        "Buena suerte.");


        String player;
        int puntosp = 0, puntosc = 0;

        do { //Bucle para que empiece de nuevo hasta indicarse salir
            String [] jugadas = new String[] {"P", "L", "T", "S"};
            // Seleccion de la jugada del ordenador
            String com = jugadas[(int)(Math.random()*jugadas.length-2)];

            do {
                /* Incializando variable scan con Scanner. 
                Antes de pedir informacion al usuario */
                scan = new Scanner(System.in);
                System.out.print("Dame tu jugada: ");
                player = scan.next();
            } while (Arrays.binarySearch(jugadas, player)== -1);
            if (com == player) {
                puntosp++;
                puntosc++;
                System.out.print("Empate");
            } else if (com == "T" && player == "L" || 
            com == "L" && player == "P" || 
            com == "P" && player == "T") {
                System.out.print("Tu pierdes.");
            } else if (player == "" && com == "" ||
            player == "" && com == "" ||
            player == "" && com == "") {
                puntosc++;

            }
        } while (player == "S");
        scan.close();

    }
}
