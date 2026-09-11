package com.github.gabrielperin99.cadastro_musicas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.gabrielperin99.cadastro_musicas.main.Main;
import com.github.gabrielperin99.cadastro_musicas.repository.ArtistaRepository;


@SpringBootApplication
public class CadastroMusicasApplication implements CommandLineRunner{
	@Autowired 
	private ArtistaRepository artistaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CadastroMusicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(artistaRepository);
		main.Manu();
	}

}
