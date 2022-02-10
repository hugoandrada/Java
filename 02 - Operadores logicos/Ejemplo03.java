package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo03 {
       public static void main(String[] args) {
	   
       /* REALIZAR UN PROGRAMA QUE PIDA CARGAR UNA FECHA, LUEGO VERIFICAR SI DICHA
        * FECHA CORRESPONDE A NAVIDAD.
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
    	   
    	   if (dia ==25 && mes==12) {
    		   System.out.println("la fecha corresponde a navidad");
    	   }
	}
}
