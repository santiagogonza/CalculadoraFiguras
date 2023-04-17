/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */

package figura;

//Clase Circulo
public class Circulo extends Figura2D {
	//atributo del circulo
	private double radio;
	//constructor de clase circulo con parametros
	public Circulo(double radio, String color, String material) {
		super(color, material);
		setRadio(radio);
	}
	//métodos set y get
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
		super.setRadio(radio);
	}

	//método para calcular el area del circulo
	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	//método para calcular el perimetro del circulo
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
}
