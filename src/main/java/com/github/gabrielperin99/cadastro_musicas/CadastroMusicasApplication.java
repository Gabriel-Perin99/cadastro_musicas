package com.github.gabrielperin99.cadastro_musicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.gabrielperin99.cadastro_musicas.main.Main;


@SpringBootApplication
public class CadastroMusicasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CadastroMusicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.Manu();
	}

}
