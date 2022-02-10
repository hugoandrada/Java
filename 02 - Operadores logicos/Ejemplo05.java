package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo05 {
      public static void main(String[] args) {
		
    	  /* SE INGRESAN POR TECLADO TRES NUMEROS, SI TODOS LOS VALORES INGRESADOS
    	   * SON MENORES A 10, IMPRIMIR EN PANTALLA "TODOS LOS NUMEROS SON MENORES A 10"
    	   */
    	  Scanner teclado = new Scanner(System.in);
    	  int num1;
    	  int num2;
    	  int num3;
    	  
    	  System.out.println("ingrese el primer valor");
    	  num1 = teclado.nextInt();
    	  System.out.println("ingrse el segundo valor");
    	  num2 = teclado.nextInt();
    	  System.out.println("ingrese el tercer valor");
    	  num3 = teclado.nextInt();
    	  
    	  if (num1 < 10 && num2 < 10 && num3 < 10) {
    		  System.out.println("todos los numeros son menores a 10");
    	  }
	}
}
