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
        
        if (texto2_1.equals(texto2_2)) {
            System.out.println("Las cadenas de texto son identicas.");
        };
        if (texto2_1.equalsIgnoreCase(texto2_2)) {
            System.out.println("Las cadens de texto son iguales "+ 
            "sin diferenciar entre mayusculas y minusculas. ");
        };
        // Ejercicio 3 
        scan = new Scanner(System.in);
        System.out.print("Dame tu nombre: ");
        String nombre = scan.next();
        System.out.print("Dame tu primer apellido: ");
        String apellido1 = scan.next();
        System.out.print("Dame tu segundo apellido: ");
        String apellido2 = scan.next();

        String usuario = nombre.substring(0,2) + apellido1.substring(0,2) + 
        apellido2.substring(0,2);
        
        System.out.println("Tu nombre de usuario es " + usuario);

        // Ejercicio 4
        scan = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase4 = scan.nextLine();

        int contara = 0, contare = 0, contari = 0, contaro = 0, contaru = 0;

        for (int i = 0; i < frase4.length() ; i++) {
            switch (frase4.charAt(i)) {
                case 'a':
                    contara++;
                    break;
                case 'e':
                    contare++;
                    break;
                case 'i':
                    contari++;
                    break;
                case 'o':
                    contaro++;
                    break;
                case 'u':
                    contaru++;
                    break;
            };
        }
        System.out.println("Nº de A's: " + contara + "\n" + 
        "Nº de E's: " + contare + "\n" + "Nº de I's: " + contari + "\n" + 
        "Nº de O's: " + contaro + "\n" + "Nº de U's: " + contaru + "\n");

        // Ejercicio 5
        scan = new Scanner(System.in);
        System.out.print("Dame una frase: ");
        String frase5 = scan.nextLine();

    }
}
