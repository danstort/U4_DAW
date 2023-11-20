import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int mat[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[0][i]+" ");
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[1][i]+" ");
        }

        System.out.println("");
        
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[2][i]+" ");
        }
        
        System.out.println("");
        
    }
}
