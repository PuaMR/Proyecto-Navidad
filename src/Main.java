import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Array para el tamaño de los barcos. solo pueden haber 5 barcos de estos tamaños específicos
        int[] barcos = {5, 4 ,3 , 3, 2};
        char[][] JugadorTablero = new char[10][10];
        char[][] BarcosTablero = new char[10][10];
        int MAX_SHOTS = 32;
        // para hacer que los barcos se pongan vertical u horizontal puedo hacer que se elija un 0
        // o un 1, siendo 0 horizontal y 1 vertical. Luego proceder a la  colocación del barco
    }
}