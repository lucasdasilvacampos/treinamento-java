package atividadesLive.attGpt.corrigindoCodigo;
/*
Soma diagonal secundaria da matriz
                  0  1  2
               0 {1, 2, 3}, 3+5+7 = 15
               1 {4, 5, 6},
               2 {7, 8, 9}
 */

public class Ex14 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = somaDiagonalSecundaria(matriz);
        System.out.println("Soma diagonal: " + soma);
    }

    public static int somaDiagonalSecundaria(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j =0 ; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }
}


