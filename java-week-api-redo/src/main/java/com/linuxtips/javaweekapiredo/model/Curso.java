package com.linuxtips.javaweekapiredo.model;

import jakarta.persistence.*;

@Entity //indica que é uma entidade de dados que seram persistidos no banco
@Table(name = "curso") //indica que é uma tabela do banco e damos o nome
public class Curso {
    @Id //indica que é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estratégia de gerção automática do Id
    private Long id;
    @Column(nullable = false) //indica que esse campo é uma coluna da tabela e não pode ser nula
    private String nome;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false)
    private String pessoaInstrutora;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getPessoaInstrutora() {
        return pessoaInstrutora;
    }

    public void setPessoaInstrutora(String pessoaInstrutora) {
        this.pessoaInstrutora = pessoaInstrutora;
    }
}
