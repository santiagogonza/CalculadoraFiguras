/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Triangulo
public class Triangulo extends Figura2D {
	private double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public Triangulo(double base, double altura, String color, String material) {
		super(color, material);
		setBase(base);
		setAltura(altura);
	}

	@Override
	public double calcularArea() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return base * 3;
	}
}
