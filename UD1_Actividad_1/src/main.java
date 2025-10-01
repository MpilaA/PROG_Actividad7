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

        double area2 = lado2 * lado2;
        System.out.println("EL area del cuadrado es " + area2);

        // Ejercicio 4
        scan = new Scanner(System.in);
        System.out.print("Primer numero: ");
        double num1 = scan.nextDouble();
        System.out.print("Segundo numero: ");
        double num2 = scan.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division de " + num1 + " entre " + num2 + " es " + division);

        // Ejercicio 5
        scan = new Scanner(System.in);
        System.out.print("Radio de la circunferencia: ");
        double radio = scan.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area3 = Math.PI * radio * radio;
        double volumen = (4 * Math.PI * (radio * radio * radio))/3.0;

        System.out.println("La longitud de la circunferencia es " + longitud);
        System.out.println("El area de la circunferencia es " + area3);
        System.out.println("El volumen de la esfera de la circunferencia es " + volumen);

        // Ejercicio 6
        scan = new Scanner(System.in);
        System.out.print("Precio con descuento: ");
        double precio1 = scan.nextDouble();
        System.out.print("Precio original: ");
        double precio2 = scan.nextDouble();

        double porcentaje = ((precio2 - precio1) * 100) / precio2;

        System.out.println("El descuento es del " + porcentaje + "%");

        // Ejercicio 7
        scan = new Scanner(System.in);
        System.out.print("Distancia en millas marinas: ");
        double millas = scan.nextDouble();

        double metros = 1852 * millas;

        System.out.println("Eso es igual a " + metros + " metros");

        // Ejercicio 8
        scan = new Scanner(System.in);
        System.out.print("Primer numero: ");
        double num3 = scan.nextDouble();
        System.out.print("Segundo numero: ");
        double num4 = scan.nextDouble();

        System.out.println("Numeros ordenados: \n" + Math.min(num3, num4) + ", " + Math.max(num3, num4));

        // Ejercicio 9
        scan = new Scanner(System.in);
        System.out.print("Primer numero: ");
        double num5 = scan.nextDouble();
        System.out.print("Segundo numero: ");
        double num6 = scan.nextDouble();

        System.out.println("El mayor es: " +  Math.max(num5, num6));


        // Ejercicio 10
        scan = new Scanner(System.in);
        System.out.print("Primer numero: ");
        double num7 = scan.nextDouble();
        System.out.print("Segundo numero: ");
        double num8 = scan.nextDouble();
        System.out.print("Tercer numero: ");
        double num9 = scan.nextDouble();

        System.out.print("El mayor de los tres es " + Math.max(Math.max(num7, num8), num9));

        // Ejercicio 11
        scan = new Scanner(System.in);
        System.out.println("Si se pone cero no funciona.");
        System.out.print("Primer numero: ");
        double num10 = scan.nextDouble();
        System.out.print("Segundo numero: ");
        double num11 = scan.nextDouble();

        // Ejercicio 12
        scan = new Scanner(System.in);

        // Ejercicio 13
        scan = new Scanner(System.in);


    }
}
