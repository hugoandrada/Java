package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo07 {
     public static void main(String[] args) {
	       
    	 /* SE CARGAN POR TECLADO TRES NUMEROS DISTINTOS. MOSTRAR POR PANTALLA
    	  * EL NUMERO MAYOR
    	  */
    	 
    	 Scanner teclado = new Scanner(System.in);
    	 int num1,num2,num3;
    	 
    	 System.out.println("ingrese el primer valor: ");
    	 num1 = teclado.nextInt();
    	 
    	 System.out.println("ingrese el segundo valor: ");
    	 num2 = teclado.nextInt();
    	 
    	 System.out.println("ingrese el tercer valor: ");
    	 num3 = teclado.nextInt();
    	 
    	 if(num1>num2) {
    		 if(num1>num3) {
    			 System.out.println("el numero mayor es: "+num1);
    		 }else {
    			 System.out.println("el numero mayor es: "+num3);
    		 }
    	 }else {
    		 if(num2>num3) {
    			 System.out.println("el numero mayor es: "+num2);
    		 }else {
    			 System.out.println("el numeor mayor es: "+num3);
    		 }
    		 
    	 }
	}
}
