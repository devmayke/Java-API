package com.api.api;

public class Objeto {

  private int id;
  private String nome;
  private String data;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }
  public Objeto(int id, String nome, String data) {
    this.id = id;
    this.nome = nome;
    this.data = data;
  }
  public Objeto() {
  }

  
}
