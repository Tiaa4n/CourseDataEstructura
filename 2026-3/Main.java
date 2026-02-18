public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso(1, "Matemáticas", "Laura Gómez", 30);
        Curso c2 = new Curso(2, "Programación", "Carlos Ruiz", 25);
        Curso c3 = new Curso(3, "Estadística", "Ana Torres", 20);

        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();

        System.out.println("Total de estudiantes en todos los cursos: "
                + Curso.getTotalEstudiantes());
    }
}