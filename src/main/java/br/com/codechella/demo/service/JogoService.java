package br.com.codechella.demo.service;

import br.com.codechella.demo.domain.Jogo;
import br.com.codechella.demo.domain.JogosDTO;
import br.com.codechella.demo.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class JogoService {
    @Autowired
    private JogoRepository jogoRepository;
    public Jogo createJogo(JogosDTO jogo) {
        Jogo newJogo = new Jogo();
        newJogo.setGameName(jogo.gameName());
        newJogo.setGameSize(jogo.gameSize());
        newJogo.setGamePrice(jogo.gamePrice());
        Jogo jogoSaved = jogoRepository.save(newJogo);
        System.out.println("Jogo criado com ID: " + jogoSaved.getId());
        return jogoSaved;


    }

    public List<Jogo> findAllJogos() {
        return jogoRepository.findAll();
    }

    public Jogo findJogoById(UUID id){
        return jogoRepository.findById(id).orElse(null);
    }
}
