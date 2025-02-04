package br.com.codechella.demo.controller;

import br.com.codechella.demo.domain.Jogo;
import br.com.codechella.demo.domain.JogosDTO;
import br.com.codechella.demo.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoController {
    @Autowired
    private JogoService jogoService;

    @GetMapping("/find/all")
    public ResponseEntity<List<Jogo>> findAllJogos() {
        List<Jogo> allJogos = jogoService.findAllJogos();
        return ResponseEntity.ok(allJogos);


    }

    @PostMapping("/cadastro")
    public ResponseEntity<Jogo> createJogo(JogosDTO jogo) {
        Jogo newJogo = jogoService.createJogo(jogo);
        return ResponseEntity.ok(newJogo);

    }
}
