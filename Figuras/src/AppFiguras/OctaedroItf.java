package AppFiguras;

public interface OctaedroItf extends Validar{

	
	default void Octaedro() {
		Double lado=0.0, area=0.0, volumen=0.0;
		System.out.println("Ingrese el lado: ");
	    lado = ComprobarDouble(lado, "Lado");
	  
	    area = 2*Math.pow(lado, 2)*Math.sqrt(3);
	    volumen = (Math.sqrt(2)/3)*Math.pow(lado, 3);
	    System.out.println("El area es: "+ area);
	    System.out.println("El volumen es: "+ volumen);
		
	} 
}
