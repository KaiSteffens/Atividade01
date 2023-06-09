package com.example.exercicio02.controller;

import com.example.exercicio02.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.exercicio02.service.UsuarioService;

import java.util.List;
@RequestMapping("/sistema")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping ("/usuario/{id}")
    public Usuario  buscarUsuario (@PathVariable long id){
        return usuarioService.buscarUsuario(id);
    }

@PostMapping("usuario")
    public Usuario cadastrarUsuario (@RequestBody Usuario usuario){
        return usuarioService.cadastrarUsuario(usuario);

}
@GetMapping("usuarios")
public List<Usuario> buscarUsuarios(){
    return usuarioService.buscarUsuarios();
}

@PutMapping("atualizar/{id}")
public Usuario  atualizarUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(id,usuario);
    }
}
