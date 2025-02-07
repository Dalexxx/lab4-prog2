package atividade2;

public class MatrizGenerica<T> {
    private T[][] matriz;

    public MatrizGenerica(T[][] matriz) {
        this.matriz = matriz;
    }

    public void listarDados() {
        System.out.println("Matriz Original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void diagonalPrincipal() {
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public void matrizTransposta() {
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}