package brunagarciadelfino.avaliacaocontinuada02.dominios;

import javax.persistence.*;

@Entity
public class JogadorPremium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJogadorFree;
    private Double nivelSkin;

    @ManyToOne
    private Jogador jogadorPremium;

    public Integer getIdJogadorFree() {
        return idJogadorFree;
    }

    public Double getNivelSkin() {
        return nivelSkin;
    }

    public Jogador getJogadorPremium() {
        return jogadorPremium;
    }

    public void setIdJogadorFree(Integer idJogadorFree) {
        this.idJogadorFree = idJogadorFree;
    }

    public void setNivelSkin(Double nivelSkin) {
        this.nivelSkin = nivelSkin;
    }

    public void setJogadorPremium(Jogador jogadorPremium) {
        this.jogadorPremium = jogadorPremium;
    }
}
