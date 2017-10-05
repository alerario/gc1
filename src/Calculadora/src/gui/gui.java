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
}
