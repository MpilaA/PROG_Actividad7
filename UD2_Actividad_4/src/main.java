import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        // Ejercicio 1
        Scanner scan = new Scanner(System.in);
        double[] nums1 = new double[10];

        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Dame un numero: ");
            nums1[i] = scan.nextDouble();
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        // Ejercicio 2 
        scan = new Scanner(System.in);
        double[] nums2 = new double[10];

        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Dame un numero: ");
            nums2[i] = scan.nextDouble();
        }

        double suma2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            suma2 += nums2[i];
        }
        System.out.println("La suma de todos los numeros " +
                "introducidos es " + suma2);

        // Ejercicio 3
        scan = new Scanner(System.in);
        double[] nums3 = new double[10];

        for (int i = 0; i < nums3.length; i++) {
            System.out.print("Dame un numero: ");
            nums3[i] = scan.nextDouble();
        }

        double mayor = 0;
        double menor = 0;

        for (int i = 0; i < nums3.length; i++) {
            if (i == 0) {
                mayor = nums3[i];
                menor = nums3[i];
                continue;
            }
            mayor = Math.max(mayor, nums3[i]);
            menor = Math.min(menor, nums3[i]);
        }
        System.out.println("El mayor es " + mayor + "\n" +
                "El menor es " + menor);

        // Ejercicio 4
        scan = new Scanner(System.in);
        int[] nums4 = new int[20];

        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < nums4.length; i++) {
            System.out.print("Dame un numero: ");
            nums4[i] = scan.nextInt();
        }
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] < 0) {
                negativos = negativos + nums4[i];
            } else if (nums4[i] >= 0) {
                positivos += nums4[i];
            } else {
                System.out.println("¿Que es eso?");
            }
        }
        System.out.println("La suma de los numeros positivos es iguala a " +
                positivos);
        System.out.println("La suma de los numeros negativos es igual a " +
                negativos);

        // Ejercicio 5
        scan = new Scanner(System.in);
        double[] nums5 = new double[20];

        for (int i = 0; i < nums5.length; i++) {
            System.out.print("Dame un numero: ");
            nums5[i] = scan.nextDouble();
        }

        double suma5 = 0;
        for (int i = 0; i < nums5.length; i++) {
            suma5 = suma5 + nums5[i];

        }

        double media = suma5 / nums5.length;
        System.out.println("La media de los numeros dados es " + media);

        // Ejercicio 6
        scan = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        int n6 = scan.nextInt();
        System.out.print("Dame otro numero entero: ");
        int m6 = scan.nextInt();

        int[] array6 = new int[n6];

        for (int i = 0; i < array6.length; i++) {
            array6[i] = m6;
        }
        // Impresion del array6
        System.out.println("Valores del array: ");
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
        System.out.println();

        // Ejercicio 7
        scan = new Scanner(System.in);

        System.out.print("Dame un numero para p: ");
        int p7 = scan.nextInt();
        System.out.print("Dame un numero para q: ");
        int q7 = scan.nextInt();

        int[] array7 = new int[Math.abs(p7 - q7)];

        if (p7 < q7) {
            for (int i = 0; i < array7.length; i++) {
                array7[i] = p7 + i;
            }
        } else if (p7 > q7) {
            for (int i = 0; i < array7.length; i++) {
                array7[i] = p7 - i;
            }
        } else {
            System.out.println("¿Que fue eso?");
        }
        // Impresion del array
        System.out.println("Valores del array: ");
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i] + " ");
        }
        System.out.println();

        // Ejercicio 8
        scan = new Scanner(System.in);

        double[] array8 = new double[100];

        for (int i = 0; i < array8.length; i++) {
            array8[i] = Math.random();
        }

        System.out.print("Dame un numero decimal entre 0 y 1: ");

        double r8 = scan.nextDouble();

        for (int i = 0; i < array8.length; i++) {
            if (array8[i] >= r8) {
                System.out.println(array8[i]);
            }
        }
        // Ejercicio 9
        scan = new Scanner(System.in);

        int[] array9 = new int[100];

        for (int i = 0; i < array9.length; i++) {
            array8[i] = 1 + (Math.random() * 10);
        }

        System.out.print("");
        int n9 = scan.nextInt();
        int i_array9 = Arrays.binarySearch(array9, n9);
        /*for (int i = 0 ; i < array9.length; i++) {
            if (array9[i] == n9) {
                System.out.println("El numero esta en esta posicion del array" + i);
                break;
            }
        }*/

        // Ejercicio 10
        double [] arrayn10 = new double[5];
        for (int i = 0; i < arrayn10.length; i++) {
            System.out.print("Dame las alturas: ");
            arrayn10[i] = scan.nextInt();
        }
        
        // Ejercicio 11

        // Ejercicio 12
        scan = new Scanner(System.in);

        int [] array12 = new int[10];
        
        String opcion12 = "d";
        while (!opcion12.equals("c")) {
            System.out.print("a. Mostrar valores. \nb. Introducir valor. " + 
            "\nc.Salir. \n Pon una opcion de las anteriores: ");
            opcion12 = scan.next();
            switch (opcion12) {
                case "a":
                    System.out.println("Valores del array: ");
                    for (int i = 0; i < array12.length; i++){
                        System.out.print(array12[i] + " ");
                    }
                    break;
                case "b":
                    
                    break;
                case "c":
                    System.out.println("Saliendo...");
                    break;
            }
        }

        // Ejercicio 13
        scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int v13 = scan.nextInt();
        System.out.print("Dame un numero: ");
        int i13 = scan.nextInt();
        System.out.print("Dame un numero: ");
        int n13 = scan.nextInt();

        int [] array13 = new int[n13];

        for (int i = 0; i < array13.length; i++) {
            array13[i] = v13 + (i13 * i);
        }

        System.out.println("Valores del array: ");
        for (int i = 0; i < array13.length; i++) {
            System.out.print(array13[i] + " ");
        }

        // Ejercicio 14
        int [] array14 = new int[1+2+3+4+5+6+7+8+9+10];

        for (int i = 0, index = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                array14[index]= i;
                index += 1;
            }
        }

        System.out.println("Valores del array: ");
        for (int i = 0; i < array14.length; i++){
            System.out.print(array14[i] + " ");
        }
        System.out.println();

    }
}
