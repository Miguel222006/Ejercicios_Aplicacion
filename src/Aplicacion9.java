import java.util.Scanner;

public class Aplicacion9 {
	/*9. Cree un programa que pregunte al usuario si desea salir, si o no “S/N”, si el usuario teclea la letra
S el programa se detendrá, de lo contrario continuará ejecutándose.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String conf = "";

		do {
			System.out.println("¿Desea salir del programa?");
			conf = entrada.nextLine();
			
		}while (conf.contains("n"));
		System.out.println("Saliendo del programa");
		
		
		
	}
}
