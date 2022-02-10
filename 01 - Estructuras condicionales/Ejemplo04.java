package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo04 {
      public static void main(String[] args) {
		/*
		 *SE INGRESAN TRES NOTAS DE UN ALUMNO, SI EL PROMEDIO ES MAYOR O IGUALA SIETE,
		 *MOSTRAR UN MENSAJE "PROMOCIONADO" 
		 */
    	  Scanner teclado = new Scanner(System.in);
    	  
    	  int nota1,nota2,nota3;
    	  int promedio;
    	  
    	  System.out.println("ingrese la primer nota: ");
    	  nota1 = teclado.nextInt();
    	  System.out.println("ingrese la segunda nota: ");
    	  nota2 = teclado.nextInt();
    	  System.out.println("ingrese la tercer nota: ");
    	  nota3 = teclado.nextInt();
    	  
    	  promedio = (nota1+nota2+nota3) / 3;
    	  
    	  if (promedio >= 7) {
    		  System.out.println("el alumno esta promocionado.");
    	  }
	}
}
