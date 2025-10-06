import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Ejercicio 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = scan.nextInt();

        if (edad > 17) {
            System.out.println("Eres mayor de edad.");
        }

        // Ejercicio 2
        scan = new Scanner(System.in);
        System.out.print("Dime la edad: ");
        int edad2 = scan.nextInt();

        if (edad2 >= 18) {
            System.out.println("Eres mayor de edad. ");
        }else {
            System.out.println("Eres menor de edad. ");
        }

        // Ejercicio 3
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        };

        // Ejercicio 4
        int contador = 0;
        while (contador < 200) {
            contador += 2;
            System.out.println(contador);
        }

        // Ejercicio 5
        for (int i = 0; i <= 200; i++) {
            if ((i%2) != 0) {
                continue;
            }
            System.out.println(i);
        }
        // Ejercicio 6
        scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();

        for(int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        // Ejercicio 7
        scan = new Scanner(System.in);
        System.out.print("Dime la nota: ");
        double nota = scan.nextDouble();

        if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (num < 5) {
            System.out.print("Insuficiente");
        } else if (num < 6){
            System.out.println("Bien");
        } else if (num < 9) {
            System.out.println("Notable");
        } else if (num <= 10) {
            System.out.println("Sobresaliente");
        }

    }
}
