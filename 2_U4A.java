import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int mat[][] = new int[5][2];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = tec.nextInt();

            }

        }
        
        System.out.print("fila 1: "+mat[1][0]+","+mat[1][1]+",fila 3: "+mat[3][0]+","+mat[3][1]+",");

       
    }
}
