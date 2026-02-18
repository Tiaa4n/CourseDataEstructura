// Clase Curso
public class Curso {

    
    private int id;
    private String nombreCurso;
    private String profesor;
    private int cantidadEstudiantes;

    
    private static int totalEstudiantes = 0;

    
    public Curso(int id, String nombreCurso, String profesor, int cantidadEstudiantes) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.cantidadEstudiantes = cantidadEstudiantes;

        
        totalEstudiantes += cantidadEstudiantes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    
    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Profesor: " + profesor);
        System.out.println("Estudiantes: " + cantidadEstudiantes);
        System.out.println("------------------");
    }
}