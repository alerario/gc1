/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/**
 *
 * @author paulo
 */
public class ChecaParenteses {
    
    private int comprimento = 0;
    private final char[] array;
    private final Deque<Character> pilha;
    private String saida;
    
    public ChecaParenteses(String entrada) {
        
        saida = "yohoho";
        comprimento = entrada.length();
        array = entrada.toCharArray();
        pilha = new ArrayDeque<>();
    }
    
    public void on() {
        for (int i = 0; i < comprimento; i++) {
            if(array[i] == '(') {
                pilha.push(array[i]);
            } else if(array[i] == ')') {
                try { pilha.pop(); }
                catch (NoSuchElementException e) { saida = "Não fechou."; }
            }
        }
        if(!pilha.isEmpty()) {
            saida = "Não fechou.";
        }
        System.out.println(saida);
        
    }
}
