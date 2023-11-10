import java.util.Scanner;


/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int ar [] = new int[8];
       
        
        for (int i=0; i<ar.length; i++) {
        ar [i]=tec.nextInt();
       }
        
       for (int i=0; i<ar.length; i++) {
        System.out.print(ar[i]+" ");
       }
       
    }
}
