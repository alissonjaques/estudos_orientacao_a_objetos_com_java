/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Informacoes;
import java.util.Date;

/**
 *
 * @author ericd
 */
public class Funcionario extends Pessoa implements Informacoes{
    
    private String codigo;
    private float salario;
    private int regimeTrabalho;

    public Funcionario() {
    }

    public Funcionario(String codigo, float salario, int regimeTrabalho, String nome, String cpf, Date dataNasc, char sexo) {
        super(nome, cpf, dataNasc, sexo);
        this.codigo = codigo;
        this.salario = salario;
        this.regimeTrabalho = regimeTrabalho;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the regimeTrabalho
     */
    public int getRegimeTrabalho() {
        return regimeTrabalho;
    }

    /**
     * @param regimeTrabalho the regimeTrabalho to set
     */
    public void setRegimeTrabalho(int regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Código: " + codigo);
        System.out.println("Salário: " + salario);
        System.out.println("Regime de trabalho: " + regimeTrabalho + " horas");
    }
    
    
    
}
