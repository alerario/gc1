/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import gui.gui;

/**
 *
 * @author utfpr
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        do {
            new Menu().getMenu();
            op = new java.util.Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    new gui().somarR1();
                    break;
                case 2:
                    new gui().dividirR2();
                    break;
                case 3:
                    new gui().multiplicarR3();
                    break;
                case 6:
                    new gui().resto();
                    break;
                case 27:
                    new gui().subtrairR27();
                    break;
                case 7:
                    new gui().parenteses();
                    break;
                case 10:
                    new gui().somarR10();
                    break;
                case 11:
                    new gui().subtrairR11();
                    break;
                case 12:
                    new gui().multiplicarR12();
                    break;
                case 13:
                    new gui().dividirR13();
                    break;
                case 28:
                    new gui().porcentagemR28();
                    break;
                case 26:
                    new gui().bhaskaraR26();
                    break;
                case 30:
                    new gui().binario30();
                    break;
                case 31:
                    new gui().somarDecimalR31();
                    break;
                case 32:
                    new gui().subtrairDecimalR32();
                    break;
                case 1256:
                    new gui().verificaTriangulo();
                    break;
                case 33:
                    new gui().fatorial();
                    break;
                case 22:
                    new gui().raizInteiro();
                    break;
                default:
                    break;
            }
            
        } while (op != 0);
    }

}
