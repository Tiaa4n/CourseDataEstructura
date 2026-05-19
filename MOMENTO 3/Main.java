


import com.universidad.model.Estudiante;
import com.universidad.service.EstudianteService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EstudianteService service =
                new EstudianteService();

        int opcion;

        do {

            System.out.println("\n==================================================");
            System.out.println("      SISTEMA DE GESTION UNIVERSITARIA");
            System.out.println("==================================================");

            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Listar estudiantes");
            System.out.println("4. Registrar nota");
            System.out.println("5. Mostrar promedio");
            System.out.println("6. Actualizar datos");
            System.out.println("7. Ver informacion completa");
            System.out.println("8. Simular materias");
            System.out.println("9. Simular horarios");
            System.out.println("10. Mostrar estructuras");
            System.out.println("11. Reporte del sistema");
            System.out.println("12. Salir");

            System.out.print("\nSeleccione opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                // =====================================================
                // REGISTRAR ESTUDIANTE
                // =====================================================

                case 1:

                    System.out.println(
                            "\n=========== REGISTRO ==========="
                    );

                    System.out.print("Ingrese ID: ");
                    String id =
                            scanner.nextLine();

                    System.out.print("Ingrese nombre: ");
                    String nombre =
                            scanner.nextLine();

                    System.out.print("Ingrese email: ");
                    String email =
                            scanner.nextLine();

                    System.out.print("Ingrese semestre: ");
                    int semestre =
                            scanner.nextInt();

                    Estudiante estudiante =
                            new Estudiante(
                                    nombre,
                                    id,
                                    email,
                                    semestre
                            );

                    service.registrar(estudiante);

                    System.out.println(
                            "\nEstudiante registrado exitosamente."
                    );

                    break;

                // =====================================================
                // BUSCAR ESTUDIANTE
                // =====================================================

                case 2:

                    System.out.println(
                            "\n=========== BUSQUEDA ==========="
                    );

                    System.out.print(
                            "Ingrese ID estudiante: "
                    );

                    String buscarId =
                            scanner.nextLine();

                    Estudiante encontrado =
                            service.buscar(buscarId);

                    if (encontrado != null) {

                        System.out.println(
                                "\nEstudiante encontrado:"
                        );

                        encontrado.mostrarInformacion();

                    } else {

                        System.out.println(
                                "\nNo existe estudiante."
                        );
                    }

                    break;

                // =====================================================
                // LISTAR ESTUDIANTES
                // =====================================================

                case 3:

                    System.out.println(
                            "\n=========== LISTA ==========="
                    );

                    service.listar();

                    break;

                // =====================================================
                // REGISTRAR NOTA
                // =====================================================

                case 4:

                    System.out.println(
                            "\n=========== NOTAS ==========="
                    );

                    System.out.print(
                            "Ingrese ID estudiante: "
                    );

                    String idNota =
                            scanner.nextLine();

                    Estudiante estudianteNota =
                            service.buscar(idNota);

                    if (estudianteNota != null) {

                        System.out.print(
                                "Ingrese posicion materia (0-19): "
                        );

                        int materia =
                                scanner.nextInt();

                        System.out.print(
                                "Ingrese nota: "
                        );

                        double nota =
                                scanner.nextDouble();

                        scanner.nextLine();

                        estudianteNota.registrarNota(
                                0,
                                materia,
                                nota
                        );

                        System.out.println(
                                "\nNota registrada correctamente."
                        );

                    } else {

                        System.out.println(
                                "\nEstudiante no encontrado."
                        );
                    }

                    break;

                // =====================================================
                // MOSTRAR PROMEDIO
                // =====================================================

                case 5:

                    System.out.println(
                            "\n=========== PROMEDIO ==========="
                    );

                    System.out.print(
                            "Ingrese ID estudiante: "
                    );

                    String promedioId =
                            scanner.nextLine();

                    Estudiante promedioEst =
                            service.buscar(promedioId);

                    if (promedioEst != null) {

                        Double promedio =
                                promedioEst.calcularPromedio();

                        System.out.println(
                                "\nPromedio general: "
                                        + promedio
                        );

                    } else {

                        System.out.println(
                                "\nNo existe estudiante."
                        );
                    }

                    break;

                // =====================================================
                // ACTUALIZAR DATOS
                // =====================================================

                case 6:

                    System.out.println(
                            "\n=========== ACTUALIZAR ==========="
                    );

                    System.out.print(
                            "Ingrese ID estudiante: "
                    );

                    String actualizarId =
                            scanner.nextLine();

                    Estudiante actualizar =
                            service.buscar(actualizarId);

                    if (actualizar != null) {

                        System.out.println(
                                "\nDatos encontrados correctamente."
                        );

                        System.out.println(
                                "Actualizacion simulada completada."
                        );

                    } else {

                        System.out.println(
                                "\nEstudiante no encontrado."
                        );
                    }

                    break;

                // =====================================================
                // VER INFORMACION
                // =====================================================

                case 7:

                    System.out.println(
                            "\n=========== INFORMACION ==========="
                    );

                    System.out.print(
                            "Ingrese ID estudiante: "
                    );

                    String infoId =
                            scanner.nextLine();

                    Estudiante info =
                            service.buscar(infoId);

                    if (info != null) {

                        info.mostrarInformacion();

                        System.out.println(
                                "\nSistema funcionando correctamente."
                        );

                        System.out.println(
                                "HashMap utilizado para almacenamiento."
                        );

                        System.out.println(
                                "Matrices utilizadas para notas."
                        );

                    } else {

                        System.out.println(
                                "\nNo existe estudiante."
                        );
                    }

                    break;

                // =====================================================
                // SIMULAR MATERIAS
                // =====================================================

                case 8:

                    System.out.println(
                            "\n=========== MATERIAS ==========="
                    );

                    System.out.println(
                            "Materia 1: Calculo"
                    );

                    System.out.println(
                            "Materia 2: Programacion"
                    );

                    System.out.println(
                            "Materia 3: Estructura de Datos"
                    );

                    System.out.println(
                            "Materia 4: Bases de Datos"
                    );

                    System.out.println(
                            "Materia 5: Ingles"
                    );

                    break;

                // =====================================================
                // SIMULAR HORARIOS
                // =====================================================

                case 9:

                    System.out.println(
                            "\n=========== HORARIOS ==========="
                    );

                    System.out.println(
                            "Lunes 6AM - Programacion"
                    );

                    System.out.println(
                            "Martes 8AM - Calculo"
                    );

                    System.out.println(
                            "Miercoles 10AM - Ingles"
                    );

                    System.out.println(
                            "Jueves 2PM - Bases de Datos"
                    );

                    System.out.println(
                            "Viernes 4PM - Estructuras"
                    );

                    break;

                // =====================================================
                // ESTRUCTURAS
                // =====================================================

                case 10:

                    System.out.println(
                            "\n=========== ESTRUCTURAS ==========="
                    );

                    System.out.println(
                            "1. HashMap para estudiantes"
                    );

                    System.out.println(
                            "2. Matriz para notas"
                    );

                    System.out.println(
                            "3. LinkedList para historiales"
                    );

                    System.out.println(
                            "4. Queue para procesos"
                    );

                    System.out.println(
                            "5. Stack para deshacer"
                    );

                    System.out.println(
                            "6. TreeMap para aulas"
                    );

                    break;

                // =====================================================
                // REPORTE
                // =====================================================

                case 11:

                    System.out.println(
                            "\n=========== REPORTE ==========="
                    );

                    System.out.println(
                            "Sistema ejecutado correctamente."
                    );

                    System.out.println(
                            "Proyecto realizado en Java."
                    );

                    System.out.println(
                            "Se implementaron estructuras de datos."
                    );

                    System.out.println(
                            "Se utilizo Programacion Orientada a Objetos."
                    );

                    System.out.println(
                            "El sistema permite registrar estudiantes."
                    );

                    System.out.println(
                            "El sistema permite calcular promedios."
                    );

                    System.out.println(
                            "Proyecto finalizado correctamente."
                    );

                    break;

                // =====================================================
                // SALIR
                // =====================================================

                case 12:

                    System.out.println(
                            "\nCerrando sistema..."
                    );

                    System.out.println(
                            "Gracias por utilizar el programa."
                    );

                    break;

                default:

                    System.out.println(
                            "\nOpcion invalida."
                    );
            }

        } while (opcion != 12);

        scanner.close();
    }
}
