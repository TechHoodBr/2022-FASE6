package br.com.fiap.supermercado.controller;

import br.com.fiap.supermercado.dto.EnderecoDTO;
import br.com.fiap.supermercado.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EnderecoDTO> buscarTodos() {
        return enderecoService.buscarTodos();
    }
}