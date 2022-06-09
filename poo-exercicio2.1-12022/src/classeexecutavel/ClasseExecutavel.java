package classeexecutavel;

import model.Circulo;
import model.Retangulo;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		circulo.setRaio(5.56f);
		
		System.out.println("Área do Círculo: "+circulo.calcularAreaDisco());
		System.out.println(circulo.getAreaDisco());
		System.out.println("Circunferência: "+circulo.calcularCircunferencia());
		System.out.println("Superficie: "+circulo.calcularSuperficie());
		System.out.println("Volume: "+circulo.calcularVolume());
		
		System.out.println("-------------------------------------");
		Retangulo retangulo = new Retangulo();
		System.out.println("Área do Retângulo: "+retangulo.calcularArea(2, 4));
		System.out.println(retangulo.getArea());
		System.out.println("Perímentro: "+retangulo.calcularPerimetro(2, 4));
	}
	
	
}
