/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

/**
 *
 * @author USER
 */
public class Bhaskara {
    public double[] bhaskara(int a, int b, int c){
        double delta;
        double result[] = new double[2];
        
        delta = (b * b) + (-4 * (a * c));
        
        if (delta >= 0) {
            result[0] = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
            result[1] = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
	} else {
            result[0] = -1;
	}
        return result;
    }
}
