package com.example.eopixnadaainda.Controller;

import com.example.eopixnadaainda.BancoDeDados.Lojistabd;
import com.example.eopixnadaainda.Model.Lojista;

import java.util.List;

public class LojistaController {
    Lojistabd bl = new Lojistabd();
    private List<Lojista> getAllLojistas(){
        return bl.findAll();
    }


}
