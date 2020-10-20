package brunagarciadelfino.avaliacaocontinuada02.controladores;

import brunagarciadelfino.avaliacaocontinuada02.dominios.Jogador;
import brunagarciadelfino.avaliacaocontinuada02.repositorios.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<>();


    @Autowired
    private JogadorRepository repository;



    @GetMapping
    public ResponseEntity getJogadores() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/simples")
    public ResponseEntity getJogadoresSimples() {
        return ResponseEntity.ok(repository.findAllSimples());
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Jogador novoJogo){
        repository.save(novoJogo);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity excluirUm(@PathVariable int id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable int id, @RequestBody Jogador jogadorAtualizado){
        jogadorAtualizado.setId(id);
        repository.save(jogadorAtualizado);

        return ResponseEntity.ok().build();
    }



}
