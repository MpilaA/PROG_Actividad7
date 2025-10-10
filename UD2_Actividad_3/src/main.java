import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Ejercicio 1 
        Scanner scan = new Scanner(System.in);
        // Pidiendo la cantidad de dinero.
        System.out.print("Dame una cantidad de euros: ");
        double dinero = scan.nextDouble();
        // Contando billetes
        if ((dinero % 5) == 0) {
            int b500 = 0;
            while (dinero >= 500) {
                dinero = dinero - 500;
                b500++;
            }
            int b200 = 0;
            while (dinero >= 200) {
                dinero = dinero - 200;
                b200++;
            }
            int b100 = 0;
            while (dinero >= 100) {
                dinero = dinero  -100;
                b100++;
            }
            int b50 = 0;
            while (dinero >= 50) {
                dinero = dinero - 50;
                b50++;
            }
            int b20 = 0;
            while (dinero >= 20) {
                dinero = dinero - 20;
                b20++;
            }
            int b10 = 0;
            while (dinero >= 10) {
                dinero = dinero - 10;
                b10++;
            }
            int b5 = 0;
            while (dinero >= 5) {
                dinero = dinero - 5;
                b5++;
            }
            // Imprimiendo cuentas
            System.out.println("Los " + dinero + " euros son: \n" + "Billetes de 500: "+ b500 +
                    "\nBilletes de 200: " + b200 + "\nBilletes de 100: " + b100 + "\nBiletes de 50: " + b50 +
                    "\nBilletes de 20: " + b20 + "\nBilletes de 10: " + b10 + "\nBilletes de 5: " + b5);
        } else {
            // Salida si no se introduce un numero valido
            System.out.println("Eso no es un valor valido. \n" +
            "Porfavo solo se aceptan multiplos de 5.");
        }


        // Ejercicio 2
        scan = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println();
            System.out.print("Dame una opcion: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Dame un numero a sumar: ");
                    double num21 = scan.nextDouble();
                    System.out.print("Dame otro numero a sumar con el anterior: ");
                    double num22 = scan.nextDouble();
                    System.out.println("La suma es " + (num21 + num22));
                    break;
                case 2:
                    System.out.print("Dame un numero para restar: ");
                    double num23 = scan.nextInt();
                    System.out.print("Dame un numero para restarselo al anterior: ");
                    double num24 = scan.nextInt();
                    System.out.println("La resta es " + (num23 - num24));
                    break;
                case 3:
                    System.out.print("Dame un numero para multiplicar: ");
                    double num25 = scan.nextDouble();
                    System.out.print("Dame un numero para multiplicarlo con el anterior: ");
                    double num26 = scan.nextDouble();
                    System.out.println("La multiplicacion es " + (num25 + num26));
                    break;
                case 4:
                    System.out.print("Dame un numero para dividir: ");
                    double num27 = scan.nextDouble();
                    System.out.print("Dame un numero para dividirlo al anterior: ");
                    double num28 = scan.nextDouble();
                    if (num28 != 0) {
                        System.out.println("La division es " + (num27 / num28));
                    } else {
                        System.out.println("La division no se puede hacer");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo.");
                    break;
            }
        }

    }
}
