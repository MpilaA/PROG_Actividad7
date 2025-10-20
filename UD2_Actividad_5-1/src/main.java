import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame una frase: ");
        String texto1 = scan.nextLine();
        texto1 = texto1.replace(" "," \n");
        System.out.println(texto1);
        // Ejercicio 2
        scan = new Scanner(System.in);
        System.out.println("Dame un texto: ");
        String texto2_1 = scan.nextLine();
        System.out.println("Repita el texto otra vez: ");
        String texto2_2 = scan.nextLine();
        
    }
}
