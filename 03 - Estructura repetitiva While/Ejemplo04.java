package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo04 {
     public static void main(String[] args) {
		
    	 /* ESCRIBIR UN PROGRAMA QUE SOLICITE INGRESAR 10 NOTAS DE ALUMNOS Y NOS INFORME
    	  * CUALES TIENEN NOTAS MAYORES O IGUALES A 7 Y CUALES MENORES.
    	  */
    	 Scanner teclado = new Scanner(System.in);
    	 int altas;
    	 int bajas;
    	 int x;
    	 int notas;
    	 
    	 altas=0;
    	 bajas=0;
    	 x=1;
    	 while (x <= 10 ) {
    		 System.out.println("ingrese una nota");
    		 notas = teclado.nextInt();
    		 if (notas >= 7) {
    			 altas = altas+1;
    		 }else {
    			 bajas = bajas+1;
    		 }
    		 x = x+1;
    	 }
    	 System.out.println("cantidad de alumnos con notas mayores a 7: "+altas);
    	 System.out.println("cantidad de alumnos con notas menores a 7: "+bajas);
    	 
    	 
	}
}
