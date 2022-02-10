package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo03 {
      public static void main(String[] args) {
		/*
		 * REALIZAR UN PROGRAMA QUE LEA POR TECLADO DOS NUMEROS, SI EL PRIMERO ES MAYOR AL SEGUNDO,
		 * INFORMAR SU SUMA Y DIFERENCIA, EN CASO CONTRARIO INFORMAR EL PRODUCTO Y LA DIVISION DEL PRIMER NUMERO
		 * RESPECTO AL SEGUNDO. 
		 */
    	  Scanner teclado = new Scanner(System.in);
    	  int num1, num2;
    	  int suma, diferencia;
    	  int producto,division;
    	  
    	  System.out.println("ingrese el primer valor: ");
    	  num1 = teclado.nextInt();
    	  System.out.println("ingrese el segundo valor: ");
    	  num2 = teclado.nextInt();
    	  
    	  if (num1 > num2 ) {
    		  
    		  suma = num1+num2;
    		  diferencia = num1-num2;
    		  System.out.println("la suma es: "+suma);
    		  System.out.println("la diferencia es: "+diferencia);
    		  
    	  } else {
    		  
    		  producto = num1*num2;
    		  division = num1 / num2;
    		  System.out.println("el producto es: "+producto);
    		  System.out.println("la division es: "+division);
    	  }
    
	}
}
