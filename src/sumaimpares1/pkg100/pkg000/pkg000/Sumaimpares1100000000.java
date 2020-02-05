
package sumaimpares1.pkg100.pkg000.pkg000;

public class Sumaimpares1100000000 {

    public static void main(String[] args) {
      
        
        System.out.println("sumar los numeros impares entre 1 hasta 100.000.000");
        
        long sumaimpares=0;
        for (int i=1; i <= 100000000; i++) 
        {
            if (i%2==1) 
            {
               sumaimpares=sumaimpares+i; 
            }
        } 
        System.out.println("La suma de los impares entre 1 hasta 100.000.000 es de: " +sumaimpares);
    }
       
      
}
