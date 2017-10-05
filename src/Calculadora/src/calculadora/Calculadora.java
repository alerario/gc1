/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
            if (op == 1) {
                new gui.gui().somarR1();
            } else if (op == 2) {
                new gui.gui().dividirR2();
            } else if (op==3) {
                new gui.gui().multiplicarR3();              
            } else if (op==6) {
                new gui.gui().resto();
            } else if (op == 27) {
                new gui.gui().subtrairR27();
            } else if (op == 7) {
                new gui.gui().parenteses();
            } else if (op == 10) {
                new gui.gui().somarR10();
            } else if (op == 11) {
                new gui.gui().subtrairR11();
            } else if (op == 12) {
                new gui.gui().multiplicarR12();
            } else if (op == 13) {
                new gui.gui().dividirR13();
            } else if (op == 28) {
                new gui.gui().porcentagemR28();
            } else if (op == 26) {
                new gui.gui().bhaskaraR26();
            } else if (op == 31) {
                new gui.gui().somarDecimalR31();
            } else if (op == 32) {
                new gui.gui().subtrairDecimalR32();
            } else if (op == 1256) {
                new gui.gui().verificaTriangulo();
            }
            
        } while (op != 0);
    }

}
