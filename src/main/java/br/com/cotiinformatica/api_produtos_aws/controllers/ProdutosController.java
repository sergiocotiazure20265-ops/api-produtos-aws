package br.com.cotiinformatica.api_produtos_aws.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutosController {

    @PostMapping("criar")
    public ResponseEntity<?> post() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("alterar")
    public ResponseEntity<?> put() {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("excluir")
    public ResponseEntity<?> delete() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("listar")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("obter")
    public ResponseEntity<?> obter() {
        return ResponseEntity.ok().build();
    }
}
