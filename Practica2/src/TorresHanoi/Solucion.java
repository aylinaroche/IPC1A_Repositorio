package TorresHanoi;

import java.util.Scanner;
//import Tutorial.Hanoi;

public class Solucion {

	public void Hanoi(int num, int inicio, int temp, int fin){
		
		if (num ==1){
			System.out.println("Moviendo de torre inicio "+ inicio +" a la torre de destino " + fin);
			
		} else {
			Hanoi(num-1, inicio, fin, temp);
			System.out.println("Moviendo de torre inicio "+ inicio +" a la torre de destino " + fin);
			Hanoi(num-1, temp, inicio, fin);
			
		}
		
	}
	
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n;
	
	System.out.println("Ingrese el número de aros");
   n = s.nextInt();
   Solucion h = new Solucion();
   
   h.Hanoi(n, 1, 2, 3);
   
}

}

