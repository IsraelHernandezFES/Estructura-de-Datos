package fes.aragon.clases;

public class Paciente {
    private String nombre;
    private int edad;
    private String condicionMedica;

    public Paciente(String nombre, int edad, String condicionMedica) {
        this.nombre = nombre;
        this.edad = edad;
        this.condicionMedica = condicionMedica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCondicionMedica() {
        return condicionMedica;
    }

    public void setCondicionMedica(String condicionMedica) {
        this.condicionMedica = condicionMedica;
    }

    @Override
    public String toString() {
        return "Paciente " +
                "nombre:" + nombre +
                " , edad:" + edad +
                " , condicion Medica:" + condicionMedica;
    }
}
