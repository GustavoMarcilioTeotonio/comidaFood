package com.senai.comidafood.models;

import com.senai.comidafood.Enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "cidades")
public class Cidade {
    @Id
    @GeneratedValue
    private long id;
    private Estado estado;
    private String nome;

    public Cidade(){
    }

    public Cidade(Estado estado, String name) {
        this.estado = estado;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(id, cidade.id) && Objects.equals(nome, cidade.nome) && Objects.equals(estado, cidade.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
