package br.com.codechella.demo.repositories;

import br.com.codechella.demo.domain.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogoRepository extends JpaRepository<Jogo, UUID> {
}
