package com.example.eopixnadaainda.BancoDeDados;

import com.example.eopixnadaainda.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UsuarioBd {
    private List<Usuario> usuarios;

    public UsuarioBd() {
        this.usuarios = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Usuario u) {
        usuarios.add(u);
    }

    // Busca um produto pelo ID
    public Usuario findOne(String CPF) {
        for (Usuario u : usuarios) {
            if (Objects.equals(u.getCPF(), CPF)) {
                return u;
            }
            continue;
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Usuario> findAll() {
        return new ArrayList<>(usuarios);
    }

    // Atualiza um produto existente na lista
    public boolean update(Usuario u) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCPF().equals(u.getCPF())) {
                usuarios.set(i, u);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(String CPF) {
        return usuarios.removeIf(p -> Objects.equals(p.getCPF(), CPF));
    }

    public List<Usuario> findall() {
        return usuarios;
    }
}


