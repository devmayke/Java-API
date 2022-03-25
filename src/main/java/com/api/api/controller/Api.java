package com.api.api.controller;

import com.api.api.Objeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Api {

  @GetMapping("/")
  public Objeto index(){
    Objeto obj = new Objeto();
    obj.setNome("Ken");
    obj.setId(2);
    obj.setData("amanhã");
    System.out.println(obj);


    return obj;
  }
  
}
