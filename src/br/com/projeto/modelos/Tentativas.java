package br.com.projeto.modelos;

public class Tentativas {
    public void qtdTentativas (){
        int tentativas = 0;
        int limiteTentativas = 3;

        while (tentativas < limiteTentativas){
            tentativas++;
            if (tentativas < limiteTentativas){
                System.out.println("Você possui " + (limiteTentativas - tentativas) + " restantes!");
            }
        }
    }
}
