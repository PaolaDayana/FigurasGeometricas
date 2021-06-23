package AppFiguras;

public interface TroncoPiramideItf extends Validar{
	
	
	default void TroncoDePiramide() {

		double altura=0.0,  perimetroB=0.0, perimetrob=0.0, apotema=0.0, ladoB=0.0, ladob=0.0,  arealateral=0.0, areasuperior=0.0, areainferior=0.0, areatotal=0.0, volumen=0.0; 
		
		System.out.println("Ingrese lado superior: ");
		ladoB = ComprobarDouble(ladoB, "Lado B");
		System.out.println("Ingrese el lado inferior: ");
		ladob= ComprobarDouble(ladob, "Lado b");
		System.out.println("Ingrese el apotema: ");
		apotema = ComprobarDouble(apotema, "Apotema");
		System.out.println("Ingrese la altura: ");
		altura = ComprobarDouble(altura, "Altura");
		
		perimetroB= 4*ladoB;
        perimetrob = 4*ladob;
		areasuperior= Math.pow(ladoB, 2);
		areainferior= Math.pow(ladob, 2);
		
		arealateral = ((perimetroB+perimetrob)/2)*apotema;
		areatotal = arealateral+areasuperior+areainferior;
		
		volumen = 0.33*altura*(areasuperior+areainferior+(Math.sqrt(areasuperior*areainferior)));
		System.out.println("El area lateral es: "+arealateral);
		System.out.println("El area total es: "+ areatotal);
		System.out.println("El volumen es: " + volumen);
		
		
	}
}
