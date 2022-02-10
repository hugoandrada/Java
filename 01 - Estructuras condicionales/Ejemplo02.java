import java.util.Scanner;

public class Ejemplo02 {
       public static void main(String[] args) {
    	   
		   /* ESTRUCTURA CONDICIONAL COMPUESTA
		    * 
		    * SOLICITAR INGRESAR DOS NUMEROS DISTINTOS Y MUESTRE 
		    * POR PANTALLA EL NUMERO MAYOR.
		    */
    	   
    	   Scanner teclado = new Scanner(System.in);
    	   System.out.println("ingrese el primer valor: ");
    	   int num1 = teclado.nextInt();
    	   System.out.println("ingrese el segundo valor: ");
    	   int num2 = teclado.nextInt();
    	   
    	   if (num1 > num2) {
    		   System.out.println("el numero mayor es: "+num1);
    	   } else {
    		   System.out.println("el numero mayor es: "+num2);
    	   }
	}
}
