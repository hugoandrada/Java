package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo09 {
     public static void main(String[] args) {
		
    	 /* REALIZAR UN PROGRAMA QUE PERMITA CARGAR DOS LISTAS DE 15 VALORES CADA UNA, INFORMAR 
    	  * CON UN MENSAJE CUAL DE LAS DOS LISTAS TIENE UN VALOR ACUMULADO MAYOR ( MENSAJE= "LISTA 1 MAYOR"
    	  * LISTA 2 MAYOR, LISTAS IGUALES)
    	  * TENER EN CUENTA QUE PUEDE HABER DOS O MAS ESTRUCTURAS REPETITIVAS EN UN ALGORITMO
    	  */
    	 Scanner teclado = new Scanner(System.in);
    	 int sum1 =0;
    	 int sum2=0;
    	 int valor;
    	 int x = 0;
    	 
    	 while(x <= 15) {
    		 System.out.println("ingrese un valor");
    		 valor = teclado.nextInt();
    		 sum1 = sum1+valor;
    		 x++;
    	 }
    	 x=1;
    	 
    	 while(x <=15) {
    		 System.out.println("ingrese la segunda lista");
    		 valor = teclado.nextInt();
    		 sum2 = sum2+valor;
    		 x++;
    	 }
    	 if (sum1>sum2) {
    		 System.out.println("lista 1 es mayor");
    	 }else {
    		 if (sum2>sum1) {
    			 System.out.println("lista 2 es mayor");
    		 }else {
    			 System.out.println("listas iguales");
    		 }
    	 }
    	 
	}
}
