package com.github.gabrielperin99.cadastro_musicas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity 
@Table (name = "musicas")
public class Musica {
    public Musica(){}

    public Musica(String nome, String genero, String duracao, Artista artista) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.artista = artista;
    }
    @ManyToOne 
    @JoinColumn (name = "artista_id")
    private Artista artista;

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String genero;
    private String duracao;


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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Artista getArtista() {
       return artista;
    }

}
