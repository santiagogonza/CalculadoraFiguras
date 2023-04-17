/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Cuadrado
public class Cuadrado extends Figura2D {
	//atributo del cuadrado
	private double lado;
	//constructor con sus parametros
	public Cuadrado(String color, String material, double lado) {
		super(color, material);
		this.lado = lado;
	}
	//método get y set
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	//método para calcular el area del cuadrado
	public double calcularArea() {
		return lado * lado;
	}

	//metodo para calcular el perimetro del cuadrado
	public double calcularPerimetro() {
		return 4 * lado;
	}
}
