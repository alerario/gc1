/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

/**
 *
 * @author ThiagoMeneghin
 */
public class RaizInteiro {
    public int RaizInteiro(int x){
        if(x > 0){
            return (int) Math.sqrt(x);
        }
        else
            System.out.println("Número não é positivo");
            return 0;
    }
}
