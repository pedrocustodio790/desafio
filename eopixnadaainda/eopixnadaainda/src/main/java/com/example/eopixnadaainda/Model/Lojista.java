package com.example.eopixnadaainda.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lojista {
    private String NomeCompleto;
    private String CNPJ;
    private int Senha;
    private String Email;
}
