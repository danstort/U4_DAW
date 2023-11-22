import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int mat[][] = new int[3][5];

        for (int j = 0; j < mat[2].length; j++) {

            mat[0][j] = tec.nextInt();
        }

        for (int j = 0; j < mat[2].length; j++) {

            mat[1][j] = tec.nextInt();
        }

        for (int j = 0; j < mat[2].length; j++) {

            mat[2][j] = tec.nextInt();
        }

        System.out.println("LISTADO DE NOTAS DE 1DAW");
        
        System.out.print("Alumno1	");
        
        for (int j = 0; j < mat[0].length; j++) {

            System.out.print(mat[0][j] + "	");

        }
        
        System.out.print("\n");
        System.out.print("Alumno2	");

        for (int j = 0; j < mat[0].length; j++) {

            System.out.print(mat[1][j] + "	");
        }
        
        System.out.print("\n");
        System.out.print("Alumno3	");

        for (int j = 0; j < mat[0].length; j++) {

            System.out.print(mat[2][j] + "	");
        }
        
        System.out.print("\n");
        
        System.out.println("Media del módulo 1: "+(mat[0][0]+mat[0][1]+mat[0][2])/3);
        System.out.println("");
        

    }

}
