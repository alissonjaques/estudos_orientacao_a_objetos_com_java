/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.OperacoesBasicas;
import interfaces.OperacoesEspecializadas;

/**
 *
 * @author ericd
 */
public class CalculadoraAvancada implements OperacoesBasicas, OperacoesEspecializadas{

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

    @Override
    public float raiz(float num1) {
        return (float) Math.sqrt(num1);
    }

    @Override
    public float seno(float num1) {
        return (float) Math.sin(num1);
    }

    @Override
    public float coseno(float num1) {
        return (float) Math.cos(num1);
    }
    
}
