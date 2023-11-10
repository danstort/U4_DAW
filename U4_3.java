import java.util.Scanner;


/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int ar [] = new int[5];
        int cont = 0;
       
        
        for (int i=0; i<ar.length; i++) {
        ar [i]=tec.nextInt();
       }
        
       for (int i=0; i<ar.length; i++) {
        
           if (ar[4]<ar[i]){
               cont++;
           }
        
       }
       
        System.out.print("Hay "+cont+" mayores que el último");  
    }
}
