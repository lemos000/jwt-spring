package br.com.codechella.demo.controller;

import br.com.codechella.demo.domain.Usuario;
import br.com.codechella.demo.domain.UsuarioDTO;
import br.com.codechella.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioService userService;


    @GetMapping("/find/{id}")
    public ResponseEntity<Usuario> findUserById(@PathVariable UUID id){
        Usuario usuario = userService.findUserById(id);
        return ResponseEntity.ok(usuario);
    }
    @PostMapping("/cadastro")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody UsuarioDTO usuario){
        Usuario createdUser = userService.createUsuario(usuario);
        return ResponseEntity.ok(createdUser);

    }

    @GetMapping("/find/all")
    public ResponseEntity<List<Usuario>> findAllUsers(){

        List<Usuario> listaUsuarios = userService.findAllUsers();
        return ResponseEntity.ok(listaUsuarios);
    }
}
