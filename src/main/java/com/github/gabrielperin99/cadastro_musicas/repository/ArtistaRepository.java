package com.github.gabrielperin99.cadastro_musicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gabrielperin99.cadastro_musicas.model.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
