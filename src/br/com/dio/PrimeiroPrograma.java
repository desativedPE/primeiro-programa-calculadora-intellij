package br.com.dio;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        int primeiroNumero = 5;
        int segundoNumero = 3;
        String operacao = "+";
        System.out.println("Calculadora");
        System.out.println();
        if (operacao == "+"){
            System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma(primeiroNumero, segundoNumero));
        } else {
            if (operacao == "-"){
                System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtracao(primeiroNumero, segundoNumero));
            } else {
                System.out.println("Nenhuma operação valida foi selecionada.");
            }
        }

        System.out.println("Este é um testa para calculadora..");

    }

    public static int soma(int primeiroNumero, int segundoNumero){
        int resultado;
        resultado = primeiroNumero + segundoNumero;
        return resultado;
    }

    public static int subtracao(int primeiroNumero, int segundoNumero){
        int resultado;
        resultado = primeiroNumero - segundoNumero;
        return resultado;
    }
}
