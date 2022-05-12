package academy.devdojo.cursojava.introduction;


import java.util.Scanner;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        short idade;
        boolean isAutorizadoComprarBebidaAlcoolica;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = ler.nextShort();
        isAutorizadoComprarBebidaAlcoolica = idade >=18;

        if (isAutorizadoComprarBebidaAlcoolica){
            System.out.println("Você está autorizado a comprar bebida alcoólica");
        }else {
            System.out.println("Você não está autorizado a comprar bebida alcoólica");
        }

    }
}
