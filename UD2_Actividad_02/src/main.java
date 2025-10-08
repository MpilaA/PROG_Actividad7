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
        } else {
            System.out.println("Eres menor de edad. ");
        }
        /* Anuar
        if (edad2 >= 18) {
            System.out.println("Eres mayor de edad. ");
        } else if( edad2 < 18 && edad >= 0) {
            System.out.println("Eres menor de edad. ");
        }
        else {
            ;
        }
        */
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
        // Ejercicio 8

        /* // Anuar
        * int factorial = 1;
        * for (int i = 1; i <= num2; i++) {
        *   factorial = factorial * i
        * } */

        // Ejercicio 9
        scan = new Scanner(System.in);
        System.out.print("Dame la hora: ");
        int horas = scan.nextInt();
        System.out.print("Dame los minutos: ");
        int minutos = scan.nextInt();
        System.out.print("Dame los segundos: ");
        int segundos = scan.nextInt();

        segundos = 1 + segundos;
        if (segundos >= 60) {
            segundos = 0;
            minutos = minutos + 1;
        }
        if (minutos >= 60) {
            minutos = 0;
            horas = horas + 1;
        }
        if (horas >= 24){
            horas = 0;
            System.out.println("Esta hora es del dia siguiente.");
        }

        System.out.println("La hora mas un segundo es: " + horas + ":" + minutos + ":" + segundos);

        // Ejercicio 10
        scan = new Scanner(System.in);
        System.out.print("Dame un numero que sea no nulo: ");
        int num101 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num102 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num103 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num104 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num105 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num106 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num107 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num108 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num109 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num1010 = scan.nextInt();

        if (num101 >= 0) {
            System.out.println("El numero " + num101 + " es positvo");
        } else {
            System.out.println("El numero " + num101 + "es negativo");
        }
        if (num102 >= 0) {
            System.out.println("El numero " + num102 + " es positvo");
        } else {
            System.out.println("El numero " + num102 + "es negativo");
        }
        if (num103 >= 0) {
            System.out.println("El numero " + num103 + " es positvo");
        } else {
            System.out.println("El numero " + num103 + "es negativo");
        }
        if (num104 >= 0) {
            System.out.println("El numero " + num104 + " es positvo");
        } else {
            System.out.println("El numero " + num104 + "es negativo");
        }
        if (num105 >= 0) {
            System.out.println("El numero " + num105 + " es positvo");
        } else {
            System.out.println("El numero " + num105 + "es negativo");
        }
        if (num106 >= 0) {
            System.out.println("El numero " + num106 + " es positvo");
        } else {
            System.out.println("El numero " + num106 + "es negativo");
        }
        if (num107 >= 0) {
            System.out.println("El numero " + num107 + " es positvo");
        } else {
            System.out.println("El numero " + num107 + "es negativo");
        }
        if (num108 >= 0) {
            System.out.println("El numero " + num108 + " es positvo");
        } else {
            System.out.println("El numero " + num108 + "es negativo");
        }
        if (num109 >= 0) {
            System.out.println("El numero " + num109 + " es positvo");
        } else {
            System.out.println("El numero " + num109 + "es negativo");
        }
        if (num1010 >= 0) {
            System.out.println("El numero " + num1010 + " es positvo");
        } else {
            System.out.println("El numero " + num1010 + "es negativo");
        }

        // Ejercicio 11
        scan = new Scanner(System.in);
        System.out.print("Dame un numero que sea no nulo: ");
        int num111 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num112 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num113 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num114 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num115 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num116 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num117 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num118 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num119 = scan.nextInt();
        System.out.print("Dame un numero que sea no nulo: ");
        int num1110 = scan.nextInt();
        

    }
}
