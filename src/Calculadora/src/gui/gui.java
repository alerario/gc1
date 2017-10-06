/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import br.Historico;
import br.VerificaTriangulo;


/**
 *
 * @author utfpr
 */
public class gui {
    
    private final Historico meuHistorico;
    
    public gui(){
        meuHistorico = new Historico();
    }
    
    // Usar função para exibir resultado para evitar
    // o uso demasiado de System.out.println
    public void exibaResultado(String resultado){
        System.out.println("Resultado: " + resultado);
        meuHistorico.salveHistorico(resultado);
    }
    
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
    public void somarR10(){
        System.out.print("digite 1o n.");
        float a = new java.util.Scanner(System.in).nextFloat();
        System.out.print("digite 2o n.");
        float b = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Resultado: " + new br.SomarFloat().someF(a, b));
    }
    
    public void subtrairR11(){
        System.out.print("digite 1o n.");
        float a = new java.util.Scanner(System.in).nextFloat();
        System.out.print("digite 2o n.");
        float b = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Resultado: " + new br.SubtrairFloat().subtrairF(a, b));
    }
    
    public void multiplicarR12(){
        System.out.print("digite 1o n.");
        float a = new java.util.Scanner(System.in).nextFloat();
        System.out.print("digite 2o n.");
        float b = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Resultado: " + new br.MultiplicarFloat().multiplicarF(a, b));
    }
    
    public void dividirR13(){
        System.out.print("digite 1o n.");
        float a = new java.util.Scanner(System.in).nextFloat();
        System.out.print("digite 2o n.");
        float b = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Resultado: " + new br.DividirFloat().divideF(a, b));
    }
    
      public void resto(){
        System.out.print("digite 1o n.");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("digite 2o n.");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Resto().calcularResto(a, b));
    }
    
    
    public void bhaskaraR26(){
        System.out.print("Digite o coeficiente a: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o coeficiente b: ");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o coeficiente c: ");
        int c = new java.util.Scanner(System.in).nextInt();
        double res[];
        res = new br.Bhaskara().bhaskara(a, b, c);
        if(res[0] == -1){
            System.out.println("Delta menor ou igual a zero");
        } else {
            System.out.println("Resultado: ");
            System.out.println("x' = " + res[0] + "\nx'' = " + res [1]);
        }
    }

    public void subtrairR27(){
        System.out.print("Digite o 1o numero: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o 2o numero:");
        int b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Subtrair().subtrair(a, b));
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
<<<<<<< HEAD
    public void binario30() {
        System.out.print("Digite o um numero inteiro para a conversão: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("O Binario eh: " + new br.Binario().binario(a));
=======
    
    public void somarDecimalR31(){
        System.out.print("Entre com o primeiro número: ");
        float numeroA = new java.util.Scanner(System.in).nextFloat();
        System.out.print("Entre com o segundo número:");
        float numeroB = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Resultado: " + new br.SomarDecimal().somarDecimal(numeroA, numeroB) + "\n\n\n");
    }
    
    public void subtrairDecimalR32(){
        System.out.print("Entre com o primeiro número: ");
        float numeroA = new java.util.Scanner(System.in).nextFloat();
        System.out.print("Entre com o segundo número:");
        float numeroB = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Resultado: " + new br.SubtrairDecimal().subtrairDecimal(numeroA, numeroB) + "\n\n\n");
    }
    public void verificaTriangulo() {
        
        System.out.print("Digite o 1o numero: ");
        float a = new java.util.Scanner(System.in).nextFloat();
        
        System.out.print("Digite o 2o numero: ");
        float b = new java.util.Scanner(System.in).nextFloat();
        
        System.out.print("Digite o 3o numero: ");
        float c = new java.util.Scanner(System.in).nextFloat();
        
        
        VerificaTriangulo v = new VerificaTriangulo();
        
        System.out.println(v.verifica(a, b, c));    
        
    }
    public void fatorial(){
        System.out.print("digite o numero:");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.Fatorial().fatorial(a));
    }
    public void raizInteiro(){
        System.out.print("digite o numero:");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Resultado: " + new br.RaizInteiro().RaizInteiro(a));
>>>>>>> 2446cec776f829d99573b7ad1124793f08aef1da
    }
}
