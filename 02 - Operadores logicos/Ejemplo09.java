package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo09 {
   public static void main(String[] args) {
	    
	   /* ESCRIBIR UN PROGRAMA EN EL CUAL DADA UNA LISTA DE VALORES NUMERICOS DISTINTOS,
	    * SE CALCULE E INFORME SU RANGO DE VARIACION (DEBE MOSTRAR EL MAYOR Y EL MENOR DE ELLOS)
	    */
	   Scanner teclado = new Scanner(System.in);
	   int num1;
	   int num2;
	   int num3;
	   
	   System.out.println("ingrese el primer valor");
	   num1 = teclado.nextInt();
	   System.out.println("ingrese el segundo valor");
	   num2 = teclado.nextInt();
	   System.out.println("ingrese el tercer valor");
	   num3 = teclado.nextInt();
	   
	   if (num1<num2 && num1<num3) {
		   System.out.println(num1);
	   }else {
		   if(num2<num3) {
			   System.out.println(num2);
		   }else {
			   System.out.println(num3);
		   }
	   }
	   
	   if(num1>num2 && num1>num3) {
		   System.out.println(num1);
	   }else {
		   if(num2>num3) {
			   System.out.println(num2);
		   }else {
			   System.out.println(num3);
		   }
	   }
	   
   }
}
