import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int ar[] = new int[7];
        int cont = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = tec.nextInt();
           
        }
        
        for (int i = 0; i < ar.length; i++) {
            
            if(ar[i] >= 18){
            cont++;
            }
           
        }
        System.out.print("Mayores de edad="+cont);

    }
}
