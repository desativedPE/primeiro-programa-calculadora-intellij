package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeiroNumero, segundoNumero;
        String operacao;

        System.out.println("Digite o primeiro valor: ");
        primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        segundoNumero = scan.nextInt();
        System.out.print("Qual operação deseja fazer? ");
        System.out.println("Digite: + para Somar | - para Subtrair | * para Multiplicar | / para Dividir");
        operacao = scan.next();

        int soma = somar(primeiroNumero, segundoNumero);
        int subtracacao = subtrair(primeiroNumero, segundoNumero);
        int multiplicacao = multiplicar(primeiroNumero, segundoNumero);
        int divisao = dividir(primeiroNumero, segundoNumero);

        switch (operacao){
            case "+":
                System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
                break;
            case "-":
                System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtracacao);
                break;
            case "*":
                System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multiplicacao);
                break;
            case "/":
                System.out.println(primeiroNumero + " / " + segundoNumero + " = " + divisao);
                break;
            default:
                System.out.println("Operação inválida! Tente novamente.");
        }

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
