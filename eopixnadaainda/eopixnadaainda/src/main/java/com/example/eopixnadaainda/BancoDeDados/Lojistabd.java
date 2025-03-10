package com.example.eopixnadaainda.BancoDeDados;

import com.example.eopixnadaainda.Model.Lojista;
import com.example.eopixnadaainda.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lojistabd {
    private List<Lojista> lojistas;

    public Lojistabd() {
        this.lojistas = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Lojista l) {
        lojistas.add(l);
    }

    // Busca um produto pelo ID
    public Lojista findOne(String CNPJ) {
        for (Lojista l : lojistas) {
            if (!Objects.equals(l.getCNPJ(),CNPJ)) {
                continue;
            }
            return l;
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Lojista> findAll() {
        return new ArrayList<>(lojistas);
    }

    // Atualiza um produto existente na lista
    public boolean update(Lojista l) {
        for (int i = 0; i < lojistas.size(); i++) {
            if (lojistas.get(i).getCNPJ().equals(l.getCNPJ())) {

                lojistas.set(i, l);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(String CNPJ) {
        return lojistas.removeIf(p -> Objects.equals(p.getCNPJ(), CNPJ));
    }

    public List<Lojista> findall() {
        return lojistas;
    }
}

