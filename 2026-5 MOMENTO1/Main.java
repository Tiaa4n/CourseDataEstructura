import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Puerto puerto = new Puerto();

        int opcion;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar Buque");
            System.out.println("2. Registrar Contenedor");
            System.out.println("3. Mostrar peso total");
            System.out.println("4. Listar origen agrupado");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre del buque:");
                    String nombreBuque = sc.next();
                    puerto.registrarBuque(nombreBuque);
                    break;

                case 2:
                    System.out.println("Nombre del contenedor:");
                    String nombreCont = sc.next();

                    System.out.println("Origen:");
                    String origen = sc.next();

                    System.out.println("Peso:");
                    double peso = sc.nextDouble();

                    System.out.println("Columna (0-9):");
                    int columna = sc.nextInt();

                    puerto.registrarContenedor(nombreCont, origen, peso, columna);
                    break;

                case 3:
                    puerto.mostrarPesoTotal();
                    break;

                case 4:
                    puerto.listarOrigenAgrupado();
                    break;

                case 5:
                    System.out.println("Aplicación finalizada.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }
}