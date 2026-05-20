

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class Materia {

    private String codigo;
    private String nombre;
    private int cupos;

    private LinkedList<String> preRequisitos;

    private Queue<Estudiante> colaEspera;

    public Materia(String codigo,
                   String nombre,
                   int cupos) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.cupos = cupos;

        preRequisitos = new LinkedList<>();

        colaEspera = new ArrayDeque<>();
    }

    public void agregarPreRequisito(String requisito) {

        preRequisitos.add(requisito);
    }

    public boolean hayCupo() {

        return cupos > 0;
    }

    public void ocuparCupo() {

        cupos--;
    }

    public Queue<Estudiante> getColaEspera() {

        return colaEspera;
    }
}