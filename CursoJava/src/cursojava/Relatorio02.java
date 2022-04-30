package cursojava;

import java.util.Scanner;

public class Relatorio02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        float salario;

        System.out.println("Digite seu nome");
        nome = ler.next();
        System.out.println("Digite seu sexo");
        sexo = ler.next();
        System.out.println("Digite seu estado civil");
        estadoCivil = ler.next();
        System.out.println("Digite sua idade");
        idade = ler.nextInt();
        System.out.println("Digite seu salário");
        salario = ler.nextFloat();

        System.out.println("O trabalhador " + nome + " do sexo " + sexo +
                ", idade: " + idade + ", estado civil: " + estadoCivil +
                " está empregado neste estabelecimento e recebe o salário de R$" + salario);

    }

}
