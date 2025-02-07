package atividade2;

public class Main {
    public static void main(String[] args) {

        Character[][] matrizChar = {
                {'a', 'b', 'c'},
                {'d', 'r', 'f'},
                {'g', 'h', 'i'}
        };

        MatrizGenerica<Character> matrizGenericaChar = new MatrizGenerica<>(matrizChar);
        matrizGenericaChar.listarDados();
        matrizGenericaChar.diagonalPrincipal();
        matrizGenericaChar.matrizTransposta();

        System.out.println();

        Integer[][] matrizInt = {
                {2, 3, 5},
                {7, 8, 9},
                {1, 5, 4}
        };

        MatrizGenerica<Integer> matrizGenericaInt = new MatrizGenerica<>(matrizInt);
        matrizGenericaInt.listarDados();
        matrizGenericaInt.diagonalPrincipal();
        matrizGenericaInt.matrizTransposta();
    }
}
