import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        String frase = tec.nextLine();
        
        int esp = 0;
        
        for (int i = (frase.length() - 1); i >= 0; i--) {
            
            if (Character.isSpaceChar(frase.charAt(i))) {
                
                esp++;
            }
            
        }
        
        System.out.print("Espacios: "+esp);
        
    }
    
}
