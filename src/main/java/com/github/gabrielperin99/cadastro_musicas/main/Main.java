package com.github.gabrielperin99.cadastro_musicas.main;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    
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
            
        }

                
    }
}
