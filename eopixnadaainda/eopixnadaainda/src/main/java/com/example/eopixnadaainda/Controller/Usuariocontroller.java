package com.example.eopixnadaainda.Controller;

import com.example.eopixnadaainda.BancoDeDados.UsuarioBd;
import com.example.eopixnadaainda.Model.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class Usuariocontroller {
     UsuarioBd bu = new UsuarioBd();
     private List<Usuario> getAllUsuarios(){
         return bu.findall();

     }
}
