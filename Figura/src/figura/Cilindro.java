/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Cilindro
public class Cilindro extends Figura3D {

    private double altura;
    //constructor con su parametros
    public Cilindro(String color, String material, double radio, double altura) {
        super(color, material, radio);
        this.altura = altura;
    }
    //métodos get y set
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //método para calcular su area
    public double calcularArea() {
        return 2 * Math.PI * super.getRadio() * altura + 2 * Math.PI * super.getRadio() * super.getRadio();
    }
    //método para calcular su perimetro
    public double calcularVolumen() {
        return Math.PI * super.getRadio() * super.getRadio() * altura;
    }
}
