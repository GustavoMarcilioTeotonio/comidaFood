package com.senai.comidafood.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue
    private Long id;
    private Instant moment;

}
