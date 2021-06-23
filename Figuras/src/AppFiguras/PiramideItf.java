package AppFiguras;

public interface PiramideItf extends Validar{
	
	default void Piramide() {
		Double base=0.0, altura=0.0, arealateral=0.0, areatotal=0.0, volumen=0.0;
		
		System.out.println("Ingrese la base: ");
		base = ComprobarDouble(base, "Base");
		System.out.println("Ingrese la altura: ");
		altura = ComprobarDouble(altura, "Altura");
		
		arealateral= ((base*altura)/2)*4;
		System.out.println("El area lateral es: " + arealateral);
			
			
			
			areatotal=Math.pow(base, 2)+arealateral;
			volumen = (Math.pow(base,2)*altura)/3;
			
			System.out.println("El area total es: "+ areatotal);
			System.out.println("El volumen es: " + volumen);	
		
	}
	
}
