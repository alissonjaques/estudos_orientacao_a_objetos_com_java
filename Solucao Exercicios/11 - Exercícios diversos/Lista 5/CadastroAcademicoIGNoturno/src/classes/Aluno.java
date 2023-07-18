/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author ericd
 */
public class Aluno extends Pessoa{
    
    private String matricula;
    private String departamento;
    private String curso;

    public Aluno() {
    }

    public Aluno(String matricula, String departamento, String curso, String nome, String cpf, Date dataNasc, char sexo, String endereco) {
        super(nome, cpf, dataNasc, sexo, endereco);
        this.matricula = matricula;
        this.departamento = departamento;
        this.curso = curso;
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
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        String ret = super.toString();
        ret += "Matricula: " + getMatricula() + "\n";
        ret += "Departamento: " + getDepartamento() + "\n";
        ret += "Curso: " + getCurso() + "\n";
        return ret;
    }
}
