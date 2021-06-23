package AppFiguras;

public interface HusoEsfericoItf extends Validar {
	
	default void Husoesferico() {
		
		Double area=0.0, volumen=0.0, radio=0.0, angulo=0.0;
		
		System.out.println("Ingrese el radio: ");
		radio = ComprobarDouble(radio, "Radio");
		
		System.out.println("Ingrese el angulo: ");
		angulo = ComprobarDouble(angulo, "Angulo");
		
		area = (4*Math.PI*Math.pow(radio, 2)*angulo)/360;
		volumen = 1.333* (    ( Math.PI*Math.pow(radio, 3)*angulo)/360);
		
		System.out.println("El area es: "+ area);
		System.out.println("El volumen es: "+ volumen);
		
		
		
	}
}
