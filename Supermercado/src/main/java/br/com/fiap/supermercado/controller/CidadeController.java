package br.com.fiap.supermercado.controller;

import br.com.fiap.supermercado.dto.CidadeDTO;
import br.com.fiap.supermercado.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CidadeDTO> buscarTodos() {
        return cidadeService.buscarTodos();
    }
}