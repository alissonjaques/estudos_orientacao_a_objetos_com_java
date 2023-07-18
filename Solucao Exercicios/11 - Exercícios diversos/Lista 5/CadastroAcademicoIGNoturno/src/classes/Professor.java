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
public class Professor extends Pessoa{
    
    private String masp;
    private String departamento;
    private Titulacao titulacao;

    public Professor() {
    }

    public Professor(String masp, String departamento, Titulacao titulacao, String nome, String cpf, Date dataNasc, char sexo, String endereco) {
        super(nome, cpf, dataNasc, sexo, endereco);
        this.masp = masp;
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    /**
     * @return the masp
     */
    public String getMasp() {
        return masp;
    }

    /**
     * @param masp the masp to set
     */
    public void setMasp(String masp) {
        this.masp = masp;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    public String toString() {
        String ret = super.toString(); 
        ret += "Masp: " + getMasp() + "\n";
        ret += "Departamento: " + getDepartamento() + "\n";
        ret += "Titulação: " + getTitulacao().getDescricao() + "\n";
        return ret;
    }
}
