import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String a = tec.nextLine();
        
        String b = tec.nextLine();
        
        String c="";
        
        if (a.length()>b.length()){
        
            c=a;
            
        } else if (b.length()>a.length()){
        
            c=b;
            
        }
        
        System.out.print("La cadena más larga es:"+c);
        
        
        
    }

}
