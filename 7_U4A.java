import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int mat[][] = new int[3][2];

        for (int j = 0; j < mat[2].length; j++) {

            mat[0][j] = tec.nextInt();
        }

        for (int j = 0; j < mat[2].length; j++) {

            mat[1][j] = tec.nextInt();
        }

        for (int j = 0; j < mat[2].length; j++) {

            mat[2][j] = tec.nextInt();
        }

        System.out.println("LISTADO EDAD Y PESO");
        
        System.out.print("Cliente1	");
        
        for (int j = 0; j < mat[0].length; j++) {

            System.out.print(mat[0][j] + "	");

        }
        
        System.out.print("\n");
        System.out.print("Cliente2	");

        for (int j = 0; j < mat[0].length; j++) {

            System.out.print(mat[1][j] + "	");
        }
        
        System.out.print("\n");
        System.out.print("Cliente3	");

        for (int j = 0; j < mat[0].length; j++) {

            System.out.print(mat[2][j] + "	");
        }
        
        System.out.print("\n");
        
        System.out.println("Media de peso de mis clientes es: "+(mat[0][1]+mat[1][1]+mat[2][1])/3);
        

    }

}
