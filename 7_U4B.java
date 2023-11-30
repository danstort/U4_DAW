import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String a = tec.nextLine();
        String b = tec.nextLine();
        String frase = "";

        for (int i = 0; i<Math.min(a.length(), b.length()); i++) {

            frase = frase + a.charAt(i) + b.charAt(i);
        }

         if (a.length() > b.length()) {
            frase += a.substring(b.length());
        } else {
            frase += b.substring(a.length());
        }
        
        System.out.print("Intercalada: "+frase);

    }

}
