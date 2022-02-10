package estructurascondicionales;

public class Ejemplo08 {
    public static void main(String[] args) {
		
    	/* MOSTRAR LOS MULTIPLOS DE 8 HASTA EL VALOR DE 500
    	 * DEBE APARECER EN PANTALLA 8, 16, 24, ETC.
    	 */
    	int multiplo = 8;
    	
    	while (multiplo <= 500) {
    		System.out.println("multiplos de 8: "+multiplo);
    		multiplo = multiplo+8;
    	}
	}
}
