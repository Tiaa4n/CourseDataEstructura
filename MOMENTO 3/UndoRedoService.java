package com.universidad.service;

import com.universidad.model.Operacion;

import java.util.Stack;

public class UndoRedoService {

    private Stack<Operacion> pilaDeshacer;

    private Stack<Operacion> pilaRehacer;

    public UndoRedoService() {

        pilaDeshacer = new Stack<>();
        pilaRehacer = new Stack<>();
    }

    public void guardarOperacion(Operacion operacion) {

        pilaDeshacer.push(operacion);
    }

    public void deshacer() {

        if (pilaDeshacer.isEmpty()) {

            System.out.println("Nada que deshacer");
            return;
        }

        Operacion op = pilaDeshacer.pop();

        pilaRehacer.push(op);

        System.out.println("Deshacer: "
                + op.getDescripcion());
    }

    public void rehacer() {

        if (pilaRehacer.isEmpty()) {

            System.out.println("Nada que rehacer");
            return;
        }

        Operacion op = pilaRehacer.pop();

        pilaDeshacer.push(op);

        System.out.println("Rehacer: "
                + op.getDescripcion());
    }
}