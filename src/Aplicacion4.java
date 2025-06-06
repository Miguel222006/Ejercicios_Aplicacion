import java.util.Scanner;

public class Aplicacion4 {
	/*4. 3. Cree un programa que calcule el promedio de tres notas para n estudiantes. Use ciclo for. Use
funciones.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de estudiantes:");
		int estud = entrada.nextInt();
		
		System.out.println("Ingrese primer nota:");
		double n1 = entrada.nextDouble();
		
		System.out.println("Ingrese segunda nota:");
		double n2 = entrada.nextDouble();
		
		System.out.println("Ingrese tercera nota:");
		double n3 = entrada.nextDouble();
		
		double promedio = (n1 + n2 + n3) / 3;
		System.out.println("El promedio es: " + promedio);
		
		for (int i = 0; i <= estud; i++); {
			System.out.println();
		}
		
		
		

	}

}
