import java.util.Scanner;

public class Aplicacion8 {
	/*8. Cree un programa que muestre los números impares entre 1 y n.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int n = entrada.nextInt();
		
		for (int i = 1; i<= n; i++) {
			if (i % 2 !=0) {
				System.out.println(i);
			}
		
		

	}
	}
}
