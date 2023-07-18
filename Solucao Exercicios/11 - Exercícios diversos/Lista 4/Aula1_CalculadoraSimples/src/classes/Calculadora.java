/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.OperacoesBasicas;

/**
 *
 * @author ericd
 */
public class Calculadora implements OperacoesBasicas{

    @Override
    public float somar(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float subtrair(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float dividir(float num1, float num2) {
        return num1 / num2;
    }
  
}
