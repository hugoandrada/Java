package estructurascondicionales;

public class Ejemplo07 {
    public static void main(String[] args) {
		
    	/* REALIZAR UN PROGRAMA QUE IMPRIMA 25 TERMINOS DE LA SERIE 11 - 22 - 33 - 44, ETC
    	 * (NO SE INGRESAN VALORES POR TECLADO)
    	 */
    	int serie = 11;
    	int x = 1;
    	
    	while (x <= 25) {
    		System.out.println("serie: "+serie);
    		serie = serie+11;
    		x = x+1;
    	}
    	
	}
}
