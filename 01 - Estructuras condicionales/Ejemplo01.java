import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
		
    	/*estructura condicional simple
    	 * 
    	 * Ingresar el sueldo de una persona, si supera los 3000 pesos, mostrar
    	 * un mensaje en pantalla indicando que debe abonar impuestos.
    	*/
    	
    	Scanner teclado = new Scanner(System.in);
        float sueldo;
        System.out.println("ingrese el sueldo: ");
        sueldo = teclado.nextFloat();
        
        if ( sueldo > 3000 ) {
        	System.out.println("debe abonar impuestos.");
        }
	}
}
