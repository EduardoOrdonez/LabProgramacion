
package practico_poo_figuras;

import java.util.Scanner;


public class Practico_Poo_Figuras {

 
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Paralelogramo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Cuadrado.menuCuadrado(leer);
                    break;
                case 2:
                    Triangulo.menuTriangulo(leer);
                    break;
                case 3:
                    Rectangulo.menuRectangulo(leer);
                    break;
                case 4:
                    Paralelogramo.menuParalelogramo(leer);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }
}

