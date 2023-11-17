import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        char ar[] = new char[7];
        int cont = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = tec.next().charAt(0);
           
        }
        
        for (int i = 0; i < ar.length; i++) {
            
            if(ar[i] =='a'){
            cont++;
            }
           
        }
        System.out.print("Vocales= "+cont);

    }
}
