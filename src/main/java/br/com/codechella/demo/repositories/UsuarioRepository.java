package br.com.codechella.demo.repositories;

import br.com.codechella.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    UserDetails findByEmail(String email);
}