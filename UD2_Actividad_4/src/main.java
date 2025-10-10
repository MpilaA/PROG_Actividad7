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
        System.out.println("La suma de todos los numeros introducidos es " + suma2);

        // Ejercicio 3
        scan = new Scanner(System.in);
        double [] nums3 = new double[10];

        for (int i = 0; i < nums3.length; i++) {
            
        }

    }
}
