package main.java;

import java.sql.Date;

public class Produto {
    int id;
    String nome;
    String cnpj;
    String descricao;
    String fornecedor; // provavelmente um objeto futuramente
    Date dataCadastro;

    public Produto(int id, String nome, String cnpj, String descricao, String fornecedor, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.dataCadastro = dataCadastro;
    }

    void cadastrarProduto() {

    }

    void buscarProdutoPorNome() {

    }

    void listarProdutos() {

    }

    void deletarProduto() {

    }
}
