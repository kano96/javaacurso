package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Kevin");
        usuario.setApellido("Torres");
        usuario.setEmail("kevin@test.com");
        usuario.setTelefono("123333");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Kevin");
        usuario.setApellido("Torres");
        usuario.setEmail("kevin@test.com");
        usuario.setTelefono("123333");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Kevin");
        usuario.setApellido("Torres");
        usuario.setEmail("kevin@test.com");
        usuario.setTelefono("123333");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Kevin");
        usuario.setApellido("Torres");
        usuario.setEmail("kevin@test.com");
        usuario.setTelefono("123333");
        return usuario;
    }
}
