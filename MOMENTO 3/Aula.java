package com.universidad.model;

public class Aula {

    private String nombre;

    private boolean[][] horario = new boolean[7][24];

    public Aula(String nombre) {

        this.nombre = nombre;
    }

    public boolean consultarDisponibilidad(int dia,
                                           int hora) {

        return !horario[dia][hora];
    }

    public void reservar(int dia,
                          int hora,
                          int duracion)
            throws Exception {

        for (int i = hora; i < hora + duracion; i++) {

            if (horario[dia][i]) {

                throw new Exception("Horario ocupado");
            }
        }

        for (int i = hora; i < hora + duracion; i++) {

            horario[dia][i] = true;
        }
    }

    public void liberar(int dia,
                         int hora,
                         int duracion) {

        for (int i = hora; i < hora + duracion; i++) {

            horario[dia][i] = false;
        }
    }
}