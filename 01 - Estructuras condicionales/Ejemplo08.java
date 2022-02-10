package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo08 {
    public static void main(String[] args) {
		 
    	 /* CONFECCIONAR UN PROGRAMA QUE PERMITA CARGAR UN NUMERO ENTERO POSITIVO DE HASTA TRES CIFRAS Y MUESTRE
    	  * UN MENSAJE INDICANDO SI TIENE 1,2 O 3 CIFRAS, MOSTRAR UN MENSAJE DE ERROR SI EL NUMERO DE CIFRAS ES
    	  * MAYOR.
		  */
    	Scanner teclado = new Scanner(System.in);
    	int numero;
    	
    	System.out.println("ingrese un numero positivo de hasta 3 cifras: ");
    	numero = teclado.nextInt();
    	
    	if (numero < 10 ) {
    		System.out.println("el numero tiene una cifra");
    	} else {
    		if (numero < 100) {
    			System.out.println("el numero tiene dos cifras");
    		}else {
    			if (numero < 1000) {
    				System.out.println("el numero tiene tres cifras");
    			}else {
    				System.out.println("error en el ingreso de datos.");
    			}
    		}
    	}
	}
}
