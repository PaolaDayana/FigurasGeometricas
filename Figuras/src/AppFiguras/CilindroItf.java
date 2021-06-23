package AppFiguras;

public interface CilindroItf extends Validar  {

	

	default void Cilindro() {
	Double altura = 0.0, 
			radio = 0.0,
			arealateral = 0.0, 
			areatotal = 0.0, 
			volumen = 0.0;

		System.out.print("Ingrese la altura: ");
		
		altura = ComprobarDouble(altura, "altura");

		System.out.print("Ingrese el radio:");
		radio = ComprobarDouble(radio, "radio");
		
		arealateral = 2 * Math.PI * radio * altura;
		System.out.println("El area lateral es : " + arealateral);

		if(DeseaContinuar("Area total")==1) {
			areatotal = 2 * Math.PI * radio * (radio + altura);
			System.out.println("El area total es: " + areatotal);
			System.out.println();
		}
		
		if(DeseaContinuar("Volumen")==1) {
			volumen = Math.PI * Math.pow(radio, 2) * altura;
			System.out.println("El volumen es: " + volumen);
			System.out.println();
		}
		
		
	

	}

	
}
