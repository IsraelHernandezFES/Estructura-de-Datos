package fes.aragon.clases;

import fes.aragon.inicio.Inicio;

import java.util.Map;

public class SocialMediaData {

    private String redSocial;
    private String concepto;
    private int anio;
    private Map<String, Integer> datosMensuales;

    public SocialMediaData(String redSocial, String concepto, int anio, Map<String, Integer> datosMensuales) {
        this.redSocial = redSocial;
        this.concepto = concepto;
        this.anio = anio;
        this.datosMensuales = datosMensuales;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getAnio() {
        return anio;
    }

    public Map<String, Integer> getDatosMensuales() {
        return datosMensuales;
    }

    //valor del mes
    public Integer getValorMes (String mes){
        return datosMensuales.get(mes);
    }

    @Override
    public String toString() {
        return "Red Social: " + redSocial + ", Concepto: " + concepto + ", Año: " + anio +
                ", Datos Mensuales: " + datosMensuales;
    }
}