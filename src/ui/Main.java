package ui;
import java.util.Arrays;





public class Main {

	public static void main(String[] args) { 
		
		int[] A = new int[] {5,3,2,4,9,7,6,8};
		
		

		Arrays.sort(A);
		
		for (int x = 0; x < A.length; x++) {
			System.out.println("numeros en la posicion " + x + " es " + A[x] +  " ");
		}
		
		int num_buscado = 8;
		int inicio=  0;
		int centro;
		int fin = A.length;
		
		while (inicio <= fin) {
			centro = (fin + num_buscado)/2;
			if (A[centro]== num_buscado) {
				
				System.out.println("el numero esta en la posicion " + centro);
				break;
			}else if (num_buscado<A[centro]) {
				fin = centro-1;
			}
			else {
				inicio = centro-1;
			}
			
		}
		
		
	}

}
