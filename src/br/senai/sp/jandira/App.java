package br.senai.sp.jandira;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] carros = {"x1", "fusca", "ferrari", "uno"};


        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("/-      Bem Vindo      -/");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/");
        boolean validaCar = false;

        for (int i = 0; i < carros.length; i++) {
            System.out.println("carro" + (i + 1) + " : " + carros[i]);
        }

        System.out.println("Escolha seu Carro:");

        String opcaousuario = teclado.nextLine();

        for (int i = 0; i < carros.length; i++) {
            if (opcaousuario.equalsIgnoreCase(carros[i])) {
                System.out.println("Este veiculo está disponivel");
                validaCar = true;

            }
        }

        if (!validaCar) {
            System.out.println("Infelizmente este veiculo não está disponivel");
        }
    }
}