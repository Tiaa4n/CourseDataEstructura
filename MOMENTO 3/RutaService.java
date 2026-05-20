

public class RutaService {

    private int[][] matriz = new int[5][5];

    public void agregarConexion(int origen,
                                 int destino,
                                 int distancia) {

        matriz[origen][destino] = distancia;
        matriz[destino][origen] = distancia;
    }

    public void mostrarMatriz() {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}