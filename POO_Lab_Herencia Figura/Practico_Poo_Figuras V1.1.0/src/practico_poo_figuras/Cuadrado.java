
package practico_poo_figuras;

import java.util.Scanner;

public class Cuadrado {
    private double lados;

    public Cuadrado(double lados) {
        this.lados = lados;
    }
    
    public void calcularArea(){
       double area = lados * lados;
       System.out.println("El area del cuadrado es: " + area);
        
    }
    public void calcularPerimetro(){
        double perimetro = 4 * lados;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    public static void menuCuadrado(Scanner leer) {
        System.out.print("Ingrese la cantidad de cuadrados a realizar: ");
        int cantidadCuadrados = leer.nextInt();
        Cuadrado[] cuadrados = new Cuadrado[cantidadCuadrados];

        for (int i = 0; i < cantidadCuadrados; i++) {
            System.out.print("Ingrese el lado del cuadrado " + (i + 1) + ": ");
            double lados = leer.nextDouble();
            cuadrados[i] = new Cuadrado(lados);
            cuadrados[i].calcularArea();
            cuadrados[i].calcularPerimetro();
        }
    }
}
