/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.Serie;
import enums.Situacao;
import interfaces.Informacoes;
import java.util.Date;

/**
 *
 * @author ericd
 */
public class Aluno extends Pessoa implements Informacoes {
    
    private String matricula;
    private Serie serie;
    private float notaFinal;
    private float frequencia;

    public Aluno() {
    }

    public Aluno(String matricula, Serie serie, float notaFinal, float frequencia, String nome, String cpf, Date dataNasc, char sexo) {
        super(nome, cpf, dataNasc, sexo);
        this.matricula = matricula;
        this.serie = serie;
        this.notaFinal = notaFinal;
        this.frequencia = frequencia;  
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the serie
     */
    public Serie getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    /**
     * @return the notaFinal
     */
    public float getNotaFinal() {
        return notaFinal;
    }

    /**
     * @param notaFinal the notaFinal to set
     */
    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    /**
     * @return the frequencia
     */
    public float getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Matricula: " + matricula);
        System.out.println("Serie: " + serie.getDescricao());
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Frequencia: " + frequencia);
        
        if(frequencia < 75)
            System.out.println("Situação: " + Situacao.REPROVADO.getDescricao());
        else if(notaFinal >= 60)
            System.out.println("Situação: " + Situacao.APROVADO.getDescricao());
        else if(notaFinal >= 40)
            System.out.println("Situação: " + Situacao.EM_EXAME.getDescricao());
        else
            System.out.println("Situação: " + Situacao.REPROVADO.getDescricao());
        
    }
    
    
    
    
    
}
