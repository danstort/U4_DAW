import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int ar[] = new int[12];
        int cont = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = tec.nextInt();
        }
        /**
         * El problema es que el índice de un array comienza en 0, no en 1.
         * Entonces, cuando i es igual a ar.length, estás intentando acceder al
         * elemento ar[ar.length], que está fuera del rango del array. Para
         * corregir este error, simplemente cambia el operador > por >= . Esto
         * asegurará que nunca intentes acceder a un elemento del array que esté
         * fuera del rango
         */
        
        for (int i = ar.length - 1; i >= 0; i--) {

            System.out.print(ar[i] + " ");

        }

    }
}
