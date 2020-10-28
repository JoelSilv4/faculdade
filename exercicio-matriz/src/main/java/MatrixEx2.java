import java.util.Scanner;

public class MatrixEx2 {

    public static void exibeNum10a20(int [][] m){
        for (int linha = 0; linha < m.length; linha++){
            int cont =0;
            System.out.print("Linha "+linha + ":");
            for (int coluna = 0; coluna < m[linha].length; coluna ++){
                if (m[linha][coluna] >= 10 && m[linha][coluna] <=20){
                    System.out.print(m[linha][coluna] + "\t");
                    cont++;
                }
                System.out.println("foram encontrados "+cont+" valores entre 10 e 20");
            }
        }
    }

    public static Double mediaPares(int[][] m) {
        double somaP = 0;
        int contP = 0;

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if (m[linha][coluna] % 2 == 0) {
                    somaP += m[linha][coluna];
                    contP++;
                }
            }
        }
        return somaP / contP;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nLinha,nColuna;
        System.out.println("Digite a qtd de linhas da matriz");
        nLinha = leitor.nextInt();
        System.out.println("Digite a qtd de colunas da matriz");
        nColuna = leitor.nextInt();

        int [][] matriz = new int [nLinha][nColuna];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite um numero");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }
    }

}
