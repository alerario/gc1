/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

/**
 *
 * @author joao
 */
public class VerificaTriangulo {
    
    public boolean verifica(float a, float b, float c) {
        
        if((a + b) < c) {
            return false;
        } else if ((a + c) < b) {
            return false;
        } else if ((b + c) < a) {
            return false;
        }
        
        return true;
    }
    
}
