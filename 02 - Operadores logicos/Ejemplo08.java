package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo08 {
    public static void main(String[] args) {
		
    	/* DE UN OPERARIO SE CONOCE SU SUELDO Y LOS ANIOS DE ANTIGUEDAD. SE PIDE CONFECCIONAR
    	 * UN PROGRAMA QUE LEA LOS DATOS DE ENTRADA E INFORME:
    	 * A) SI EL SUELDO ES INFERIOR A 500 Y SU ANTIGUEDAD SUPERIOR A 10 ANIOS, OTORGARLE UN AUMENTO
    	 *    DEL 20%, MOSTRAR EL SUELDO A PAGAR.
    	 * B) SI EL SUELDO ES INFERIOR A 500, PERO SU ANTIGUEDAD ES MENOR A 10 ANIOS, OTORGARLE UN AUMENTO
    	 *    DEL 5%
    	 * C) SI EL SUELDO ES MAYOR O IGUAL A 500 MOSTRAR EL SUELDO EN PANTALLA SIN CAMBIOS.      
    	 */
    	Scanner teclado = new Scanner(System.in);
    	float sueldo;
    	int antiguedad;
    	
    	System.out.println("ingrese el sueldo: ");
    	sueldo = teclado.nextFloat();
    	System.out.println("ingrese la antiguedad:");
    	antiguedad = teclado.nextInt();
    	
    	if (sueldo < 500 && antiguedad >= 10) {
    		float aumento = sueldo*0.20f;
    		float sueldoPagar = sueldo+aumento;
    		System.out.println("el sueldo a pagar es "+sueldoPagar);
    	}else {
    		if (sueldo < 500) {
    			float aumento = sueldo*0.05f;
    			float sueldoPagar = sueldo+aumento;
    			System.out.println("sueldo a pagar es: "+sueldoPagar);
    		}else {
    			System.out.println("sueldo a pagar es: "+sueldo);
    		}
    	}
    	
	}
}
