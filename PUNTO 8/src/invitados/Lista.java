
package invitados;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    
    private ArrayList<Invitado> listaInvitados = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarInvitado() {
        System.out.print("Ingrese el nombre del invitado: ");
        String nombre = scanner.nextLine();
       System.out.print("¿Confirmación de asistencia? (Sí/No): ");
        String confirmacion=  scanner.nextLine();
        listaInvitados.add(new Invitado(nombre, confirmacion));
        System.out.println("Invitado agregado.");
    }

    public void cambiarEstadoConfirmacion() {
        System.out.print("Ingrese el nombre del invitado para cambiar su estado de confirmación: ");
        String nombreCambio = scanner.nextLine();
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombreCambio)) {
                  System.out.print("¿Confirmación de asistencia? (Sí/No): ");
                 String estado = scanner.nextLine();
                invitado.setConfirmacion(estado);
                System.out.println("Estado de confirmación cambiado.");
                return;
            }
        }
        System.out.println("Invitado no encontrado.");
    }

    public void mostrarListaInvitados() {
        System.out.println("Lista de invitados:");
        for (Invitado invitado : listaInvitados) {
            System.out.println("Nombre: " + invitado.getNombre() + ", Confirmación: " + invitado.getConfirmacion() );
        }
    }

    public void ejecutar() {
        while (true) {
            System.out.println("1. Agregar invitado");
            System.out.println("2. Cambiar estado de confirmación");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarInvitado();
                    break;
                case 2:
                    cambiarEstadoConfirmacion();
                    break;
                case 3:
                    mostrarListaInvitados();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        }
    }
}

