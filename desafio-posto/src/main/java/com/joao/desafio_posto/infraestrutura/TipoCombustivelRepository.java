package com.joao.desafio_posto.infraestrutura;

import com.joao.desafio_posto.infraestrutura.entitys.TipoCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public interface TipoCombustivelRepository extends JpaRepository<TipoCombustivel, String> {

    Optional<TipoCombustivel> findByNome(String nome);

    @Transactional
   void deletebyNome(String nome);
}
