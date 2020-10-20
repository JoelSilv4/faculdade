package brunagarciadelfino.avaliacaocontinuada02.dominios;

import javax.persistence.*;

@Entity
public class JogadorFree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJogadorFree;
    private Double poderHabilidade;

    @ManyToOne
    private Jogador jogadorFree;

    public Integer getIdJogadorFree() {
        return idJogadorFree;
    }

    public Double getPoderHabilidade() {
        return poderHabilidade;
    }

    public void setIdJogadorFree(Integer idJogadorFree) {
        this.idJogadorFree = idJogadorFree;
    }

    public void setPoderHabilidade(Double poderHabilidade) {
        this.poderHabilidade = poderHabilidade;
    }
}
