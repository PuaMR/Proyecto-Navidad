import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String black = "\033[30m";
        String red = "\033[31m";
        String green = "\033[32m";
        String yellow = "\033[33m";
        String blue = "\033[34m";
        String purple = "\033[35m";
        String cyan = "\033[36m";
        String white = "\033[37m";
        String reset = "\u001B[0m";
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
            while (!puedeColocarse) {
                boolean horizontal = random.nextBoolean(); // genera una direccion aleatoria
                int xbarco = random.nextInt(0, barcosTablero.length);   // genera una coordenada x
                int ybarco = random.nextInt(0, barcosTablero.length);   // genera una coordenada y

                // Comprobaciones de si caben en el tablero en horizontal y luego en vertical y si no pisan otros barcos
                if (xbarco + barcos[i] - 1 < barcosTablero[i].length && horizontal) {
                    boolean pisaBarco = false;
                    for (int j = 0; j < barcos[i]; j++) {
                        if (barcosTablero[ybarco][xbarco+j] != -1) {
                            pisaBarco = true;
                        }
                    }
                    if (!pisaBarco) {
                        puedeColocarse = true;
                        for (int j = 0; j < barcos[i]; j++) {
                            barcosTablero[ybarco][xbarco + j] = i;
                        }
                    }
                } else if (ybarco + barcos[i] - 1 < barcosTablero.length && !horizontal) {
                    boolean pisaBarco = false;
                    for (int j = 0; j < barcos[i]; j++) {
                        if (barcosTablero[ybarco+j][xbarco] != -1) {
                            pisaBarco = true;
                        }
                    }
                    if (!pisaBarco) {
                        puedeColocarse = true;
                        for (int j = 0; j < barcos[i]; j++) {
                            barcosTablero[ybarco + j][xbarco] = i;
                        }
                    }
                }
            }
        }

        //CODIGO PARA IMPRIMIR EL TABLERO DE LOS BARCOS PARA DEBUGUEAR LA GENERACIÓN DE BARCOS
        /*
        for (int i = 0; i < barcosTablero.length; i++) {
            for (int j = 0; j < barcosTablero[i].length; j++) {
                if (barcosTablero[i][j] == -1) {
                    System.out.print(barcosTablero[i][j] + " ");
                } else {
                    if (barcosTablero[i][j] == 0) {
                        System.out.print(" " + yellow + barcosTablero[i][j] + " " + reset);
                    } else if (barcosTablero[i][j] == 1) {
                        System.out.print(" " + red + barcosTablero[i][j] + " " + reset);
                    } else if (barcosTablero[i][j] == 2) {
                        System.out.print(" " + purple + barcosTablero[i][j] + " " + reset);
                    } else if (barcosTablero[i][j]== 3) {
                        System.out.print(" " + green + barcosTablero[i][j] + " " + reset);
                    } else if (barcosTablero[i][j] == 4) {
                        System.out.print(" " + blue + barcosTablero[i][j] + " " + reset);
                    }
                }
            }
            System.out.println();
        }
        */

        // CODIGO PARA IMPRIMIR EL TABLERO DEL JUGADOR
        for (int i = 0; i < jugadorTablero.length; i++) {
            
        }

    }
}