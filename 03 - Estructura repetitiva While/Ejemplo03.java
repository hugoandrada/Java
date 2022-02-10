package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo03 {
      public static void main(String[] args) {
		
    	/* UNA PLANTA QUE FABRICA PERFILES DE HIERRO POSEE UN LOTE DE 3 PIEZAS
    	 * CONFECCIONAR UN PROGRAMA QUE PIDA INGRESAR POR TECLADO LA CANTIDAD DE PIEZAS
    	 * A PROCESAR Y LUEGO INGRESE LA LONGITUD DE CADA PERFIL, SABIENDO QUE LA PIEZA
    	 * CUYA LONGITUD ESTE COMPRENDIDA EN EL RANGO DE 1,20 Y 1,30 SON APTAS, 
    	 * IMPRIMIR POR PANTALLA LA CANTIDAD DE PIEZAS APTAS QUE TIENE EL LOTE.
		 */
    	  Scanner teclado = new Scanner(System.in);
    	  int x;
    	  int cantidad;
    	  int n;
    	  float largo;
    	  
    	  x = 1;
    	  cantidad=0;
    	  
    	  System.out.println("cuantas piezas va a procesar:");
    	  n = teclado.nextInt();
    	  
    	  while (x <= n) {
    		  System.out.println("ingrese la medida de la pieza");
    		  largo = teclado.nextFloat();
    		  if (largo >= 1.20 && largo < 1.30) {
    			  cantidad = cantidad+1;
    		  }
    		  x++;
    	  }
    	  
    	  System.out.println("cantidad de piezas aptas: "+cantidad);
    	  
    	  
	}
}
