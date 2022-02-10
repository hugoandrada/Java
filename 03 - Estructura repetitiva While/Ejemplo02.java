package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
		
    	/* DESARROLLAR UN PROGRAMA QUE PERMITA LA CARGA DE 10 VALORES POR TECLADO
    	 * Y NOS MUESTRE LA SUMA DE LOS VALORES INGRESADOS Y SU PROMEDIO.
    	 */
    	Scanner teclado = new Scanner(System.in);
    	int x;
    	int suma;
    	int valor;
    	int promedio;
    	
    	x =1;
    	suma =0;
    	
    	while(x <= 10) {
    		System.out.println("ingrese un valor: ");
    		valor = teclado.nextInt();
    		suma = suma+valor;
    		x++;
    	}
    	promedio = suma/10;
    	System.out.println("la suma de los 10 valores es "+suma);
    	System.out.println("el promedio es "+promedio);
	}
}
