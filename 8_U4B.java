import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String cadena = tec.nextLine();
        int cont = 1;

        for (int i = 0; i < cadena.length(); i++) {

            if (Character.isSpaceChar(cadena.charAt(i))) {

                cont++;

            }

        }

        System.out.print("Número de palabras: "+cont);

    }

}
