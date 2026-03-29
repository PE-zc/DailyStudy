package com.dailystudy.backend.dto;

import lombok.Data;


//Aqui nao precisamos colocar o Id pois o MongoDB gera sozinho
@Data
public class RegistroUsuario {
    private String usuario;
    private String email;
    private String senha;
}
