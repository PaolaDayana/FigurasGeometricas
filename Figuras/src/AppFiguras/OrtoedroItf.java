package AppFiguras;

public interface OrtoedroItf  extends Validar{
	
	default void Ortoedro() {

		Double diagonal=0.0, area=0.0, volumen=0.0, ladoA=0.0, ladoB=0.0, ladoC=0.0;
		
		System.out.println("Ingrese el lado A: ");
		ladoA= ComprobarDouble(ladoA, "Lado A");
		
		System.out.println("Ingrese lado B: ");
		ladoB= ComprobarDouble(ladoB, "Lado B");
		
		System.out.println("Ingrese lado C: ");
		ladoC= ComprobarDouble(ladoC,"Lado C");
		
		diagonal = Math.sqrt(       Math.pow(ladoA, 2)+Math.pow(ladoB, 2)+Math.pow(ladoC, 2));
		area = 2*( (ladoA*ladoB)+(ladoA*ladoC)+(ladoB*ladoC));
		volumen = ladoA*ladoC;
		
		System.out.println("La diagonal es: "+ diagonal);
		System.out.println("El area es: "+ area );
		System.out.println("El volumen es: "+ volumen);
		

		
	}
}
