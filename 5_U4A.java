import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int v1 = tec.nextInt();
        int v2, v3;

        char mat[][] = new char[v1][v1];

        v2 = v1 / 2;
        v3 = v1 - v2;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j = j + 2) {

                mat[i][j] = 'a';
            }
        }

        for (int i = 0; i < mat.length; i++) {

            for (int j = 1; j < mat[i].length; j = j + 2) {

                mat[i][j] = 'b';
            }
        }

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + " ");

            }

            System.out.println("");
        }

        System.out.println("");

    }

}
