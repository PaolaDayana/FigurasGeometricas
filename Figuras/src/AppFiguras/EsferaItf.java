package AppFiguras;

public interface EsferaItf extends Validar{
	
	
default void Esfera() {
		
		//Estas son las variables para la esfera entera
				Double radio=0.0, area=0.0, volumen=0.0;
				
				//Estas son las variables de la zona esferica
				Double radiozonaesferica=0.0, areadezonaesferica=0.0, alturazonaesferica=0.0, volumendezonaesferica=0.0;
				
				//Esta son las variables del casquete esferico
				Double alturadecasquete=0.0, areadecasquete=0.0, volumendecasquete=0.0;
				
			
				System.out.println("Ingrese el radio: ");
				radio= ComprobarDouble(radio, "Radio");
				 
				 area=4*Math.PI*Math.pow(radio, 2);
				 volumen=(4/3)*Math.PI*Math.pow(radio,3);
				 
				
				
				
				System.out.println("Ingrese el radio mayor: ");
				radiozonaesferica =ComprobarDouble(radiozonaesferica, "Radio de la zona esferica");
				System.out.println("Ingrese la altura: ");
				alturazonaesferica =ComprobarDouble(alturazonaesferica,"Altura de la zona esferica");
				
				areadezonaesferica = Math.PI*2*radiozonaesferica*alturazonaesferica;
				
				volumendezonaesferica = (Math.PI*alturazonaesferica* (Math.pow(alturazonaesferica, 2)+(3*Math.pow(radio, 2))+3*Math.pow(radiozonaesferica, 2)))/6 ;
				
				
				System.out.println("Ingrese la altura de casquete esferico: ");
				alturadecasquete = ComprobarDouble(alturadecasquete, "Altura del casquete");
				
				areadecasquete = 2*Math.PI*radio*alturadecasquete;
				volumendecasquete =( Math.PI*Math.pow(alturadecasquete, 2)*((3*radio)-alturadecasquete))/3;
				

				System.out.println("El area es: "+ area);
				System.out.println("El volumen es: "+ volumen);
				System.out.println("El area de casquete es: "+ areadecasquete);
				System.out.println("El volumen de casquete es: "+ volumendecasquete);

		
	}
}
