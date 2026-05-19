package com.universidad.model;

public class Operacion {

    private String tipo;
    private String descripcion;

    public Operacion(String tipo,
                      String descripcion) {

        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {

        return descripcion;
    }
}