package Ejercicio4;

import java.util.Scanner;

public class Plantilla {
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int tipo;
	
		
	Empleado op1 = new Empleado();
	op1.clase1();
				
		System.out.println("TIPOS DE EMPLEADOS");
		System.out.println("1. Limpiadores");
		System.out.println("2. Comerciales");
		System.out.println("3. Administrativos");
		System.out.println("4. Encargados\n");
		
		System.out.println("Ingrese número de tipo de empleado");
		tipo =s.nextInt();
	
	//	SueldoM = SueldoB + extras;
		
		switch (tipo){
		case 1: {
			Limpiadores op2 = new Limpiadores();
			op2.clase2();
	//De el suelto según este tipo de trabajo
			break;
			
		}
		case 2: {
			Comerciales op3 = new Comerciales();
			op3.clase3();
			//De el suelto según este tipo de trabajo
			
			break;
		}
		case 3: {
			Administrativos op4 = new Administrativos();
			op4.clase4();
			//De el suelto según este tipo de trabajo

			break;
		}
		case 4: {
			Encargados op5 = new Encargados();
			op5.clase5();
			//De el suelto según este tipo de trabajo
			
		break;
		
		
		
	
	}
		}
}
}

		


