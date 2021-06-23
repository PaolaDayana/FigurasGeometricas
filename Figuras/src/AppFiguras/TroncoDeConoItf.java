package AppFiguras;

public interface TroncoDeConoItf extends Validar{
	
	
	default void TroncoDeCono() {

		Double arealateral=0.0, areatotal=0.0, volumen=0.0, generatriz=0.0, radiomayor=0.0, radiomenor=0.0, altura=0.0, basemayorbasemenor=0.0 ;
		
		System.out.println("Ingrese generatriz: ");
		generatriz = ComprobarDouble(generatriz, "Generatriz");
		
		
		System.out.println("Ingrese radio mayor: ");
		radiomayor= ComprobarDouble(radiomayor,"Radio mayor");
		
		System.out.println("Ingrese el radio menor: ");
		radiomenor = ComprobarDouble(radiomenor, "Radio menor");
		
		System.out.println("Ingrese la altura: ");
		altura = ComprobarDouble(altura, "Altura");
		
		arealateral = Math.PI*generatriz*(radiomayor+radiomenor);
		
		
		basemayorbasemenor= (Math.PI*Math.pow(radiomayor, 2))+ Math.PI*Math.pow(radiomenor, 2);
		areatotal = arealateral+basemayorbasemenor;

		volumen =0.33* (Math.PI*altura*(Math.pow(radiomayor, 2)+Math.pow(radiomenor, 2)+(radiomenor*radiomayor)));
		System.out.println("El area lateral es: "+ arealateral);
		System.out.println("El area total es: "+ areatotal);
		System.out.println("El volumen es "+ volumen);
		
		
	}
}
