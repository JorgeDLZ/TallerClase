import java.util.*;
public class Main {
    public static void main(String[] args) {

        SistemaEstacionamiento sistema = new SistemaEstacionamiento();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estacionamientos a registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el ID del estacionamiento " + (i + 1) + ":");
            String id = scanner.nextLine();
            sistema.agregarEstacionamiento(id);
        }

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar información de un estacionamiento");
            System.out.println("3. Mostrar consolidado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del estacionamiento: ");
                    String estacionamientoId = scanner.nextLine();
                    Estacionamiento estacionamiento = sistema.obtenerEstacionamiento(estacionamientoId);
                    if (estacionamiento != null) {
                        System.out.println("Seleccione el tipo de vehículo:");
                        System.out.println("1. Automóvil");
                        System.out.println("2. Motocicleta");
                        System.out.println("3. Camión");
                        int tipo = scanner.nextInt();
                        System.out.print("Ingrese la cantidad de horas: ");
                        int horas = scanner.nextInt();
                        Vehiculos vehiculo = (tipo == 1) ? new Automovil() : (tipo == 2) ? new Moto() : new Camion();
                        estacionamiento.registrarVehiculo(vehiculo, horas);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el ID del estacionamiento: ");
                    estacionamientoId = scanner.nextLine();
                    estacionamiento = sistema.obtenerEstacionamiento(estacionamientoId);
                    if (estacionamiento != null) estacionamiento.mostrarInfo();
                    break;
                case 3:
                    sistema.mostrarConsolidado();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}










