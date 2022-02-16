package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.println("Digite o primeiro valor: ");
        primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        segundoNumero = scan.nextInt();

        int soma = somar(primeiroNumero, segundoNumero);
        int subtracacao = subtrair(primeiroNumero, segundoNumero);
        int multiplicacao = multiplicar(primeiroNumero, segundoNumero);
        int divisao = dividir(primeiroNumero, segundoNumero);

        System.out.println("A soma é " + soma);
        System.out.println("A subtracacão é " + subtracacao);
        System.out.println("A multiplicacão é " + multiplicacao);
        System.out.println("A divisão é " + divisao);

    }

    public static int somar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }
    public static int subtrair(int primeiroNumero, int segundoNumero) {
        return primeiroNumero - segundoNumero;
    }
    public static int multiplicar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero * segundoNumero;
    }
    public static int dividir(int primeiroNumero, int segundoNumero) {
        return primeiroNumero / segundoNumero;
    }

}
