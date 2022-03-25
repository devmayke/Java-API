package com.api.api.controller;

import com.api.api.model.Cliente;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

  @PostMapping("/cliente")
  public Cliente inserirCliente(@RequestParam String nome){
    Cliente cliente = new Cliente();
    cliente.setNome(nome);
    return cliente;

  }

  
}
