import java.util.Scanner;
 
public class Aplicacion5 {
	/*5. Cree un programa que muestre los números naturales de 1 a n. Use ciclo while.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num1 = entrada.nextInt();
		int contador = 1;
		
		while (contador <= num1) {
			System.out.println("Contador: " + contador);
			contador++;

	}
	}
}
