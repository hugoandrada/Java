package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo01 {
     public static void main(String[] args) {
		
    	 /* CONFECCIONAR UN PROGRAMA QUE LEA POR TECLADO TRES NUMEROS
    	  * Y NOS MUESTRE EL MAYOR.
    	  */
    	 Scanner teclado = new Scanner(System.in);
    	 
    	 int num1;
    	 int num2;
    	 int num3;
    	 
    	 System.out.println("ingrese el primer valor: ");
    	 num1 = teclado.nextInt();
    	 System.out.println("ingrese el segundo valor: ");
    	 num2 = teclado.nextInt();
    	 System.out.println("ingrese el tercer valor: ");
    	 num3 = teclado.nextInt();
    	 
    	 if (num1 > num2 && num1 > num3) {
    		 System.out.println("el mayor es: "+num1);
    	 }else {
    		 if (num2 > num1 && num2 > num3) {
    			 System.out.println("el mayor es: "+num2);
    		 }else {
    			 if (num3 >num1 && num3>num2) {
    				 System.out.println("el mayor es: "+num3);
    			 }
    		 }
    	 }
	}
}
