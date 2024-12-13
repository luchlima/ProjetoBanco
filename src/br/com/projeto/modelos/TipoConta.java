package br.com.projeto.modelos;

import java.util.Scanner;

public class TipoConta extends BancoOpcoes{
    public void tipoConta(){
        BancoOpcoes bancoOpcoes = new BancoOpcoes();
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Escolha o tipo de conta:
                1 - Corrente
                2 - Poupança
                3 - Sair
                """);


        boolean dadosCorretos = false;
        while (!dadosCorretos){
            int numeroInserido = leitura.nextInt();

            switch (numeroInserido){
                case 1:
                    System.out.println("Você escolheu a conta corrente!");
                    bancoOpcoes.depositarValor();
                    dadosCorretos = true; // Sai do loop
                    break;
                case 2:
                    System.out.println("Você escolheu a conta poupança!");
                    bancoOpcoes.depositarValor();
                    dadosCorretos = true; // Sai do loop
                    break;
                case 3:
                    System.out.println("O banco LG, agradece a sua atenção...");
                    dadosCorretos = true; // Sai do loop
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma das opções validas!");
            }
        }

    }

}
