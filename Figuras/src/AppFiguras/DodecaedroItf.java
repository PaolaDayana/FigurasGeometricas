package AppFiguras;

public interface DodecaedroItf extends Validar {

default void Dodecaedro() {
		
		Double area=0.0, volumen=0.0, apent=0.0, lado=0.0, apotema=0.0; 
		
		System.out.println("Ingrese el lado: ");
		
		lado = ComprobarDouble(lado, "Lado");
	
		
		System.out.println("Ingrese el apotema: ");
		apotema =ComprobarDouble(apotema, "Apotema");
		  
		area = 3*Math.pow(lado, 2)*(Math.sqrt((25+10*Math.sqrt(5))   ));
		volumen = 0.25*(15+7*Math.sqrt(5))*Math.pow(lado, 3);
		apent = 2.5*lado*apotema;
		
		
		System.out.println("el area es: "+ area);
		System.out.println("El volumen es: "+ volumen);
		System.out.println("El apent es: "+ apent);
		

		
	}
	
	
}
