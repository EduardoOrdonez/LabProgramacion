
package practico_poo_figuras;

import java.util.Scanner;


public class Paralelogramo {
    double base;
    double altura;
    double lado;
    
    public Paralelogramo(double base, double altura, double lado ){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    public void calcularArea(){
        double area = base * altura;
        System.out.println("El area del cuadrado es: " + area);
    }
    public void calcularPerimetro(){
        double perimetro = 2 * (base + lado);
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    
     public static void menuParalelogramo(Scanner leer) {
        System.out.print("Ingrese la cantidad de paralelogramos a realizar: ");
        int cantidadParalelogramos = leer.nextInt();

        Paralelogramo[] paralelogramos = new Paralelogramo[cantidadParalelogramos];

        for (int i = 0; i < cantidadParalelogramos; i++) {
            System.out.print("Ingrese la base del paralelogramo " + (i + 1) + ": ");
            double base = leer.nextDouble();

            System.out.print("Ingrese la altura del paralelogramo " + (i + 1) + ": ");
            double altura = leer.nextDouble();
            
            System.out.print("Ingrese la lado del paralelogramo " + (i + 1) + ": ");
            double lado = leer.nextDouble();

            paralelogramos[i] = new Paralelogramo(base, altura, lado);
            paralelogramos[i].calcularArea();
            paralelogramos[i].calcularPerimetro();
        }
    }
}
