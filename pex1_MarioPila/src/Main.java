import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dame la cantidad de numeros a usar: ");
        int ns = scan.nextInt();

        int[] nums = new int[ns];

        boolean salida = true;

        do { // Menu
            System.out.println("Opciones: \nM E A S");
            String opcion = elegir().toUpperCase();

            switch (opcion) {
                case "M":
                    // No entiendo muy bien el porque pero no se quiere sobrescribir el array;
                    System.out.println("Opciones: \n I B M");
                    opcion = elegir().toUpperCase();
                    // Aqui va un while
                    if (opcion.equals("I")) {
                        nums = M1(nums, ns);
                    } else if (opcion.equals("B")) {
                        nums = M2(nums);
                    } else if (opcion.equals("M")) {
                        nums = M3(nums);
                    } else {
                        System.out.println("¿Que es eso?");
                    }
                    break;
                case "E":
                    System.out.println("Opciones: \n m s max min");
                    opcion = elegir().toUpperCase();
                    if (opcion.equals("M")) {
                        System.out.println(E1(nums));
                    } else if (opcion.equals("S")) {
                        System.out.println(E2(nums));
                    } else if (opcion.equals("MAX")) {
                        System.out.println(E3(nums));
                    } else if (opcion.equals("MIN")) {
                        System.out.println(E4(nums));
                    } else {
                        System.out.println("¿Que es eso?");
                    }
                    break;
                case "A":
                    System.out.print("Dame la cantidad nueva de numeros a usar: ");
                    ns = scan.nextInt();
                    nums = new int[ns];
                    break;
                case "S":
                    System.out.println("Saliendo.");
                    salida = false;
                    break;
                default:
                    System.out.println("¿Que es eso?");
                    break;
            }

        } while (salida == true);

    }

    public static String elegir(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Opcion: ");
        String eleccion = scan.next();
        return eleccion;
    }
    // Estas funciones o no las he probado o no funcionan.
    // Funcion para insertar un numero que no funciona
    public static int[] M1(int [] lista, int ns){
        Scanner scan = new Scanner(System.in);
        System.out.println("Opciones: \n U E ");
        String opcion = elegir().toUpperCase();

        if (opcion.equals("U")) {
            System.out.print("Dame el valor nuevo: ");
            int valor = scan.nextInt();

            int posicion = -1;
            for (int i = 0; i < lista.length;i++){
                if (lista[i] == 0) {
                    posicion = i;
                } else {
                    posicion = -1;
                }
            }
            if (posicion == -1){
                System.out.println("El array ya esta lleno");
            } else {
                lista[posicion] = valor;
            }
        } else if (opcion.equals("E")) {
            System.out.print("Dame la posicion: ");
            int posicion = scan.nextInt();

            System.out.print("Dame el valor nuevo: ");
            int valor = scan.nextInt();

            lista[posicion] = valor;

        } else {
            System.out.println("¿Que es eso?");
        }
        return lista;
    }
    // Funcion para borrar un numero
    public static int[] M2(int[] lista) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Opciones: \nU E ");
        String opcion = elegir().toUpperCase();
        if (opcion.equals("U")) {
            int posicion = -1;
            for (int i = 0; i < lista.length;i++){
                if (lista[i] == 0) {
                    posicion = i;
                } else {
                    posicion = -1;
                }
            }
            if (posicion == -1){
                lista[(lista.length - 1)] = 0;
            } else {
                lista[(posicion - 1)] = 0;
            }
        } else if (opcion.equals("E")) {
            System.out.print("Dame la posicion: ");
            int posicion = scan.nextInt();

            lista[posicion] = 0;
        }
        return lista;
    }
    // Funcion para modificar la posicion espacifica
    public static int[] M3(int[] lista) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dame la posicion: ");
        int posicion = scan.nextInt();

        System.out.print("Dame el valor nuevo: ");
        int valor = scan.nextInt();

        lista[posicion] = 0;

        return lista;
    }
    // Funcione para la media
    public static String E1(int [] lista){
        double media = 0;
        int n_media = 0;
        for (int i : lista) {
            media += i;
            if (i == 0) {
                n_media++;
            }
        }
        media = media / n_media;
        String texto = "La media de todos los numeros no nulos es " + media;
        return texto;
    }
    // Funcion para la suma
    public static String E2(int [] lista){
        int suma = 0;
        for (int i : lista) {
            suma += i;
        }
        String texto = "La suma de todos los numeros es " + suma;
        return texto;
    }
    // Funcion para el maximo
    public static String E3(int [] lista){
        int max = Integer.MIN_VALUE;
        for (int i : lista) {
            max = Math.max(max, i);
        }
        String texto = "Maximo: " + max;
        return texto;
    }
    // Funcion para el minimo
    public static String E4(int [] lista){
        int min = Integer.MAX_VALUE;
        for (int i : lista) {
            min = Math.min(min, i);
        }
        String texto = "Minimo: " + min;
        return texto;
    }

}