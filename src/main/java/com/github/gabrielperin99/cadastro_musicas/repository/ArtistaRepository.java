package com.github.gabrielperin99.cadastro_musicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.github.gabrielperin99.cadastro_musicas.model.Artista;
import com.github.gabrielperin99.cadastro_musicas.model.Musica;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    @Query ("SELECT m FROM Musica m CROSS JOIN Artista a")
	List<Musica> BuscarListaDeMusicas();

    @Query("SELECT m FROM Musica m JOIN m.artista a WHERE LOWER(a.nome) LIKE CONCAT('%', :artista, '%')")
    List<Musica> BuscarListaDeMusicasPorArtista(String artista);

   
}
