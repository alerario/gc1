/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.util.ArrayList;

/**
 *
 * @author gabrieldecarli
 */
public class Binario {
    public ArrayList<String> binario(int numero)
    {
        ArrayList<String> binarioList = new ArrayList<> ();
        int b;
        float num = numero;
        while ( num > 1){
            b = (int) (num % 2);
            binarioList.add(Integer.toString(b));
            num -= num / 2 ;
        }
        
        return binarioList;    
    }
   
}
