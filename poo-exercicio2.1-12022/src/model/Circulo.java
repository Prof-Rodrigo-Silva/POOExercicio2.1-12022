package model;

public class Circulo {
	float PI = 3.141592f;
	private float raio;
	private float areaDisco;
	private float circunferencia;
	private float superficie;
	private float volume;
	
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	public float getAreaDisco() {
		return areaDisco;
	}
	public float getCircunferencia() {
		return circunferencia;
	}
	public float getSuperficie() {
		return superficie;
	}
	public float getVolume() {
		return volume;
	}
		
	public float calcularAreaDisco() {	
		return this.areaDisco = PI*raio*raio;
	}
	
	public float calcularCircunferencia() {
		return this.circunferencia = 2*PI*raio; 
	}
	
	public float calcularSuperficie() {
		return this.superficie = 4*PI*raio*raio;
	}
	
	public float calcularVolume() {
		return this.volume = (4/3)*PI*raio*raio*raio;
	}

}
