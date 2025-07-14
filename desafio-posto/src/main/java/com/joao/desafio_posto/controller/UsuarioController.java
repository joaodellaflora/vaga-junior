package com.joao.desafio_posto.controller;

import com.joao.desafio_posto.Service.UsuarioService;
import com.joao.desafio_posto.infraestrutura.entitys.TipoCombustivel;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.jackson.JsonMixinModuleEntries;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final JsonMixinModuleEntries jsonMixinModuleEntries;

    @PostMapping
    public ResponseEntity<Void> salvarTipoCombusivel(@RequestBody TipoCombustivel tipoCombustivel) {
        usuarioService.salvarCombustivel(tipoCombustivel);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<TipoCombustivel> buscarTipoCombustivelPorId(@RequestParam String nome) {
        return ResponseEntity.ok(usuarioService.buscarTipoCombustivelPorId(nome));

    }

    @DeleteMapping
    public ResponseEntity<Void> deletarTipoCombustivelPorId(@RequestParam String id) {
        usuarioService.deletarTipoCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarTipoCombustivelPorId(@RequestParam String id, @RequestBody TipoCombustivel tipoCombustivel) {

        usuarioService.atualizarTipoCombustivelPorId(id, tipoCombustivel);
        return ResponseEntity.ok().build();
    }
}

