package brunagarciadelfino.avaliacaocontinuada02.repositorios;


import brunagarciadelfino.avaliacaocontinuada02.dominios.JogadorFree;
import brunagarciadelfino.avaliacaocontinuada02.visoes.JogadorSimples;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JogadorFreeRepository extends CrudRepository<JogadorFree, Integer> {

    @Query(
            "select new brunagarciadelfino.avaliacaocontinuada02.visoes.JogadorFreeSimples (j.idJogadorFree, j.poderHabilidade) from JogadorFree j"
    )
    List<JogadorSimples> findAllSimples();

}
