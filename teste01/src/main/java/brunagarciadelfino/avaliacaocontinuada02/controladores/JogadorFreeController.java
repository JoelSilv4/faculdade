package brunagarciadelfino.avaliacaocontinuada02.controladores;


import brunagarciadelfino.avaliacaocontinuada02.dominios.JogadorFree;
import brunagarciadelfino.avaliacaocontinuada02.repositorios.JogadorFreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadoresFree")

public class JogadorFreeController {

    private List<JogadorFree> jogadoresFree = new ArrayList<>();

    @Autowired
    private JogadorFreeRepository repository;

    @GetMapping
    public ResponseEntity getJogadores() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/simples")
    public ResponseEntity getJogadoresSimples() {
        return ResponseEntity.ok(repository.findAllSimples());
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody JogadorFree novoJogador){
        repository.save(novoJogador);
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
    public ResponseEntity atualizar(@PathVariable int idJogadorFree, @RequestBody JogadorFree jogadorAtualizado){
        jogadorAtualizado.setIdJogadorFree(idJogadorFree);
        repository.save(jogadorAtualizado);

        return ResponseEntity.ok().build();
    }






}
