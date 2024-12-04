package br.com.projeto.modelos;

import java.util.Scanner;

public class DepositoValor{
    private double saldoAtual;

    public void depositarValor(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Agora digite o valor a ser depositado em sua conta: ");
        double valorDepositado = leitura.nextDouble();

        saldoAtual += valorDepositado;

        boolean dadosCorretos = false;

        while (!dadosCorretos){                    // (valorDepositado > 0) está condição está sendo testada.
            switch ((valorDepositado > 0)? 1 : 0){ // ? 1 ? 0 o 1 quer dizer verdadeiro e o 0 quer dizer falso.
                case 0:
                    System.out.println("Valor inválido. Tente novamente!");
                case 1:

                    System.out.println("Valor Depositado!");
                    System.out.println("Saldo: R$ " + getSaldoAtual());
                    System.out.println("""
                            ==========||==========||==========||==========||
                                        Conta criada com sucesso!
                            ==========||==========||==========||==========||
                            """);
                    dadosCorretos = true;
                    Opcoes opcoes = new Opcoes(this);
                    opcoes.escolherOpcao();

            }
        }
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }


}
