package brunagarciadelfino.avaliacaocontinuada02.dominios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arquivo {
    public static void gravaLista(ListaObj<Jogador> lista, String nomeDoArquivo) {
        FileWriter arquivo = null;
        Formatter saida = null;
        String nomeDoArquivoDefault = "jogador.csv";
        boolean crashed = false;

        if (nomeDoArquivo == null)
            nomeDoArquivo = nomeDoArquivoDefault;
        if (!nomeDoArquivo.endsWith(".csv"))
            nomeDoArquivo += ".csv";

        try {
            arquivo = new FileWriter(nomeDoArquivo, true);
            saida = new Formatter(arquivo);
        } catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Jogador jogadores = lista.getElemento(i);
                saida.format("%04d;%-20s;%04d;%4.2f;%4.2f;%4.2f%n",
                        jogadores.getId(),
                        jogadores.getNome(),
                        jogadores.getNivel(),
                        jogadores.getPrimeiraRodada(),
                        jogadores.getSegundaRodada(),
                        jogadores.getMediaDePontos()
                );
            }
        } catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            crashed = true;
        } finally {
            saida.close();
            try {
                arquivo.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                crashed = true;
            }
            if (crashed)
                System.exit(1);
        }
    }

    public static void leExibeArquivo(String nomeDoArquivo) {
        FileReader arquivo = null;
        Scanner entrada = null;
        boolean crashed = false;

        try {
            arquivo = new FileReader(nomeDoArquivo);
            entrada = new Scanner(arquivo).useDelimiter(";|\\n|\\r\\n");
        } catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%-10s%15s%-35s%-7s%-6s\n","ID JOGADOR","NOME","NÍVEL", "PRIMEIRA RODADA", "SEGUNDA RODADA", "MEDIA DE PONTOS");
            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                int nivel = entrada.nextInt();
                double primeiraRodada = entrada.nextDouble();
                double segundaRodada = entrada.nextDouble();
                double mediaDePontos = entrada.nextDouble();

                System.out.printf("%04d;%-20s;%04d;%4.2f;%4.2f;%4.2f%\n",id,nome,nivel, primeiraRodada, segundaRodada, mediaDePontos);
            }
        } catch (NoSuchElementException erro) {
            System.err.println("Arquivo com problemas.");
            crashed = true;
        } catch (IllegalStateException erro) {
            System.err.println("Erro na leitura do arquivo.");
            crashed = true;
        } finally {
            entrada.close();
            try {
                arquivo.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                crashed = true;
            }
            if (crashed)
                System.exit(1);
        }
    }
}
