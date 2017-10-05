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
            } else if (op == 27) {
                new gui.gui().subtrairR27();
            } else if (op == 7) {
                new gui.gui().parenteses();
            }
        } while (op != 0);
    }

}
