/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Historico {
    
    private final ArrayList historico;
    
    public Historico(){
        
        this.historico = new ArrayList();
        
    }
    
    public boolean salveHistorico(String resposta){
        return historico.add(resposta);
    }
    
    public String recupereHistorico(){
        String resposta = "";
        int i = 0;
        while( i < historico.size() ){
            resposta += historico.get(i) + " - ";
        }
        return resposta;
    }
}
