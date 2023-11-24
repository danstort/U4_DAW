import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String a = tec.nextLine();
        
        a= a.replaceAll(" ", " ,");
        System.out.print(a);
        
        int cont=1;
        for(int i = 0; i<a.length(); i++){
        char b = a.charAt(i);
        if(b==' '){
            
           cont++; 
        }
        
        }
        
        //System.out.println(cont);
        
    }

}
