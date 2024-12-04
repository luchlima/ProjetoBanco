package br.com.projeto.modelos;

import java.util.Scanner;

public class Titular extends TipoConta {

    public void criarConta (){
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                ==========||==========||==========||==========||==========||
                Precisamos das seguintes informações para começar o cadastro!
                ==========||==========||==========||==========||==========||
                """);

        System.out.println("==========||==========");
        System.out.println("Digite o seu nome: ");
        String nomeTitular = leitura.nextLine();
        System.out.println("Agora, digite o seu CPF: ");
        double cpfTitular = leitura.nextDouble();

        System.out.println("""
                ===============||===============
                Suas informações estão corretas?
                ===============||===============""");
        System.out.println("Nome: " + nomeTitular);
        System.out.println("CPF: " + cpfTitular);
        System.out.println("""
                ===============||===============
                ===||===
                1 - Sim
                2 - Não
                ===||===
                """);

        // loop para saber qual será a opção inserida 1 ou 2
       // enquanto o dadosCorretos for false ele vai rodar o loop, se ele virar true, o loop será finalizado
        boolean dadosCorretos = false;
        while (!dadosCorretos) {
            int confirmacao = leitura.nextInt();
            switch (confirmacao) {
                case 1:
                    System.out.println("Informações confirmadas com sucesso!");
                    TipoConta conta = new TipoConta();
                    conta.tipoConta();
                    dadosCorretos = true; // Sai do loop
                    break;
                case 2:
                    System.out.println("Por favor, reinicie o cadastro.");
                    criarConta();
                    dadosCorretos = true; // Sai do loop
                    break;
                default:
                    System.out.println("Opção inválida. Digite 1 para Sim ou 2 para Não.");
            }
        }
    }

}
