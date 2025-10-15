import java.util.Scanner;

public class main {
    public static void main(String[] args){

        // Ejercicio 1
        Scanner scan = new Scanner(System.in);
        double [] nums1 = new double[10];

        for (int i = 0; i < nums1.length; i++) {
            System.out.print("Dame un numero: ");
            nums1[i] = scan.nextDouble();
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        // Ejercicio 2 
        scan = new Scanner(System.in);
        double [] nums2 = new double[10];
        
        for (int i = 0; i < nums2.length; i++) {
            System.out.print("Dame un numero: ");
            nums2[i] = scan.nextDouble();
        }

        double suma2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            suma2 += nums2[i];
        }
        System.out.println("La suma de todos los numeros introducidos es " + 
        suma2);

        // Ejercicio 3
        scan = new Scanner(System.in);
        double [] nums3 = new double[10];

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
        int [] nums4 = new int[20];

        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < nums4.length; i++) {
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
            System.out.println("La suma de los numeros positivos es iguala a " + 
            positivos);
            System.out.println("La suma de los numeros negativos es igual a " + 
            negativos);
        }

        // Ejercicio 5
        scan = new Scanner(System.in);
        double [] nums5 = new double[20];

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
    }
}
