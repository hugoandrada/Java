package estructurascondicionales;

import java.util.Scanner;

public class Ejemplo06 {
	public static void main(String[] args) {
	     
		/* CONFECCIONAR UN PROGRAMA QUE PIDA POR TECLADO TRES NOTAS DE UN ALUMNO, CALCULE
		 * EL PROMEDIO E IMPRIMA ALGUNO DE ESOS MENSAJES:
		 * SI EL PROMEDIO ES >= 7 MOTRAR "PROMOCIONADO"
		 * SI EL PROMEDIO ES >= 4 MOSTRAR "REGULAR"
		 * SI EL PROMEDIO ES < 4 MOSTRAR "REPROBADO"
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int nota1,nota2,nota3;
		
		System.out.println("ingrese la primer nota");
		nota1 = teclado.nextInt();
		System.out.println("ingrese la segunda nota");
		nota2 = teclado.nextInt();
		System.out.println("ingrese la tercer nota");
		nota3 = teclado.nextInt();
		
		float promedio = (float)(nota1+nota2+nota3)/3;
		System.out.println("el promedio es: "+promedio);
		
		if(promedio >= 7) {
			System.out.println("promocionado");
		} else {
			if(promedio >= 4) {
				System.out.println("regular");
			}else {
				System.out.println("reprobado");
			}
		}
		
		
	}
}
