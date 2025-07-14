package com.joao.desafio_posto.Service;
import org.springframework.stereotype.Service;
import com.joao.desafio_posto.infraestrutura.TipoCombustivelRepository;
import com.joao.desafio_posto.infraestrutura.entitys.TipoCombustivel;

@Service


public class UsuarioService {
    private final TipoCombustivelRepository tipoCombustivelRepository;

    public UsuarioService(TipoCombustivelRepository tipoCombustivelRepository) {
        this.tipoCombustivelRepository = tipoCombustivelRepository;
    }

    public void salvarCombustivel(TipoCombustivel nome){
        tipoCombustivelRepository.saveAndFlush(nome);
    }
    public TipoCombustivel buscarTipoCombustivelPorId(String nome){
        return tipoCombustivelRepository.findByNome(nome).orElseThrow(
                () -> new RuntimeException("Tipo de combustível não encontrado")
        );
    }
    public void deletarTipoCombustivel(String nome){
        tipoCombustivelRepository.deletebyNome(nome);
    }
    public void atualizarTipoCombustivelPorId(String nome, TipoCombustivel tipoCombustivel){
        TipoCombustivel tipoCombustivel1Entity = buscarTipoCombustivelPorId(nome);
    }
}

