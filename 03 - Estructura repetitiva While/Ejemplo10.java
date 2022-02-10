package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo10 {
     public static void main(String[] args) {
		  
    	 /* DESARROLLAR UN PROGRAMA QUE PERMITA LA CARGA DE n NUMEROS ENTEROS Y LUEGO NOS INFORME CUANTOS VALORES
    	  * FUERON PARES Y CUANTOS IMPARES.
    	  * EMPLEAR EL OPERADOR % EN LA CONDICION DE LA ESTRUCTURA CONDICIONAL
    	  * 
    	  * IF (VALOR %2==0) SI EL IF DA VERDADERO LUEGO ES PAR.
    	  */
    	 Scanner teclado = new Scanner(System.in);
    	 int par = 0;
    	 int impar = 0;
    	 int x = 1;
    	 int n;
    	 int valor;
    	 
    	 System.out.println("cuanto numeros ingresara");
    	 n = teclado.nextInt();
    	 
    	 while (x <=n) {
    		 System.out.println("ingrese un valor entero");
    		 valor = teclado.nextInt();
    		 if (valor%2==0) {
    			 par = par+1;
    		 }else {
    			 impar = impar+1;
    		 }
    		 x=x+1;
    	 }
    	 System.out.println("la cantidad de pares es: "+par);
    	 System.out.println("la cantidad de impares es: "+impar);
    	 
	}
}
