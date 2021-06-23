package AppFiguras;
import java.util.Scanner;
public interface Validar {

	static Scanner leer = new Scanner(System.in);
	static  int opcion=0;

	
	
	default double ComprobarDouble(double a, String error) {
		do {
			while (!leer.hasNextDouble()) {

				System.out.print("Debe introducir solo numeros, vuelva a ingresar " + error + ": ");
				leer.next();

			}

			a = leer.nextDouble();

			if (a <= 0) {
				System.out.print("Debe ingresar un numero mayor que cero, vuelva a ingresar " + error + ": ");
			}
		} while (a <= 0);
		System.out.println();

		return a;

	}
	
	
	default int DeseaContinuar(String mensaje) {
		int opcion=0;
		do {
			System.out.println("Desea calcular "+mensaje+"? (1=si, 2=no)");
			while (!leer.hasNextInt()) {
				System.out.print("Debe introducir solo numeros, vuelva a ingresar la opcion: ");
				leer.next();
			}

			opcion = leer.nextInt();

			if (opcion <= 0 || opcion>2) {
				System.out.print("Debe ingresar una de las opciones disponibles, vuelva a intentarlo: ");
			}
		} while (opcion <= 0 || opcion>2);
		System.out.println();

		return opcion;
		
		
	}

	default  int ComprobarEntero(String error, int num) {

		do {
			while (!leer.hasNextDouble()) {

				System.out.print("Debe introducir solo numeros, vuelva a ingresar " + error + ": ");
				leer.next();

			}

			num = leer.nextInt();
		
			if (num <= 0) {
				System.out.print("Debe ingresar un numero mayor que cero, vuelva a ingresar " + error + ": ");
			}
		} while (num <= 0);
		System.out.println();

		return num;
}
	
	

}
