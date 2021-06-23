package AppFiguras;

public interface TetaedroItf extends Validar{

	
	default void Tetaedro() {
		
Double area=0.0, volumen=0.0, altura=0.0, lado=0.0 ;
		
		System.out.println("Ingrese cuanto mide el lado: ");
		lado = ComprobarDouble(lado, "Lado");
		
		area = Math.pow(lado, 2)*Math.sqrt(3);
		
		//formula de volumen
		volumen= (Math.sqrt(2)/12)*Math.pow(lado, 3);
		
		altura = lado*(Math.sqrt(6)/3);
		
		System.out.println("El area es: "+ area);
		System.out.println("El volumen es: "+ volumen);
		System.out.println("El altura es: "+ altura);
		
		
		
	}
}
