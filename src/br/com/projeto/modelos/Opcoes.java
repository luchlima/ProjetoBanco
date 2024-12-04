package br.com.projeto.modelos;

import java.util.Scanner;

public class Opcoes {

    private DepositoValor depositoValor;
    public Opcoes(DepositoValor depositoValor){
        this.depositoValor = depositoValor;
    }

    public void escolherOpcao(){
        Scanner leitura = new Scanner(System.in);
        double saldoAtual;
        System.out.println("""
                            ==========||==========||==========||
                                        Operações:
                ==========||==========||==========||==========||==========||
                                    1 - Consultar Saldos
                                    2 - Receber Valor
                                    3 - Transferir Valor
                                    4 - Sair
                ==========||==========||==========||==========||==========||
                """);

        boolean opcaoDigitada = false;

        while (!opcaoDigitada){

            int escolhido = leitura.nextInt();

            switch (escolhido){
                case 1:
                    System.out.println("Saldo atual de: R$ " + depositoValor.getSaldoAtual());
                    System.out.println("""
                            ==========||==========||==========||
                                    Deseja voltar para as
                                           opções?
                                           1 - Sim
                                           2 - Não
                            ==========||==========||==========||
                            """);
                    int opcaoVoltar = leitura.nextInt();

                    if (opcaoVoltar == 1){
                        escolherOpcao();
                    } else {
                        System.out.println("Banco LG agradece a sua visita!");
                        System.out.println("Encerrando aplicação...");
                    }
                    opcaoDigitada = true;
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    double valorRecebido = leitura.nextDouble();
                    System.out.println("O valor R$ " + valorRecebido + " está correto?");
                    System.out.println("""
                            ==========||==========||==========||
                                         1 - Sim
                                         2 - Não
                            ==========||==========||==========||
                            """);
                    int opcaoRecebido = leitura.nextInt();
                    if (opcaoRecebido == 1){
                        saldoAtual = depositoValor.getSaldoAtual() + valorRecebido;
                        System.out.println("Recebimento confirmado com sucesso!");
                        System.out.println("Seu saldo atual é de R$ " + saldoAtual);
                    }


                case 3:

                case 4:

            }
        }
    }
}
