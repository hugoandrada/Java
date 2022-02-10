package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo05 {
      public static void main(String[] args) {
    	  
		  /* SE INGRESA POR TECLADO UN NUMERO POSITIVO DE UNO O DOS DIGITOS(1..99)
		   * MOSTRAR UN MENSAJE INDICANDO SI EL NUMERO TIENE UNO O DOS DIGITOS.
		   * (TENER EN CUENTA QUE CONDICION DEBE CUMPLIRSE PARA TENER DOS DIGITOS, UN NUMERO ENTERO)
		   */
    	  
    	  Scanner teclado = new Scanner(System.in);
    	  int numero;
    	  
    	  System.out.println("ingrese un numero positivo: ");
    	  numero = teclado.nextInt();
    	  
    	  if(numero >= 10) {
    		  System.out.println("el numero ingresado tiene dos digitos.");
    	  } else {
    		  System.out.println("el numero ingresa tiene un solo digito.");
    	  }
    	  
	}
}
