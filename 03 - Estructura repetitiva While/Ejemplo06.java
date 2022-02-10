package estructurascondicionales;
import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) {
		   
    	/* EN UNA EMPRESA TRABAJAN n (n INGRESAR POR TECLADO) EMPLEADOS CUYOS SUELDOS OSCILAN ENTRE 100
    	 * Y 500, REALIZAR UN PROGRAMA QUE LEA LOS SUELDOS QUE COBRA CADA EMPLEADO E INFORME CUANTOS EMPLEADOS
    	 * COBRAN ENTRE 100 Y 300 Y CUANTOS COBRAN MAS DE 300. ADEMAS EL PROGRAMA DEBERA INFORMAR EL IMPORTE
    	 * QUE GASTA LA EMPRESA EN SUELDOS AL PERSONAL
    	 */
    	Scanner teclado = new Scanner(System.in);
    	int cont1, cont2, x, n;
    	float sueldo, gastos;
    	
    	cont1 = 0;
    	cont2 = 0;
    	gastos = 0;
    	x = 1;
    	System.out.println("ingrese la cantidad de empleados");
    	n = teclado.nextInt();
    	
    	while (x <= n) {
    		System.out.println("ingrese el sueldo");
    		sueldo = teclado.nextFloat();
    		if (sueldo <= 300) {
    			cont1 = cont1+1;
    		} else {
    			cont2 = cont2+1;
    		}
    		gastos = gastos+sueldo;
    		x = x+1;
    	}
    	System.out.println("cantidad de empleados con sueldos menor o igual a 300 "+cont1);
    	System.out.println("cantidad de empleados con sueldos mayor a 300: "+cont2);
    	System.out.println("gasto total en sueldos : "+gastos);
	}
}
