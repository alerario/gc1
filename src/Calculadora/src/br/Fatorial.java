/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

/**
 *
 * @author Aluno
 */
public class Fatorial {
    public int fatorial(int num) {

        if (num <= 1) {

            return 1;

        } else {

            return fatorial(num - 1) * num;

        }

    }
}
