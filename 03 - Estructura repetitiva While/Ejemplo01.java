package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
		 
    	/* ESCRIBO UN PROGRAMA QUE SOLICITE LA CARGA DE UN VALOR POSITIVO Y NOS MUESTRE
    	 * DESDE 1 HASTA EL VALOR INGRESADO DE UNO EN UNO.
    	 * EJEMPLO: SI INGRESAMOS 30 SE DEBE MOSTRAR LOS NUMEROS DEL UNO AL 30
    	 */
    	Scanner teclado = new Scanner(System.in);
    	int valor;
    	
    	System.out.println("ingrese un valor");
    	valor = teclado.nextInt();
    	
    	while( valor < 30) {
    		System.out.println(valor);
    		valor++;
    	}
	}
}
