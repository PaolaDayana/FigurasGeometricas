package AppFiguras;

public interface IcosaedroItf extends Validar {

	default void Icosaedro() {
		
		 Double area=0.0, lado=0.0, volumen=0.0;
				 
				 System.out.println("Ingrese el lado: ");
				 lado = ComprobarDouble(lado, "Lado");
				 
				 
				 area = 5 * Math.pow(lado, 2)* Math.sqrt(3);
				 volumen = 0.4166*(3*Math.sqrt(5))*Math.pow(lado, 3);
				 
				 System.out.println("El area es: "+ area);
				 System.out.println("El volumen es: "+ volumen);

				
			}
}
