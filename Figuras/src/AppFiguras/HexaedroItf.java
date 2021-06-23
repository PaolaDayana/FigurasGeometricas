package AppFiguras;

public interface HexaedroItf extends Validar {

	default void Hexaedro() {
		
		 Double area=0.0, volumen=0.0, diagonal=0.0, lado=0.0;
	     
		    System.out.println("Ingrese el lado: ");
		    lado = ComprobarDouble(lado, "Lado");
		    
		    area = 6*Math.pow(lado, 2);
		    volumen = Math.pow(lado, 3);
		    diagonal = lado*Math.sqrt(3);
		    System.out.println("El area es: "+ area);
		    System.out.println("El volumen es: "+ volumen);
		    System.out.println("La diagonal es: "+ diagonal);
		
		
	}
	
}
