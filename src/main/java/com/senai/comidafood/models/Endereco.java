package com.senai.comidafood.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
    @Id
    @GeneratedValue
    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String estado;
    private String cep;
}
