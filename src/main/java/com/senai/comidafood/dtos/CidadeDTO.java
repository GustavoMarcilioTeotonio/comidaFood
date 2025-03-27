package com.senai.comidafood.dtos;

import com.senai.comidafood.Enums.Estado;
import lombok.Data;

@Data
public class CidadeDTO {
    private Long id;
    private String nome;
    private Estado estado;

    public CidadeDTO () {

    }

    public CidadeDTO(Long id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }
}
