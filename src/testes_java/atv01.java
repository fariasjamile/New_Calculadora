package testes_java;

import java.util.Scanner;

public class atv01 {

    public static void main(String[] args) {
        
        Double valorum;
        Double valordois;
        Double soma, subtracao, multiplicacao, divisao;
        int op;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor um: ");
        valorum = entrada.nextDouble();
        
        System.out.println("Digite o valor dois: ");
        valordois = entrada.nextDouble();
        
        System.out.println("###SELECIONE UMA OPERAÇÃO###"); 
        System.out.println(" 1 - SOMA");
        System.out.println(" 2 - SUBTRAÇÃO");
        System.out.println(" 3 - MULTIPLICAR");
        System.out.println(" 4 - DIVIDIR");
        System.out.println("Digite sua opção");
        
        op = entrada.nextInt(); 
        
        switch(op) {
        
            case 1: 
                soma = valorum + valordois;
                System.out.println("a soma é: " + soma);
                break;
            
            case 2: 
                subtracao = valorum - valordois;
                System.out.println("a subtração é: " + subtracao); // Changed "soma" to "subtração"
                break;
        
            case 3: 
                multiplicacao = valorum * valordois;
                System.out.println("a multiplicação é: " + multiplicacao);
                break;
            
            case 4: 
                if (valordois == 0) {
                    System.out.println("Impossível realizar a operação de divisão por zero");
                } else {
                    divisao = valorum / valordois;
                    System.out.println("a divisão é: " + divisao);
                }
                break;
            
            default: // Fixed typo "defaut" to "default"
                System.out.println("OPERAÇÃO INVÁLIDA");
        }
        
        entrada.close();
    }
}
