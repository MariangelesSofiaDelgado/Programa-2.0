package Vista;

import java.util.Scanner;
import Controlador.GestionLenguaje;

public class SistemaRegistro {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                    Seleccione una opción:
                    1. Agregar lenguaje
                    2. Buscar lenguaje
                    3. Eliminar lenguaje
                    4. Imprimir lenguajes
                    5. Salir""");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el año de creación del lenguaje");
                    int AnioCreacion = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese la característica principal del lenguaje");
                    String CaracteristicaPrincipal = lector.nextLine();
                    System.out.println("Ingrese el nombre del lenguaje");
                    String Nombre = lector.nextLine();
                    System.out.println("Ingrese la utilización del lenguaje");
                    String Utilizacion = lector.nextLine();
                    GestionLenguaje.AgregarLenguaje(AnioCreacion, CaracteristicaPrincipal, Nombre, Utilizacion); //
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del lenguaje a buscar");
                    String nombre = lector.nextLine();
                    nombre = lector.nextLine();
                    if (GestionLenguaje.BuscarLenguaje(nombre) != null) {
                        System.out.println("Lenguaje encontrado: ");
                        System.out.println(GestionLenguaje.BuscarLenguaje(nombre));
                    } else { 
                        System.out.println("No se encontraron coincidencias");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del lenguaje a eliminar");
                    String NombreEliminar = lector.nextLine();
                    NombreEliminar=lector.nextLine();
                    if (GestionLenguaje.eliminaLenguaje(NombreEliminar)) {
                        System.out.println("Lenguaje eliminado");
                    } else {
                        System.out.println("No se encontró el lenguaje");
                    }
                    break;
                case 4:
                    GestionLenguaje.ImprimirLenguajes();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
        lector.close();
    }
}
