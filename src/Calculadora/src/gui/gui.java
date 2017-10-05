/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


/**
 *
 * @author utfpr
 */
public class gui {
    public void somarR1(){
        System.out.print("digite 1o n.");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("digite 2o n.");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Somar().some2(a, b));
    }

    public void dividirR2(){
        System.out.print("digite 1o n.");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("digite 2o n.");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Dividir().divide2(a, b));
    }

    public void multiplicarR3(){
        System.out.print("digite 1o n.");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("digite 2o n.");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Multiplicar().multiplicar2(a, b));
    }

    public void subtrairR27(){
        System.out.print("Digite o 1o numero: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o 2o numero:");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Subtrair().subtrair2(a, b));
    }

    public void parenteses() {
        System.out.println("Esta opção somente checa o fechamento dos parênteses.");
        System.out.println("Digite uma expressão matemática.");
        String entrada = new java.util.Scanner(System.in).nextLine();
        new br.ChecaParenteses(entrada).on();
    }
    
    public void porcentagemR28() {
        System.out.print("Digite o 1o numero: ");
        float a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o 2o numero: ");
        float b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Porcentagem().porcentagem(a, b) +"%");
    }
}
