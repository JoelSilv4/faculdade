package brunagarciadelfino.avaliacaocontinuada02.dominios;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Integer nivel;
    private Double primeiraRodada = 0.0;
    private Double segundaRodada = 0.0;
    private Double mediaDePontos = primeiraRodada + segundaRodada /2;

    public Jogador(int id, String nome, Integer nivel, Double primeiraRodada, Double segundaRodada, Double mediaDePontos) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.primeiraRodada = primeiraRodada;
        this.segundaRodada = segundaRodada;
        this.mediaDePontos = mediaDePontos;
    }

    public Jogador() {

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Double getPrimeiraRodada() {
        return primeiraRodada;
    }

    public Double getSegundaRodada() {
        return segundaRodada;
    }

    public Double getMediaDePontos() {
        return mediaDePontos;
    }

    public void setId(int id) {
        this.id= id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setPrimeiraRodada(Double primeiraRodada) {
        this.primeiraRodada = primeiraRodada;
    }

    public void setSegundaRodada(Double segundaRodada) {
        this.segundaRodada = segundaRodada;
    }

    public void setMediaDePontos(Double mediaDePontos) {
        this.mediaDePontos = mediaDePontos;
    }

    @Override
    public String toString() {
        return String.format("%02d %-10s %04d %4.2f %4.2f %4.2f", id, nome, nivel, primeiraRodada, segundaRodada, mediaDePontos);
        /*
        return String.format(
                "Jogador:" +
                "\nID: %d" +
                "\nNome: %s" +
                "\nNivel: %d" +
                "\nDesempenho na primeira rodada: %.2f" +
                "\nDesempenho na segunda rodada: %.2f" +
                "\nMédia de pontos: %.2f"
                id, nome, nivel, primeiraRodada, segundaRodada, mediaDePontos
        );
        */
    }

}

