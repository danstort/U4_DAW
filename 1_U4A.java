import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int mat[][] = new int[5][2];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = tec.nextInt();

            }

        }
        
        System.out.print("fila 0: "+mat[0][0]+","+mat[0][1]+",fila 2: "+mat[2][0]+","+mat[2][1]+",fila 4: "+mat[4][0]+","+mat[4][1]+", ");

       
    }
}
