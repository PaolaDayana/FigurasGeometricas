package AppFiguras;

public interface ConoItf extends Validar{
	
	default void Cono() {
		Double altura = 0.0, radio = 0.0, generatriz = 0.0, arealateral = 0.0, areatotal = 0.0, volumen = 0.0;
		Double alturabase = 0.0;

		System.out.println("Ingrese la altura: ");
		altura = ComprobarDouble(altura, "Alura");

		System.out.println("Ingrese el radio: ");
		radio =ComprobarDouble(radio, "Radio");

		alturabase = Math.pow(radio, 2) + Math.pow(altura, 2);

		generatriz = Math.sqrt(alturabase);

		arealateral = Math.PI * radio * generatriz;

		areatotal = Math.PI * radio * (generatriz + radio);

		volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;
		System.out.println("El area total es: " + areatotal);
		System.out.println("El area lateral es: " + arealateral);
		System.out.println("El volumen es: " + volumen);

	}
}
