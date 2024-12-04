package br.com.projeto.modelos;

import java.util.Scanner;

public class TipoConta extends DepositoValor{
    public void tipoConta(){
        DepositoValor depositoValor = new DepositoValor();
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
                    depositoValor.depositarValor();
                    dadosCorretos = true; // Sai do loop
                    break;
                case 2:
                    System.out.println("Você escolheu a conta poupança!");
                    depositoValor.depositarValor();
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
