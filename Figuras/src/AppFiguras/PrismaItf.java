package AppFiguras;
public interface PrismaItf  extends Validar {



	default void PrismaCalculos() {		
		Double area = 0.0, 
				altura = 0.0,
				arealateral = 0.0, 
				apotema = 0.0, 
				areatotal = 0.0, 
				volumen = 0.0;

		System.out.print("Ingrese el area de una cara: ");
		area = ComprobarDouble(area, "area");

		System.out.print("Ingrese la altura del prisma: ");
		altura = ComprobarDouble(altura, "altura");

		arealateral = area * 5 * altura;

		System.out.print("Ingrese el apotema: ");
		apotema = ComprobarDouble(apotema, "apotema");

		areatotal = arealateral + (apotema * area * 5);

		System.out.print("El area lateral de un prisma es: ");
		System.out.println(arealateral);
		
		if(DeseaContinuar("Area total")==1) {
			System.out.println("El area total es: " + areatotal);
			System.out.println();
		}

		if (DeseaContinuar("Volumen")==1) {
		volumen = ((apotema * area * 5) / 2) * altura;
		System.out.println("El volumen es: " + volumen);
		}
		
		System.out.println("************************************************");
		System.out.println();
		
	}
}
