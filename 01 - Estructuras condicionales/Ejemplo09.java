package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo09 {
     public static void main(String[] args) {
		
    	 /* UN POSTULANTE A UN EMPLEO REALIZA UN TEST DE CAPACITACION, SE OBTUVO LA SIGUIENTE INFORMACION:
    	  * CANTIDAD TOTAL DE PREGUNTAS QUE SE LE REALIZARON Y LA CANTIDAD DE PREGUNTAS QUE CONTESTO CORRECTAMENTE,
    	  * SE PIDE CONFECCIONAR UN PROGRAMA QUE INGRESE LOS DOS DATOS POR TECLADO E INFORME EL NIVEL DEL MISMO,
    	  * SEGUN EL PORCENTAJE DE RESPUESTAS CORRECTAS QUE HA OBTENIDO, SABIENDO QUE:
    	  * 
    	  *     NIVEL MAXIMO = PORCENTAJE >= 90%
    	  *     NIVEL MEDIO = PORCENTAJE >= 75% Y <90%
    	  *     NIVEL REGULAR = PORCENTAJE >= 50% Y < 75%
    	  *     FUERA DE NIVEL = PORCENTAJE < 50%
    	  */
    	 Scanner teclado = new Scanner(System.in);
    	 
    	 int totalPreguntas;
    	 int totalCorrectas;
    	 int porcentaje;
    	 
    	 System.out.println("cantidad total de preguntas: ");
    	 totalPreguntas = teclado.nextInt();
    	 System.out.println("cantidad de preguntas correctas:");
    	 totalCorrectas = teclado.nextInt();
    	 
    	 porcentaje = totalCorrectas*100/ totalPreguntas;
    	 
    	 if (porcentaje >= 90) {
    		 System.out.println("nivel maximo");
    	 }else {
    		 if (porcentaje >= 75) {
    			 System.out.println("nivel medio");
    		 }else {
    			 if (porcentaje >= 50) {
    				 System.out.println("nivel regular");
    			 }else {
    				 System.out.println("nivel regular");
    			 }
    		 }
    	 }
    	 
    	 
	}
}
