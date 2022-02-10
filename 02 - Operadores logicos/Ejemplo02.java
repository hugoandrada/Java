package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
		
    	/* SE CARGA UNA FECHA (DIA,MES,ANIO) POR TECLADO, MOSTRAR UN MENSAJE SI CORRESPONDE
    	 * AL PRIMER TRIMESTRE DEL ANIO(ENERO,FEBRERO,MARZO) CARGAR POR TECLADO EL VALOR NUMERICO
    	 * DEL DIA,MES Y ANIO. EJEMPLO:
    	 *     DIA: 10
    	 *     MES: 5
    	 *     ANIO: 2022
    	 */
    	Scanner teclado = new Scanner(System.in);
    	int dia;
    	int mes;
    	int anio;
    	
    	System.out.println("ingrese un dia");
    	dia = teclado.nextInt();
    	System.out.println("ingrese un mes");
    	mes = teclado.nextInt();
    	System.out.println("ingrese un anio");
    	anio = teclado.nextInt();
    	
    	if (mes == 1 || mes == 2 || mes == 3) {
    		System.out.println("es el primer trimestre del anio");
    	}
	}
}
