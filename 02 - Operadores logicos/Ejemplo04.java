package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo04 {
     public static void main(String[] args) {
             
    	     /* SE INGRESAN TRES VALORES POR TECLADO, SI TODOS SON IGUALES SE IMPRIME LA SUMA DEL 
    	      * PRIMERO CON EL SEGUNDO Y A ESTE RESULTADO LO MULTIPLICO POR EL TERCERO.
              */
    	 Scanner teclado = new Scanner(System.in);
    	 int num1;
    	 int num2;
    	 int num3;
    	 
    	 System.out.println("ingrese el primer valor");
    	 num1 = teclado.nextInt();
    	 System.out.println("ingrese el segundo valor");
    	 num2 = teclado.nextInt();
    	 System.out.println("ingrese el tercer valor");
    	 num3 = teclado.nextInt();
    	 
    	 if (num1 ==num2 && num1==num3) {
    		 int suma = num1+num2;
    		 int producto = suma*num3;
    		 System.out.println("el resultado de la suma de los dos primeros valores es: "+suma);
    		 System.out.println("el producto de la suma por el tercer valor es: "+producto);
    	 } else {
    		 System.out.println("son distintos");
    	 }
	}
}
