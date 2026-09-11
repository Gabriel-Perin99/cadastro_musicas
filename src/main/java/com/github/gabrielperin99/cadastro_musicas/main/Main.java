package com.github.gabrielperin99.cadastro_musicas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;



import com.github.gabrielperin99.cadastro_musicas.model.Artista;
import com.github.gabrielperin99.cadastro_musicas.model.Musica;
import com.github.gabrielperin99.cadastro_musicas.repository.ArtistaRepository;

public class Main {
    Scanner scanner = new Scanner(System.in);

    ArtistaRepository repository;
    public Main(ArtistaRepository repository) {
        this.repository = repository;
    }

    public void Manu(){
        var opcao = -1;
        
        while(opcao != 9){
            var menu = """

                        *** Bem vindo ao cadastro de músicas! *** 
    
                        1 - Cadastrar artista
                        2 - Cadastrar música
                        3 - Listar músicas
                        4 - Buscar musicas por artista
                        5 - Pesqueisar dados sobre um artista
    
                        9 - sair
                    """;; 
            System.out.println(menu);
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2: 
                   cadastrarMusica();
                   break;
                case 3:
                    listarMusicas();
                case 4:
                    buscarMusicaPorArtista();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }  
        } 
    }
    
    public void cadastrarArtista() {
        var info = """

                *** Cadastrar artista ***

                """;
        System.out.println(info);
        System.out.print("Nome do artista: ");
        var nome = scanner.nextLine();
        Artista art = new Artista(nome);
        repository.save(art);
        System.out.println("Artista cadastrado");

    }
    public void cadastrarMusica() {
        var info = """

                *** Cadastrar musica ***

                """;
        System.out.println(info);
        System.out.println("Selecione um artista cadastrado");
        List<Artista> listaArtistas = repository.findAll();
        for (Artista artista : listaArtistas){
            System.out.println(artista.getId() +" - " + artista.getNome());
        }
        System.out.print("Digite o ID do artista:");
        Long idArtista = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Nome da musica:");
        String nomeMusica = scanner.nextLine();
        System.out.print("Genero da musica:");
        String generoMusica = scanner.nextLine();
        System.out.print("Duracao da musica:");
        String duracaoMusica = scanner.nextLine();

        Optional<Artista> artistaOptional = repository.findById(idArtista);
        if (artistaOptional.isPresent()) {
            Artista artista = artistaOptional.get();

            Musica musica = new Musica(nomeMusica, generoMusica, duracaoMusica,artista);
            
            artista.getMusicas().add(musica);

            repository.save(artista);

            System.out.println("Musica adicionada com sucesso!");

        } else {
            System.out.println("Artista não encontrado");
        }
    }
    
    public void listarMusicas() {}
    public void buscarMusicaPorArtista() {}
}
