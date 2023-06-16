
package practico_poo_figuras;

import java.util.Scanner;


public class Triangulo {
    double altura;
    double hipotenusa;
    double catetoA;
    double catetoO;
    
    public Triangulo(double altura, double hipotenusa, double catetoA, double catetoO){
        this.altura = altura;
        this.hipotenusa = hipotenusa;
        this.catetoA = catetoA;
        this.catetoO = catetoO;
    }
  
    
    public void calcularArea(){
        double area = catetoA * catetoO / 2;
        System.out.println("El area del cuadrado es: " + area);
    }
    public void calcularPerimetro(){
        double perimetro = 2 * catetoA + hipotenusa;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
     public static void menuTriangulo(Scanner leer) {

        System.out.print("Ingrese la cantidad de triangulos a realizar: ");
        int cantidadTriangulos = leer.nextInt();
        
        Triangulo[] triangulos = new Triangulo[cantidadTriangulos];

        for (int i = 0; i < cantidadTriangulos; i++) {
            System.out.print("Ingrese la base del triangulo " + (i + 1) + ": ");
            double base = leer.nextDouble();

            System.out.print("Ingrese la altura del triangulo " + (i + 1) + ": ");
            double altura = leer.nextDouble();
            
            System.out.print("Ingrese la altura del triangulo " + (i + 1) + ": ");
            double catetoA = leer.nextDouble();
            
            System.out.print("Ingrese la altura del triangulo " + (i + 1) + ": ");
            double catetoO = leer.nextDouble();
            
            triangulos[i] = new Triangulo(base, altura, catetoA, catetoO);
            triangulos[i].calcularArea();
            triangulos[i].calcularPerimetro();
        }
    }
    
}
