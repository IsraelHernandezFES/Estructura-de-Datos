package fes.aragon.clases;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
    private String nombreProducto;
    private String marca;
    private Integer id;
    private double precio;
    private Integer pzsDisponibles;

    @Override
    public int compareTo(Producto otroProducto) {
        return this.id.compareTo(otroProducto.getId());
    }

    public Producto() {
    }

    public Producto(String nombreProducto, String marca,Integer id, double precio, Integer pzsDisponibles) {
        this.nombreProducto = nombreProducto;
        this.id = id;
        this.precio = precio;
        this.pzsDisponibles = pzsDisponibles;
        this.marca = marca;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getPzsDisponibles() {
        return pzsDisponibles;
    }

    public void setPzsDisponibles(Integer pzsDisponibles) {
        this.pzsDisponibles = pzsDisponibles;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' + "marca = " + marca +
                ", id=" + id +
                ", precio=" + precio +
                ", pzsDisponibles=" + pzsDisponibles +
                '}';
    }
}
