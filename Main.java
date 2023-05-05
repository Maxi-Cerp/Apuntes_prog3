package clasecasa;

import java.util.Scanner;

public class Main{
    private static Casa unaCasa;
    private static Scanner lector;

    public static void main(String[] args) {
        lector = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido al menú:");
            System.out.println("1. Crear casa");
            System.out.println("2. Mostrar casa");
            System.out.println("3. Salir");

            int opcion = lector.nextInt();
         

            switch (opcion) {
                case 1:
                    crearCasa();
                    break;
                case 2:
                    mostrarCasa();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        System.out.println("¡Nos vemos!");
    }

    private static void crearCasa() {
        System.out.println("Ingrese el ancho de la casa:");
        float ancho = lector.nextFloat();
        lector.nextLine();

        System.out.println("Ingrese el largo de la casa:");
        float largo = lector.nextFloat();
        lector.nextLine();

        System.out.println("Ingrese la cantidad de cuartos de la casa:");
        int canCuartos = lector.nextInt();
        lector.nextLine();

        System.out.println("Ingrese la dirección de la casa:");
        String direccion = lector.nextLine();

        System.out.println("¿La casa tiene piscina? (S/N)");
        boolean piscina = (lector.nextLine().equalsIgnoreCase("S"));

        unaCasa = new Casa(ancho, largo, canCuartos, direccion, piscina);
        System.out.println("Casa creada");
    }

    private static void mostrarCasa() {
        if (unaCasa == null) {
            System.out.println("No hay casa");
        } else {
        	System.out.println(unaCasa.ficha());
            
        }
    }
}
