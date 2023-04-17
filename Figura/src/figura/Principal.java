/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */

package figura;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        
        do {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Cilindro");
            System.out.println("2. Esfera");
            System.out.println("3. Cubo");
            System.out.println("4. Circulo");
            System.out.println("5. Hexagono");
            System.out.println("6. Pentagono");
            System.out.println("7. Triangulo");
            System.out.println("8. Cuadrado");
            System.out.println("9. Salir");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del Cilindro:");
                    double radioCilindro = sc.nextDouble();
                    System.out.println("Ingrese la altura del Cilindro:");
                    double alturaCilindro = sc.nextDouble();
                    Cilindro cilindro = new Cilindro("azul", "cristal", radioCilindro, alturaCilindro);
                    System.out.println("El area del cilindro es: " + cilindro.calcularArea());
                    System.out.println("El volumen del cilindro es: " + cilindro.calcularVolumen());
                    break;
                case 2:
                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = sc.nextDouble();
                    Esfera esfera = new Esfera("azul", "cristal", radioEsfera);
                    System.out.println("El area de la esfera es: " + esfera.calcularArea());
                    System.out.println("El volumen de la esfera es: " + esfera.calcularVolumen());
                    break;
                case 3:
                    System.out.println("Ingrese el Lado del cubo:");
                    double ladoCubo = sc.nextDouble();
                    Cubo cubo = new Cubo("azul", "cristal", ladoCubo, ladoCubo);
                    System.out.println("El area del cubo es: " + cubo.calcularArea());
                    System.out.println("El volumen del cubo es: " + cubo.calcularVolumen());
                    break;
                case 4:
                    System.out.println("Ingrese el radio del Circulo:");
                    double radioCirculo = sc.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo, "azul", "cristal");
                    System.out.println("El area del circulo es: " + circulo.calcularArea());
                    System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
                    break;
                case 5:
                    System.out.println("Ingrese el lado del Hexagono:");
                    double ladoHexagono = sc.nextDouble();
                    Hexagono hexagono = new Hexagono("azul", "cristal", ladoHexagono);
                    System.out.println("El area del Hexagono es: " + hexagono.calcularArea());
                    System.out.println("El perimetro del Hexagono es: " + hexagono.calcularPerimetro());
                    break;
                case 6:
                    System.out.println("Ingrese el lado del Pentagono:");
                    double ladoPentagono = sc.nextDouble();
                    Pentagono pentagono = new Pentagono("azul", "cristal", ladoPentagono);
                    System.out.println("El area del Pentagono es: " + pentagono.calcularArea());
                    System.out.println("El perimetro del Pentagono es: " + pentagono.calcularPerimetro());
                    break;
                case 7:
                    System.out.println("Ingrese la base del Triangulo:");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Ingrese la altura del Triangulo:");
                    double alturaTriangulo = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo,alturaTriangulo,"azul", "cristal");
                    System.out.println("El area del Triangulo es: " + triangulo.calcularArea());
                    System.out.println("El perimetro del Triangulo es: " + triangulo.calcularPerimetro());
                    break;
                case 8:
                    System.out.println("Ingrese un lado del Cuadrado:");
                    double lado = sc.nextDouble();
                    Cuadrado cuadrado = new Cuadrado("azul", "cristal",lado);
                    System.out.println("El area del Cuadrado es: " + cuadrado.calcularArea());
                    System.out.println("El perimetro del Cuadrado es: " + cuadrado.calcularPerimetro());
                    break;
                case 9:
                    continuar = false;
                    System.out.println("Gracias por usar la aplicacion");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
            if (continuar) {
                System.out.println("¿Desea realizar otra operacion? (s/n)");
                String opcionContinuar = sc.next();
                if (!opcionContinuar.equalsIgnoreCase("s")) {
                    continuar = false;
                    System.out.println("Gracias por usar la aplicacion");
                }
            }
            
        } while (continuar);
    }
}
