import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int mat[][] = new int[5][2];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = tec.nextInt();

            }

        }
        
        System.out.print("columna 1: "+mat[0][1]+","+mat[1][1]+","+mat[2][1]+","+mat[3][1]+","+mat[4][1]+",");

       
    }
}
