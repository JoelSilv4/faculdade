package brunagarciadelfino.avaliacaocontinuada02.visoes;

public class JogadorFreeSimples {

    private Integer idJogadorFree;
    private String poderHabilidade;

    public JogadorFreeSimples(Integer idJogadorFree, String poderHabilidade) {
        this.idJogadorFree = idJogadorFree;
        this.poderHabilidade = poderHabilidade;
    }

    public Integer getIdJogadorFree() {
        return idJogadorFree;
    }

    public String getPoderHabilidade() {
        return poderHabilidade;
    }

    public void setIdJogadorFree(Integer idJogadorFree) {
        this.idJogadorFree = idJogadorFree;
    }

    public void setPoderHabilidade(String poderHabilidade) {
        this.poderHabilidade = poderHabilidade;
    }
}
