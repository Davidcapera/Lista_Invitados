
package invitados;

public class Invitado {
    
    private String nombre,confirmacion;
   
    public Invitado(String nombre,String confirmacion) {
        this.nombre = nombre;
        this.confirmacion = confirmacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

   
}
