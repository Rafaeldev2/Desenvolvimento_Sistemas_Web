package com.example.api.entity;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long codigo;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = true)
    private String isbn;

    @Column(nullable = false)
    private String autor;

    public Livro(Long codigo, String titulo, String isbn, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
