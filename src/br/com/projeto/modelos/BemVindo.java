package br.com.projeto.modelos;

import java.util.Scanner;

public class BemVindo extends Titular {
    public void mensagemBemVindo(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                ==========||==========
                Bem vindo ao Banco LG!
                ==========||==========
                
                ==========||============
                Deseja se afiliar a nós?
                        1 - Sim
                        2 - Não
                ==========||============
                """);
        //loop para ela escolher o 1 ou 2 que são opções validas e caso seja inserida uma não valida, ele pede uma valida
        boolean opcaoCorreta = false;
        while (!opcaoCorreta) {
            int opcaoEscolhida = leitura.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    Titular titular = new Titular();
                    titular.criarConta();
                    opcaoCorreta = true; // Sai do loop
                    break;
                case 2:
                    System.out.println("Banco LG, agradece a sua atenção!");
                    opcaoCorreta = true; // Sai do loop
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção valida!");
            }
        }
    }
}
