package model;

public class Retangulo {
	
	private float area;
	private float perimentro;
	
	public float getArea() {
		return area;
	}
	public float getPerimentro() {
		return perimentro;
	}	
	public float calcularArea(float l1, float l2) {
		return this.area = l1*l2;
	}
	
	public float calcularPerimetro(float l1, float l2) {
		return this.perimentro = 2*l1 + 2*l2;
	}
}
