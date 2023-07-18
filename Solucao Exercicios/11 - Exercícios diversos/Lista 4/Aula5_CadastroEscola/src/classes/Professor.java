/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.Titulacao;
import java.util.Date;

/**
 *
 * @author ericd
 */
public class Professor extends Funcionario{
    
    private String materia;
    private String formacao;
    private Titulacao titulacao;

    public Professor() {
    }

    public Professor(String disciplina, String formacao, Titulacao titulacao, String codigo, float salario, int regimeTrabalho, String nome, String cpf, Date dataNasc, char sexo) {
        super(codigo, salario, regimeTrabalho, nome, cpf, dataNasc, sexo);
        this.materia = disciplina;
        this.formacao = formacao;
        this.titulacao = titulacao;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the formacao
     */
    public String getFormacao() {
        return formacao;
    }

    /**
     * @param formacao the formacao to set
     */
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    /**
     * @return the titulacao
     */
    public Titulacao getTitulacao() {
        return titulacao;
    }

    /**
     * @param titulacao the titulacao to set
     */
    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes(); 
        System.out.println("Matéria: " + materia);
        System.out.println("Formação: " + formacao);
        System.out.println("Titulação: " + titulacao.getDescricao());
    }
    
    
    
    
}
