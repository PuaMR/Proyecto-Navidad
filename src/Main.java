import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int MAX_SHOTS = 32;
        //           tamaño de los barcos:
        //              0  1  2  3  4
        int[] barcos = {5, 4, 3, 3, 2};
        char[][] jugadorTablero = new char[10][10];
        int[][] barcosTablero = new int[10][10];

        // aqui se rellena el tablero que se le va a mostrar al jugador
        for (int i = 0; i < jugadorTablero.length; i++) {
            for (int j = 0; j < jugadorTablero[i].length; j++) {
                jugadorTablero[i][j] = '.';

            }
        }

        // aqui se rellena el tablero donde van a colocarse los barcos
        for (int i = 0; i < barcosTablero.length; i++) {
            for (int j = 0; j < barcosTablero[i].length; j++) {
                barcosTablero[i][j] = -1;
            }
        }

        // aqui se colocan los barcos en el tablero. Se establece la dirección en la que se colocara el barco (vertical 1 u horizontal 2) y las coordenadas.
        for (int i = 0; i < barcos.length; i++) {
            boolean puedeColocarse = false;
            while (puedeColocarse = false) {
                int posicion = random.nextInt(1, 2);
                int xbarco = random.nextInt(0, 9);
                int ybarco = random.nextInt(0, 9);

                if (xbarco + barcos[i] - 1 < barcosTablero[i].length && posicion == 2) {
                    puedeColocarse = true;
                    for (int j = 0; j < barcos[i]; j++) {
                        barcosTablero[ybarco][xbarco+j] = i;
                    }
                } else if (ybarco + barcos[i] - 1 < barcosTablero.length && posicion == 1) {
                    for (int j = 0; j < barcos[i]; j++) {
                        barcosTablero[ybarco+j][xbarco] = i;
                    }
                    puedeColocarse = true;
                }

            }

        }

        for (int i = 0; i < barcosTablero.length; i++) {
            for (int j = 0; j < barcosTablero[i].length; j++) {
                System.out.print(barcosTablero[i][j] + " ");
            }
            System.out.println();
        }

    }
}