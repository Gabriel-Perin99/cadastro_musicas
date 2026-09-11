package com.github.gabrielperin99.cadastro_musicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.github.gabrielperin99.cadastro_musicas.model.Artista;
import com.github.gabrielperin99.cadastro_musicas.model.Musica;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

   
}
