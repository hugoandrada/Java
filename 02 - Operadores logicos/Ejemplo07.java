package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo07 {
    public static void main(String[] args) {
		
    	/* ESCRIBIR UN PROGRAMA QUE PIDA INGRESAR LA COORDENADA DE UN PUNTO EN EL PLANO,
    	 * ES DECIR DOS VALORES ENTEROS, X y Y (DISTINTOS A CERO)
    	 * POSTERIORMENTE IMPRIMIR EN PANTALLA EN QUE CUADRANTE SE UBICA DICHO PUNTO
    	 * (1er CUADRANTE SI X>0 Y>0 - 2do CUADRANTE: X <0, Y>0, ETC)
    	 */
    	Scanner teclado = new Scanner(System.in);
    	int x;
    	int y;
    	
    	System.out.println("ingrese el valor de x: ");
    	x = teclado.nextInt();
    	System.out.println("ingrese el valor de y: ");
    	y = teclado.nextInt();
    	
    	if (x > 0 && y > 0) {
    		System.out.println("se encuentra en el primer cuadrante");
    	} else {
    		if (x < 0 && y > 0) {
    			System.out.println("esta en el segundo cuadrante");
    		}else {
    			if (x<0 && y<0) {
    				System.out.println("esta en el tercer cuadrante");
    			}else {
    				if(x>0 && y<0) {
    					System.out.println("esta en el cuarto cuadrante");
    				}else {
    					System.out.println("se encuentra en el eje");
    				}
    			}
    		}
    	}
	}
}
