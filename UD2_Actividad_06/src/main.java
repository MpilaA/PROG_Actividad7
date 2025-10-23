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
                System.out.println(j + " ");
            }
            System.out.println();
        }

        // Ejercicio 3
        int n = 0;
        int m = 0;

        int [][] matriz3 = new int[n][m];
        for (int i = 0; i < ; i++) {
            
        }

    }
}
