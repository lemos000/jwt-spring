package br.com.codechella.demo.service;

import br.com.codechella.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service public class AuthorizationService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UserDetails loadUserByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}
