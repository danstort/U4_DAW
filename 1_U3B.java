public class Ejercicio1 {

    public static void main(String[] args) {

        String first = "dabale arroz a la zorra el abad";
        
        String second = first.replaceAll(" ", "");

        
       
        
        StringBuffer third = new StringBuffer(second);
        second = third.reverse().toString();
        
        System.out.print(second);
        
        
    }

}
