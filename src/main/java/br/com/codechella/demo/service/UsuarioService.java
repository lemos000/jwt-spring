package br.com.codechella.demo.service;

import br.com.codechella.demo.domain.Usuario;
import br.com.codechella.demo.domain.UsuarioDTO;
import br.com.codechella.demo.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository userRepo;
    @Transactional
    public Usuario createUsuario(UsuarioDTO user){
        Usuario newUser = new Usuario();
        newUser.setEmail(user.email());
        newUser.setNome(user.nome());
        newUser.setSenha(user.senha());
        Usuario savedUser = userRepo.save(newUser);
        System.out.println("User created with ID: " + savedUser.getId());

        return savedUser;
    }

    public Usuario findUserById(UUID id){
        return userRepo.findById(id).orElse(null);
    }

    public List<Usuario> findAllUsers(){
        return userRepo.findAll();

    }
}
