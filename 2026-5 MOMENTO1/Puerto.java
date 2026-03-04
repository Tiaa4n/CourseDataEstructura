import java.util.HashMap;

public class Puerto {

    private Contenedor[][] matriz;
    private Buque[] buques;

    public Puerto() {
        matriz = new Contenedor[10][10];
        buques = new Buque[10];
    }

    // =============================
    // REGISTRAR BUQUE
    // =============================
    public void registrarBuque(String nombre) {

        for (int i = 0; i < buques.length; i++) {
            if (buques[i] == null) {
                buques[i] = new Buque(nombre);
                System.out.println("Buque registrado en posición " + i);
                return;
            }
        }
        System.out.println("No hay espacio disponible para más buques.");
    }

    // =============================
    // REGISTRAR CONTENEDOR
    // =============================
    public void registrarContenedor(String nombre, String origen, double peso, int columna) {

        if (columna < 0 || columna > 9) {
            System.out.println("Columna inválida.");
            return;
        }

        for (int fila = 9; fila >= 0; fila--) {
            if (matriz[fila][columna] == null) {
                matriz[fila][columna] = new Contenedor(nombre, origen, peso);
                System.out.println("Contenedor ubicado en fila " + fila + ", columna " + columna);
                mostrarMatriz();
                return;
            }
        }

        System.out.println("Columna llena.");
    }

    // =============================
    // PESO TOTAL
    // =============================
    public void mostrarPesoTotal() {

        double total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] != null) {
                    total += matriz[i][j].getPeso();
                }
            }
        }

        System.out.println("Peso total: " + total);
    }

    // =============================
    // LISTAR ORIGEN AGRUPADO
    // =============================
    public void listarOrigenAgrupado() {

        HashMap<String, Integer> contador = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] != null) {

                    String origen = matriz[i][j].getOrigen();

                    contador.put(origen,
                            contador.getOrDefault(origen, 0) + 1);
                }
            }
        }

        System.out.println("Contenedores agrupados por origen:");
        for (String origen : contador.keySet()) {
            System.out.println(origen + ": " + contador.get(origen));
        }
    }

    // =============================
    // MOSTRAR MATRIZ
    // =============================
    public void mostrarMatriz() {

        System.out.println("\nEstado actual del puerto:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == null)
                    System.out.print("[ ] ");
                else
                    System.out.print("[X] ");
            }
            System.out.println();
        }
    }
}
    
