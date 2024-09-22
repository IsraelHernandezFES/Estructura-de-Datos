package Clases;

public class ClienteBanco {
    private String nombre;
    private int prioridad;

    public ClienteBanco() {
    }

    public ClienteBanco(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String retirarDinero (int cantidad){
        String str = nombre + " retiro: " + cantidad;
        return str;
    }

    @Override
    public String toString() {
        return
                "Cliente:'" + nombre + '\'' +
                ", prioridad:" + prioridad ;
    }
}
