package main;

import controlador.ControladorArticulo;
import java.util.Scanner;
import modelo.Articulo;
import modelo.Importado;
import modelo.Nacional;

public class Practico4Parte2 {

    private static Scanner scanner = new Scanner(System.in);
    private static ControladorArticulo unControlador = new ControladorArticulo();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Ingrese una opción: ");
            System.out.println("Agregar articulos - 1 ");
            System.out.println("Mostrar articulos - 2 ");
            System.out.println("Eliminar articulos - 3 ");
            System.out.println("Salir - 0 ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    mostrarArticulos();
                    break;
                case 3:
                    eliminarArticulo();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);
    }

    private static void agregarArticulo() {
        String departamento = null;
        boolean subsidiado = false;

        System.out.println("Ingrese el código del articulo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio costo del articulo: ");
        float precioCosto = scanner.nextFloat();
        scanner.nextLine(); // limpiar buffer

        System.out.println("El artículo es nacional? (y=si / n=no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equals("y")) {
            System.out.println("Es subsidiado? (y/n): ");
            String respuestaSubsidiado = scanner.nextLine();
            if (respuestaSubsidiado.equals("n")) {
                subsidiado = false;
                System.out.println("Es de montevideo? (y/n): ");
                String respuestaDepto = scanner.nextLine();
                if (respuestaDepto.equals("y")) {
                    departamento = "Montevideo";
                } else {
                    departamento = "Interior";
                }
            } else {
                subsidiado = true;
                departamento = "No subsidiado";
            }
            Nacional unArticulo = new Nacional(codigo, nombre, precioCosto, departamento, subsidiado);
            unControlador.agregarArticulo(unArticulo);

        } else if (respuesta.equals("n")) {
            System.out.print("Ingrese el año de importación: ");
            int anioImportacion = scanner.nextInt();
            System.out.print("Ingrese el monto del impuesto: ");
            float impuesto = scanner.nextFloat();
            scanner.nextLine();

            Importado unArticulo = new Importado(codigo, nombre, precioCosto, anioImportacion, impuesto);
            unControlador.agregarArticulo(unArticulo);
        } else {
            System.out.println("¡Respuesta incorrecta!");
        }
    }

    private static void mostrarArticulos() {
        for (Articulo a : unControlador.obtenerArticulos()) {
            System.out.println("Código: " + a.getCodigo() + ", Nombre: " + a.getNombre() + 
                               ", Precio Costo: " + a.getPrecioCosto() + ", Precio Venta: " + a.precioVenta() + 
                               ", Tipo: " + a.tipoArticulo());
        }
    }

    private static void eliminarArticulo() {
        System.out.println("Ingrese el código del artículo a eliminar:");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        boolean eliminado = unControlador.eliminarArticulo(codigo);
        if (eliminado) {
            System.out.println("Artículo eliminado.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }
}

