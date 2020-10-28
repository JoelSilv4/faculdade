import java.util.Scanner;

public class MatrizEx {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maxNome = 5;
        String[] nome;
        String[] telefone;


        nome = new String[maxNome];       // vetor aluno tem maxAluno posições
        telefone = new String[maxNome];    // matriz notas tem maxAluno linhas e 2 colunas


        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite um nome: ");
            nome[i] = leitor.next();
        }

        for (int linha = 0; linha < telefone.length; linha++) {
            System.out.println("Digite o telefone do nome "
                    + nome[linha]);
            telefone[linha] = leitor.next();

        }

        System.out.println("Digite um nome para pesquisar seu telefone");
        String nomeDesejado = leitor.next();


        for (int linha = 0; linha < nome.length; linha++)
        {
            if (nomeDesejado.equals(nome[linha]))
            {
                System.out.println("O telefone de " + nome[linha] + " é " + telefone[linha]);
            }

            else
            {
                System.out.println("Nome não encontrado.");
            }
        }


    }

}
