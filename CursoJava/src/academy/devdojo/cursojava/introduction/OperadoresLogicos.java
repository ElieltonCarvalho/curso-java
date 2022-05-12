package academy.devdojo.cursojava.introduction;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short idade;
        float salario;
        System.out.println("Digite sua idade");
        idade = input.nextShort();
        System.out.println("Digite seu salário");
        salario = input.nextFloat();

        if(idade > 30 && salario >= 4612){
            System.out.println("Você está dentro da lei com idade maior que 30");
        }else if(idade < 30 && salario >= 3381){
            System.out.println("Você está dentro da lei com idade menor que trinta");
        }else{
            System.out.println("Não atende nenhuma das condições");
        }
    }
}
