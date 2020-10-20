package brunagarciadelfino.avaliacaocontinuada02.repositorios;

import brunagarciadelfino.avaliacaocontinuada02.dominios.Jogador;
import brunagarciadelfino.avaliacaocontinuada02.visoes.JogadorSimples;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JogadorRepository extends CrudRepository<Jogador, Integer> {

    @Query(
            "select new brunagarciadelfino.avaliacaocontinuada02.visoes.JogadorSimples (j.id, j.nome) from Jogador j"
    )
       List<JogadorSimples> findAllSimples();

}
