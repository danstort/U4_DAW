import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String cadena = tec.nextLine();
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        
        

        for (int ia = 0; ia < cadena.length(); ia++) {
            
            if(cadena.charAt(ia)=='a'||cadena.charAt(ia)=='A'){
            a++;
            } else if (cadena.charAt(ia)=='e'||cadena.charAt(ia)=='E'){
            e++;
            } else if (cadena.charAt(ia)=='i'||cadena.charAt(ia)=='I'){
            i++;
            } else if (cadena.charAt(ia)=='o'||cadena.charAt(ia)=='O'){
            o++;
            } else if (cadena.charAt(ia)=='u'||cadena.charAt(ia)=='U'){
            u++;
            }
           

        }

        System.out.print("Número de a: "+a+", numero de e: "+e+" numero de i: "+i+", numero de o: "+o+", número de u: "+u);

    }

}
