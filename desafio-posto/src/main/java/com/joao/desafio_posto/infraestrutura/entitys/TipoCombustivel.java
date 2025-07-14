package com.joao.desafio_posto.infraestrutura.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tipo_combustivel")
@Entity
public class TipoCombustivel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "nome")
    private String nome;

}
