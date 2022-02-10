package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo05 {
   public static void main(String[] args) {
	     
	   /* SE INGRESA UN CONJUNTO DE n ALTURAS DE PERSONAS POR TECLADO
	    * MOSTRAR LA ALTURA PROMEDIO DE LAS PERSONAS
	    */
	   Scanner teclado = new Scanner(System.in);
	   float altura;
	   float suma;
	   float promedio;
	   int x;
	   float n;
	   
	   suma = 0;
	   x = 1;
	   
	   System.out.println("ingrese la cantidad de personas: ");
	   n = teclado.nextFloat();
	   
	   while (x <= n) {
		   System.out.println("ingrese la altura");
		   altura = teclado.nextFloat();
		   suma = suma+altura;
		   x = x+1;
	   }
	   promedio = suma/n;
	   System.out.println("el promedio de altura es: "+promedio);
   }
}
