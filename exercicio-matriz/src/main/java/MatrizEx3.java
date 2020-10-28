import javax.swing.*;
import java.util.Scanner;


public class MatrizEx3 {
    public static void exibeMatriz(int [][] m){
        for (int linha = 0; linha < m.length; linha++){
            for (int coluna = 0; coluna < m[linha].length; coluna++){
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void calculaDiagonalPrincipal(int[][] m) {
        int diagonalPrincipal = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                if(i == j) {
                    diagonalPrincipal += m[i][j];
                }
            }
        }
        System.out.println("\n\nDiagonal Principal = " + diagonalPrincipal);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior que 1 e menor que 6"));

        int[][] matriz = new int[num][num];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o valor de matriz[" + linha + "]" +
                        "[" + coluna + "]");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
        exibeMatriz(matriz);
        calculaDiagonalPrincipal(matriz);
    }

}
