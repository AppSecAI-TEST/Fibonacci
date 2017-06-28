package programa;
import java.util.Scanner;

/**
 * @version 0.0.1
 * @author radge
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] serie = inicializarSerie();
        fibonacci(serie);
        imprimirArray(serie);
    }

    private static int promptNumero() {
        System.out.print("Introduce el tamaño de la serie: ");
        return scanner.nextInt();
    }

    private static void imprimirArray(int[] array) {
        for(int elemento : array) {
            System.out.printf("%d ", elemento);
        }
        System.out.println();
    }

    private static void fibonacci(int[] serie) {
        for(int i = 2; i < serie.length; i++) {
            serie[i] = generarElementoFibo(serie, i);
        }
    }

    private static int[] inicializarSerie(int tamano) {
        int[] serie = new int[tamano];
        serie[1] = 1;
        return serie;
    }

    private static int[] inicializarSerie() {
        int tamano = promptNumero();
        return inicializarSerie(tamano);

    }

    private static int generarElementoFibo(int[] serie, int indexElemento) {
        int elementoAnterior1 = serie[indexElemento - 1];
        int elementoAnterior2 = serie[indexElemento - 2];
        return elementoAnterior1 + elementoAnterior2;
    }
}
