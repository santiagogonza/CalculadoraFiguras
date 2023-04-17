/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */

package figura;

//Clase Circulo
public class Circulo extends Figura2D {

	private double radio;

	public Circulo(double radio, String color, String material) {
		super(color, material);
		setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
		super.setRadio(radio);
	}

	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
}