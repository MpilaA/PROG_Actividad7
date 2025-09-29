import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println("Buenos dias");

        // Ejercicio 2
        double lado = 5;
        double area = lado * lado;
        System.out.print("Lado del cuadrado: " + lado + "\t");
        System.out.println("Area del cuadrado: " + area);

        // Ejercicio 3
        System.out.print("Lado del cuadrado: ");
        Scanner scan = new Scanner(System.in);
        double lado2 = scan.nextDouble();
        System.out.println();

        double area2 = lado2 * lado2;
        System.out.println("EL area del cuadrado es " + area2);

        // Ejercicio 4
        System.out.print("Primer numero: ");
        double num1 = scan.nextInt();
        System.out.print("\nSegundo numero: ");
        double num2 = scan.nextInt();
        System.out.println();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division de " + num1 + " entre " + num2 + " es " + division);

        // Ejercicio 5
        System.out.print("Radio de la circunferencia: ");
        double radio = scan.nextDouble();
        System.out.println();

        double longitud = 2 * Math.PI * radio;
        double area3 = Math.PI * radio * radio;
        double volumen;

    }
}
