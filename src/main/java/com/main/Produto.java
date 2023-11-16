package com.main;

public class Produto {
   int id;
   int codigo;
   String nome;
   String descricao;
   String fornecedor;
   String dataCadastro;
   
   public Produto(int id, int codigo, String nome, String descricao, String fornecedor, String dataCadastro) {
    this.id = id;
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.fornecedor = fornecedor;
    this.dataCadastro = dataCadastro;
   }

   Produto mostrarProduto() {
    return this;
   }
}
