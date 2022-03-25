package com.api.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")

public class Calculadora {

  @GetMapping("/{num1}/{num2}")
  public String calculadora(@PathVariable int num1, @PathVariable int num2) {
    System.out.println(num1);
    System.out.println(num2);
    return "O resultado é " + (num1 + num2);

  }

}
