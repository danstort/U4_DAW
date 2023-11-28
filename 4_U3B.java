import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String frase = tec.nextLine();

        int vocales = 0;
        int consonantes = 0;
        int dig = 0;
        int esp = 0;
        int otro = 0;

        for (int i = (frase.length() - 1); i >= 0; i--) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {

                vocales++;

            } else if (Character.isLetter(frase.charAt(i))) {

                consonantes++;
            }

            if (Character.isDigit(frase.charAt(i))) {

                dig++;

            }

            if (Character.isSpaceChar(frase.charAt(i))) {

                esp++;

            }

            
        }
        
        
        
        otro=frase.length()-(vocales + consonantes + dig + esp);
        
        System.out.print("Caracteres: "+(frase.length())+". Vocales: "+vocales + ". Consonantes: " + consonantes + ". Espacios: " + esp + ". Digitos: " + dig+". Resto: "+otro);
    }

}
