package br.com.ipbcentralbetim.predestinado.controllers;

import br.com.ipbcentralbetim.predestinado.busines.MembroService;
import br.com.ipbcentralbetim.predestinado.models.Membro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/membro")
public class MembroController {
    @Autowired
    private MembroService membroService;

    @PostMapping
    public ResponseEntity<Membro> salvar(@RequestBody Membro membro) {

        Membro membroSalvo = membroService.salvar(membro);

        return ResponseEntity
                .created(URI.create("/membro"))
                .body(membroSalvo);

    }

    @PutMapping
    public ResponseEntity<Membro> atualizar(@RequestBody Membro membro) {

        Membro membroAtualizado = membroService.atualiza(membro);

        return ResponseEntity
                .accepted()
                .body(membroAtualizado);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") Integer id) {
        membroService.excluir(id);
        return ResponseEntity.accepted().body("Membro deletado com Sucesso!");
    }

    @GetMapping("{id}")
    public ResponseEntity<Membro> consultar(@PathVariable("id") Integer id) {
        Membro membroEncontrado = membroService.consultar(id);

        return ResponseEntity.ok(membroEncontrado);
    }

}
