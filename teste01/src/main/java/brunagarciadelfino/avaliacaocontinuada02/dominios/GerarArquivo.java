package brunagarciadelfino.avaliacaocontinuada02.dominios;

import java.util.Scanner;

public class GerarArquivo {

    static Scanner leitorString = new Scanner(System.in);
    static Scanner leitorNumber = new Scanner(System.in);

    private static void reiniciaLeitores() {
        leitorNumber = new Scanner(System.in);
        leitorString = new Scanner(System.in);
    }

    public static void main(String[] args) {
        boolean fim = false;

        int id;
        String nome;
        int nivel;
        Double primeiraRodada;
        Double segundaRodada;
        Double mediaDePontos;

        ListaObj<Jogador> jogadores = new ListaObj<Jogador>(10);

        while(!fim){
            System.out.println(
                    "\n" +
                            "1.\tAdicionar um jogador\n" +
                            "2.\tExibir a lista\n" +
                            "3.\tGravar a lista em arquivo CSV\n" +
                            "4.\tLer e exibir um arquivo CSV\n" +
                            "5.\tSair\n"
            );

            try {
                 int opcao = leitorNumber.nextInt();
                 switch (opcao){
                     case 1:
                         reiniciaLeitores();
                         System.out.print("Digite o ID do jogador: ");
                         id= leitorNumber.nextInt();
                         System.out.println("Digite um nome para o jogador:");
                         nome = leitorString.nextLine();
                         System.out.println("Digite o nivel do jogador: ");
                         nivel = leitorNumber.nextInt();
                         System.out.println("Digite o desempenho do jogador na primeira rodada: ");
                         primeiraRodada = leitorNumber.nextDouble();
                         System.out.println("Digite o desempenho do jogdor na segunda rodada: ");
                         segundaRodada = leitorNumber.nextDouble();
                         System.out.println("Digite a média de pontos do jogador: ");
                         mediaDePontos = leitorNumber.nextDouble();
                         jogadores.adiciona(new Jogador(id, nome, nivel, primeiraRodada, segundaRodada, mediaDePontos ));
                         System.out.println("\n jogador cadastrado");
                         break;

                     case 2:
                         jogadores.exibe();
                         break;

                     case 3:
                         if (jogadores.getTamanho() == 0)
                             System.out.println("\nLista vazia, não há nada para gravar");
                         else {
                             Arquivo.gravaLista(jogadores, null);
                             jogadores.limpa();
                             System.out.println("\nArquivo gravado com sucesso");
                         }
                         break;

                     case 4:
                         reiniciaLeitores();
                         System.out.print("\nDigite o nome do arquivo a ser lido: ");
                         String nomeDoArquivo = leitorString.next();
                         Arquivo.leExibeArquivo(nomeDoArquivo);
                         break;

                     case 5:
                         System.out.println("\nPrograma encerrado");
                         fim = true;
                         break;
                     default:
                         System.out.println("Opção inválida!");
                         break;

                 }
            }catch (Exception ex) {
                System.out.println("\nErro - " + ex.toString() + ": " + ex.getMessage());
                leitorString = new Scanner(System.in);
                leitorNumber = new Scanner(System.in);
            }
        }



    }
}
