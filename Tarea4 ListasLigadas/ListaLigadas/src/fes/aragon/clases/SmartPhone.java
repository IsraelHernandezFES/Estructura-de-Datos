package fes.aragon.clases;

public class SmartPhone {
    private String marca;
    private int AnioFabricacion;
    private int ram;
    private int almacenamiento;
    private String color;
    private int posicion;

    public SmartPhone(int posicion ,String marca, int anioFabricacion, int ram, int almacenamiento, String color) {
        this.marca = marca;
        AnioFabricacion = anioFabricacion;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.color = color;
        this.posicion =posicion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return AnioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        AnioFabricacion = anioFabricacion;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return
                "\n\tDispositvo '" + posicion + '\'' +
                "\n\tMarca: '" + marca + '\'' +
                ",\n\tAño de Fabricación: " + AnioFabricacion +
                ",\n\tRAM: " + ram + " GB" +
                ",\n\tAlmacenamiento: " + almacenamiento + " GB" +
                ",\n\tColor: '" + color + '\'';
    }

}
