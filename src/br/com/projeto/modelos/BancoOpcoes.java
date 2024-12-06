package br.com.projeto.modelos;

import java.util.Scanner;

public class BancoOpcoes {
    private double saldoAtual;
    Scanner leitura = new Scanner(System.in);

    public void depositarValor(){ // metodo que será depositado o valor inicial na conta da pessoa;

        System.out.println("Agora digite o valor a ser depositado em sua conta: ");
        double valorDepositado = leitura.nextDouble();

        boolean dadosCorretos = false;

        while (!dadosCorretos){
            switch ((valorDepositado > 0)? 1 : 0){  /* (valorDepositado > 0) está condição está sendo testada.
                                                     ? 1 ? 0, o 1 quer dizer verdadeiro e o 0 quer dizer falso.*/
                case 0:
                    System.out.println("Valor inválido. Tente novamente!");
                case 1:
                    saldoAtual += valorDepositado;
                    System.out.println("Valor Depositado!");
                    System.out.println("Saldo: R$ " + saldoAtual);
                    System.out.println("""
                            ==========||==========||==========||==========||
                                        Conta criada com sucesso!
                            ==========||==========||==========||==========||
                            """);
                    escolherOpcoes();
                    dadosCorretos = true;
                    break;
            }
        }
    }

    public void voltarOpcoes(){ // metodo para voltar as opções;
        System.out.println("""
                            ==========||==========||==========||
                                    Deseja voltar para as
                                           opções?
                                           1 - Sim
                                           2 - Não
                            ==========||==========||==========||
                            """);
            boolean paraVoltarOpcoes = false;
            while (!paraVoltarOpcoes){
                int opcaoVoltar = leitura.nextInt();
                switch (opcaoVoltar){
                    case 1:
                        escolherOpcoes();
                    case 2:
                        System.out.println("Encerrando aplicação...");
                        System.out.println("O banco LG agradece a sua atenção!");
                        paraVoltarOpcoes = true;
                        break;
                }
            }
    }

    public void escolherOpcoes(){
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
        boolean paraEscolherOpcoes = false;
        while (!paraEscolherOpcoes){
            int escolherOpcoes = leitura.nextInt();
            switch (escolherOpcoes){
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    receberValor();
                    break;
                case 3:
                    transferirValor();
                    break;
                case 4:
                    System.out.println("Encerrando aplicação...");
                    System.out.println("O banco LG agradece a sua atenção!");
                    paraEscolherOpcoes = true;
                    break;
                default:
                    System.out.println("Opção invalida, poderia tentar novamente!");
                    break;
            }
        }
    }

    public void consultarSaldo(){ //metodo que consulta o saldo;
        System.out.println("Seu saldo atual é de: R$ " + saldoAtual);
        voltarOpcoes();
    }

    public void receberValor(){ // metodo que recebe valor;
        System.out.println("Digite o valor a ser recebido:");
        double valorRecebido = leitura.nextDouble();
        saldoAtual += valorRecebido;

        System.out.println("R$ " + valorRecebido + " recebido com sucesso!");
        System.out.println("Seu saldo atual é de R$ " + saldoAtual);
        voltarOpcoes();
    }

    public void transferirValor(){ // metodo que transfere valor;
        System.out.println("Digite o valor que deseja ser transferido:");
        double valorTransferido = leitura.nextDouble();
        if (valorTransferido <= saldoAtual){
            saldoAtual -= valorTransferido;
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Seu saldo atual é de R$ " + saldoAtual);
            voltarOpcoes();
        } else if (valorTransferido > saldoAtual) {
            System.out.println("Valor acima do seu limite, tente novamente:");
            transferirValor();
        } else {
            System.out.println("Tente novamente...");
            transferirValor();
        }

    }
}
