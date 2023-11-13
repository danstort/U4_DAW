import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int ar[] = new int[9];
        int cont = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = tec.nextInt();
           
        }
        
         System.out.print(ar[0]*2+", "+ar[1]*2+", "+ar[2]*2+", "+ar[3]*2+", "+ar[4]*2+", "+ar[5]*2+", "+ar[6]*2+", "+ar[7]*2+", "+ar[8]*2);
       

    }
}
