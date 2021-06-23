package AppFiguras;

public class App  implements Validar{

	


	public void ImprimirMenu() {

		System.out.println("");
		System.out.println("1. Prismas");
		System.out.println("2. Cilindro");
		System.out.println("3. Cono");
		System.out.println("4. Dodecaedro");
		System.out.println("5. Esfera");
		System.out.println("6. Hexaedro");
		System.out.println("7. Husoesferico");
		System.out.println("8. Icosaedro");
		System.out.println("9. Octaedro");
		System.out.println("10. Ortoedro");
		System.out.println("11. Piramide");
		System.out.println("12. Tetaedro");
		System.out.println("13. Tronco de cono");
		System.out.println("14. Tronco de piramide");
		System.out.println("15. Salir");
		System.out.print("Escriba su opcion: ");

	}
	
	public static void main(String[] args) {

		App a = new App();
		Figura f= new Figura();			
		int opcion=0;
		
		
		do {
		a.ImprimirMenu();
		
			switch (opcion=f.ComprobarEntero("Opcion",opcion)) {
		
		
		
		case 1:
			f.PrismaCalculos();
			break;

		case 2:
			f.Cilindro();
			break;
			
		case 3:
	f.Cono();
			break;
			
		case 4:
			f.Dodecaedro();
			break;
			
		case 5:
			f.Esfera();
			break;
			
		case 6:
			
			f.Hexaedro();
			break;
			
			
		case 7:
			f.Husoesferico();
			break;
			
		case 8:
			
			f.Icosaedro();
			break;
			
		case 9:
			
			f.Octaedro();
			break;
			
		case 10:
			
			f.Ortoedro();
			break;
			
			
		case 11:
			f.Piramide();
			break;
			
		case 12:
			f.Tetaedro();
			break;
			
		case 13:
			
			f.TroncoDeCono();
			break;
			
		case 14:
			f.TroncoDePiramide();
			break;
			
		default:
			break;
		}
		
		
		
		}while(opcion!=15);
		
		System.out.println("GRACIAS POR UTILIZAR MI PROGRAMA");
	}

	

}
