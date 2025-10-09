import java.util.Scanner;

public class main {
    private static double tarifa = 1;

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
            System.out.println("Insuficiente");
        } else if (num < 6){
            System.out.println("Bien");
        } else if (num < 9) {
            System.out.println("Notable");
        } else if (num <= 10) {
            System.out.println("Sobresaliente");
        }
        // Ejercicio 8

        scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1;i < (n + 1); i++){
            result *= i;
        }

        System.out.println("El resutado es " + result);

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

        int positivo = 0;
        int negativo = 0;

        if (num111 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num112 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num113 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num114 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num115 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num116 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num117 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num118 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num119 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }
        if (num1110 >= 0) {
            positivo = positivo + 1;
        } else {
            negativo = negativo + 1;
        }

        System.out.println("Hay " + positivo + " numeros positivos");
        System.out.println("Hay " + negativo + " numeros negativos");

        // Ejercicio 12
        scan = new Scanner(System.in);
        int num12 = 1;
        int positivo12 = 0;
        int negativo12 = 0;

        while (num12 !=0) {
            System.out.print("Dame un numero que sea no nulo: ");
            num12 = scan.nextInt();
            if (num12 >= 0) {
                positivo12 = positivo12 + 1;
            } else {
                negativo12 = negativo12 + 1;
            }
        }
        System.out.println("Ha leido " + positivo12 + " numeros positivos");
        System.out.println("Ha leido " + negativo12 + " numeros negativos");

        // Ejercicio 13
        int suma = 0;
        int multiplicacion = 1;

        for (int i = 1; i < 11; i++){
            suma = suma + i;
            multiplicacion = multiplicacion * i;
        }

        System.out.println("La suma de los primeros 10 numeros naturales es " + suma);
        System.out.println("La multiplicacion de los diez primeros numeros naturales es " + multiplicacion);

        // Ejercicio 14
        scan = new Scanner(System.in);
    
        System.out.print("Dame el nombre del trabajador: ");
        String nombre = scan.next();

        System.out.print("Dame las horas trabjadas: ");
        double horas_trabajadas = scan.nextDouble();

        System.out.print("Dame la tarifa del trabajador: ");
        double tarifa = scan.nextDouble();

        double salario_bruto;
        double salario_neto = 0;
        double tasas;

        if (horas_trabajadas > 35) {
            horas_trabajadas = horas_trabajadas - 35;
            salario_bruto = tarifa * 35;
            salario_bruto += horas_trabajadas * (tarifa * 1.5);
        } else {
            salario_bruto = tarifa * horas_trabajadas;
        }
        if (salario_bruto > 500) {
            salario_neto += 500;
            tasas = salario_bruto * 0.25;
            salario_neto += 400 - tasas;
        } else if (salario_bruto > 900) {
            salario_neto += 500;
            tasas = salario_bruto * 0.25;
            salario_neto += 400 - tasas;
            tasas += salario_bruto * 0.45;
            salario_neto += (salario_bruto - 900) - (salario_bruto * 0.45);
        } else {
            salario_neto = salario_bruto;
            tasas = 0;
        }
        
        System.out.println("Nombre: " + nombre + 
                           "\nSalario bruto: " + salario_bruto +
                           "\nTasa: " + tasas + 
                           "\nSalario neto: " + salario_neto);

    }
}
