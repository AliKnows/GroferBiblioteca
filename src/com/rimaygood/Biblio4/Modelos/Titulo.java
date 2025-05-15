package com.rimaygood.Biblio4.Modelos;

public class Titulo {

    private String titNombre;
    private String titNombreAutor;
    private int titFechaPublicacion;

    public int getTitFechaPublicacion() {
        return titFechaPublicacion;
    }

    public void setTitFechaPublicacion(int titFechaPublicacion) {
        this.titFechaPublicacion = titFechaPublicacion;
    }

    public String getTitNombreAutor() {
        return titNombreAutor;
    }

    public void setTitNombreAutor(String titNombreAutor) {
        this.titNombreAutor = titNombreAutor;
    }

    public String getTitNombre() {
        return titNombre;
    }

    public void setTitNombre(String titNombre) {
        this.titNombre = titNombre;
    }

}
