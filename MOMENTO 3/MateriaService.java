

import java.util.Queue;
import java.util.ArrayDeque;

public class MateriaService {

    private Queue<SolicitudInscripcion> cola;

    public MateriaService() {

        cola = new ArrayDeque<>();
    }

    public void agregarSolicitud(
            SolicitudInscripcion solicitud) {

        cola.offer(solicitud);
    }

    public void procesar() {

        while (!cola.isEmpty()) {

            SolicitudInscripcion s = cola.poll();

            System.out.println(
                    s.getIdEstudiante()
                            + " -> "
                            + s.getCodigoMateria()
            );
        }
    }
}
    

