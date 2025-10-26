import java.util.Scanner;

public class main {
    public static void main(String[] Args) {
        // Ejercicio 1
        // 5*5
        int [][] matriz1 = new int[5][5];

        for (int i = 0, numero = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                numero++;
                matriz1[i][j] = numero;
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print(i + ": " );
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        // Ejercicio 2
        int [][] matriz2 = new int[10][10];

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (i + 1)*(j + 1);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // Ejercicio 3
        Scanner scan = new Scanner(System.in);
        // Pidiendo valores para la creacion de la matriz.
        System.out.print("Dame el valor para n: ");
        int n = scan.nextInt() ;
        System.out.print("Dame el valor para m: ");
        int m = scan.nextInt();

        // Creancion de la matriz con los parametroas anteriores
        double [][] matriz3 = new double[n][m];
        // Preguntando los numeros que lo van a componer
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print("Dame un valor: ");
                matriz3[i][j] = scan.nextDouble();
            }
        }
        // Contando los mayores y menosres que cero y los que sean cero
        int ceros = 0, maycero = 0, mencero = 0;
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                if (matriz3[i][j] == 0) {
                    ceros++;
                } else if (matriz3[i][j] > 0) {
                    maycero++;
                } else if (matriz3[i][j] < 0) {
                    mencero++;
                }
            }
        }
        // Impresion de los resultados del bucle anterior
        System.out.println("Los mayores que cero son " + maycero);
        System.out.println("Los mayores que cero son " + mencero);
        System.out.println("Hay" + ceros + "ceros");

        // Ejercicio 4
        scan = new Scanner(System.in);
        double [][] matriz4 = new double[4][5];

        for (int i = 0; i < matriz4.length; i++) {
            System.out.println("Notas del Alumno " + (i+1));
            for (int j = 0; j < matriz4.length; j++) {
                System.out.println("Dame la nota " + j + " del alumno: ");
                matriz4[i][j] = scan.nextDouble();
            }
        }


        for (int i = 0; i < matriz4.length; i++) {
            double min = Double.MAX_VALUE, max = Double.MIN_VALUE, media = 0;
            for (int j = 0; j < matriz4.length; j++) {
                min = Math.min(min, matriz4[i][j]);
                max = Math.max(max, j);
                media += matriz4[i][j];
            }
            media = media / matriz4[i].length;
            System.out.println("Estadisticas de la notas del Alumno " + (i+1) + 
            ": \n\t" + "La nota minima: " + min + "\n\tLa nota maxima: " + max + 
            "\n\tLa nota media: " + media);
        }

        // Ejercicio 5
        scan = new Scanner(System.in);
        // Creacion de la matriz
        System.out.print("Dime el numero de empleados: ");
        int n5 = (scan.nextInt()+1);
        double [][] matriz5 = new double[2][n5];

        for (int i = 0; i < (n5 - 1); i++) {
            System.out.print("Dime el su genero (0 es varon, 1 es mujer): ");
            int genero = scan.nextInt();
            System.out.print("Dime el sueldo: ");
            matriz5[genero][i] = scan.nextDouble();
        }
        double media [] = new double[2];
        for (int i = 0; i < matriz5.length; i++) {
            int contador = 0;
            for (int j = 0; j < matriz5[i].length; j++) {
                if (matriz5[i][j] != 0) {
                    media[i] += matriz5[i][j];
                    contador++;
                }
            }
            media[i] = media[i] / contador;
        }
        System.out.println("La media de los varones es " + media[0] + "\n" + 
        "La media de las mujeres es " + media[1]);

    }
}
