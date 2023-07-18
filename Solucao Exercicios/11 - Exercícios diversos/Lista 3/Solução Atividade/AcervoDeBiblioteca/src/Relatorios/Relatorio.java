package Relatorios;

import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Relatorio extends ItemDeBiblioteca{
    
    private String autores[];
    private String curso;
    private String disciplina;
    private String professor;
    private String universidade;
    private String campus;
    private String cidadeEstado;
    private String palavraChave1;
    private String palavraChave2;
    private short numeroDePaginas;
    private double cm;
    private String cdu;
    
    public Relatorio(String titulo, String codigoId, short ano,StatusDoItem status,
            String[] autores, String curso, String disciplina, String professor,
            String universidade, String campus, String cidadeEstado,short numeroDePaginas,
            double cm, String palavraChave1, String palavraChave2,String cdu){
        super(titulo,codigoId,ano,status);
        this.autores = autores;
        this.curso = curso;
        this.disciplina = disciplina;
        this.professor = professor;
        this.universidade = universidade;
        this.campus = campus;
        this.cidadeEstado = cidadeEstado;
        this.numeroDePaginas = (numeroDePaginas<=0) ? 0:numeroDePaginas;
        this.cm = (cm<=0) ? 0:cm;
        this.palavraChave1 = palavraChave1;
        this.palavraChave2 = palavraChave2;
        this.cdu = cdu;
    }
    
    public Relatorio(){
    
    }

    /**
     * @return the autores
     */
    public String[] getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String[] autores) {
        this.autores = autores;
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

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * @return the universidade
     */
    public String getUniversidade() {
        return universidade;
    }

    /**
     * @param universidade the universidade to set
     */
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    /**
     * @return the campus
     */
    public String getCampus() {
        return campus;
    }

    /**
     * @param campus the campus to set
     */
    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    /**
     * @return the cidadeEstado
     */
    public String getCidadeEstado() {
        return cidadeEstado;
    }

    /**
     * @param cidadeEstado the cidadeEstado to set
     */
    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }
    
    /**
     * @return the numeroDePaginas
     */
    public short getNumeroDePaginas() {
        return numeroDePaginas;
    }

    /**
     * @param numeroDePaginas the numeroDePaginas to set
     */
    public void setNumeroDePaginas(short numeroDePaginas) {
        short aux = getNumeroDePaginas();
        this.numeroDePaginas = (numeroDePaginas<=0) ? aux:numeroDePaginas;
    }

    /**
     * @return the cm
     */
    public double getCm() {
        return cm;
    }

    /**
     * @param cm the cm to set
     */
    public void setCm(double cm) {
        double aux = getCm();
        this.cm = (cm<=0) ? aux:cm;
    }
    
    /**
     * @return the palavraChave1
     */
    public String getPalavraChave1() {
        return palavraChave1;
    }

    /**
     * @param palavraChave1 the palavraChave1 to set
     */
    public void setPalavraChave1(String palavraChave1) {
        this.palavraChave1 = palavraChave1;
    }

    /**
     * @return the palavraChave2
     */
    public String getPalavraChave2() {
        return palavraChave2;
    }

    /**
     * @param palavraChave2 the palavraChave2 to set
     */
    public void setPalavraChave2(String palavraChave2) {
        this.palavraChave2 = palavraChave2;
    }
    
    /**
     * @return the cdu
     */
    public String getCdu() {
        return cdu;
    }

    /**
     * @param cdu the cdu to set
     */
    public void setCdu(String cdu) {
        this.cdu = cdu;
    }
    
    public String fichaCatalografica(){
        String resultado = "--------------------------------- Ficha Catalográfica ------------------------------\n";
        for (String autores1 : autores) {
            resultado += autores1 + ". ";
        }
        resultado += getTitulo() + " - " + cidadeEstado + ".-" + getAno() + ".\n";
        resultado += numeroDePaginas + " pág.: " + cm + "cm.\n\n";
        resultado += "Relatório-" + universidade +"-\n" + campus+", " + getAno() + ".\n";
        resultado += "Professor: " + professor+ ".\n\n";
        resultado += "1. " + palavraChave1 + ". 2. " + getPalavraChave2() + ". I. " + getTitulo() + ".\n\n";
        resultado += "                                   CDU: " + cdu;
        return resultado;
    }

}
