/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import gui.Gui;

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
        Gui gui = new Gui();    
        
        int op = 0;
        do {
            new Menu().getMenu();
            op = new java.util.Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    gui.somarR1();
                    break;
                case 2:
                    gui.dividirR2();
                    break;
                case 3:
                    gui.multiplicarR3();
                    break;
                case 6:
                    gui.resto();
                    break;
                case 27:
                    gui.subtrairR27();
                    break;
                case 7:
                    gui.parenteses();
                    break;
                case 10:
                    gui.somarR10();
                    break;
                case 11:
                    gui.subtrairR11();
                    break;
                case 12:
                    gui.multiplicarR12();
                    break;
                case 13:
                    gui.dividirR13();
                    break;
                case 28:
                    gui.porcentagemR28();
                    break;
                case 26:
                    gui.bhaskaraR26();
                    break;
                case 30:
                    gui.binario30();
                    break;
                case 31:
                    gui.somarDecimalR31();
                    break;
                case 32:
                    gui.subtrairDecimalR32();
                    break;
                case 1256:
                    gui.verificaTriangulo();
                    break;
                case 33:
                    gui.fatorial();
                    break;
                case 22:
                    gui.raizInteiro();
                    break;
                default:
                    break;
            }
            
        } while (op != 0);
    }

}
