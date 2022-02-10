package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) {
		
    	/* SE INGRESAN POR TECLADO 3 NUMEROS, SI AL MENOS UNO ES MENOR A 10, IMPRIMIR
    	 * EN PANTALLA LA LEYENDA "ALGUNO DE LOS NUMEROS ES MENOR A 10"
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
    	
    	if (num1 < 10 || num2 < 10 || num3 < 10) {
    		System.out.println("alguno de los numeros es menor a 10");
    	}
	}
}
