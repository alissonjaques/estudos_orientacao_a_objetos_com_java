package trabalhosDeConclusao;

import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;


public class TrabalhosDeConclusao extends ItemDeBiblioteca{
    
    public static final byte MONOGRAFIA = 1;
    public static final byte DISSERTACAO = 2;
    public static final byte TESE = 3;
    
    private String autor;
    private String cidadeEstado;
    private short numeroDePaginas;
    private double cm;
    private String orientadores[];
    private String universidade;
    private String campus;
    private String assunto;
    private String palavraChave1;
    private String palavraChave2;
    private String cdd;
    private byte tipoDeTrabalho;
    
    public TrabalhosDeConclusao(String titulo, String codigoId, short ano, 
            StatusDoItem status, String autor, String cidadeEstado, 
            short numeroDePaginas, double cm, String[] orientadores, 
            String universidade, String campus, String assunto, String palavraChave1,
            String palavraChave2, String cdd, byte tipoDeTrabalho){
        super(titulo,codigoId,ano,status);
        this.autor = autor;
        this.cidadeEstado = cidadeEstado;
        this.numeroDePaginas = (numeroDePaginas<=0) ? 0:numeroDePaginas;
        this.cm = (cm<=0) ? 0:cm;
        this.orientadores = orientadores;
        this.universidade = universidade;
        this.campus = campus;
        this.assunto = assunto;
        this.palavraChave1 = palavraChave1;
        this.palavraChave2 = palavraChave2;
        this.cdd = cdd;
        this.tipoDeTrabalho = (tipoDeTrabalho!=MONOGRAFIA && tipoDeTrabalho!=TESE && 
                tipoDeTrabalho!=DISSERTACAO) ? MONOGRAFIA:tipoDeTrabalho;
    }
    
    public TrabalhosDeConclusao(){
    
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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
     * @return the orientadores
     */
    public String[] getOrientadores() {
        return orientadores;
    }

    /**
     * @param orientadores the orientadores to set
     */
    public void setOrientadores(String[] orientadores) {
        this.orientadores = orientadores;
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
     * @return the campos
     */
    public String getCampos() {
        return campus;
    }

    /**
     * @param campus o campus da univerdade
     */
    public void setCampos(String campus) {
        this.campus = campus;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
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
     * @return the cdd
     */
    public String getCdd() {
        return cdd;
    }

    /**
     * @param cdd the cdd to set
     */
    public void setCdd(String cdd) {
        this.cdd = cdd;
    }
    
    public byte getTipoDeTrabalho(){
        return tipoDeTrabalho;    
    }
    
    public void setTipoDeTrabalho(byte tipoDeTrabalho){
        byte aux = getTipoDeTrabalho();
        this.tipoDeTrabalho = (tipoDeTrabalho!=MONOGRAFIA && tipoDeTrabalho!=TESE && 
                               tipoDeTrabalho!=DISSERTACAO) ? aux:tipoDeTrabalho;
    }
    
    public String fichaCatalografica(){
        String resultado = "--------------------------------- Ficha Catalográfica ------------------------------\n";        
        resultado += autor + ". \n\n";            
        resultado += getTitulo() + "/" + autor + ".- \n";
        resultado += cidadeEstado + ".-" + getAno()+".\n";
        resultado += numeroDePaginas + " pág.: " + cm + "cm.\n\n";
        switch(tipoDeTrabalho){
            case MONOGRAFIA:
                resultado += "Monografia-";
                break;
            case DISSERTACAO:
                resultado += "Dissertação-";
                break;
            case TESE:
                resultado += "Tese-";
                break;
        }
        resultado += universidade +"-\n\n";
        resultado += campus + ", " + getAno() +".\n";
        for (String orientador : orientadores) {
            resultado += "Orientador (a): " + orientador + ".\n\n";
        }
        resultado += "1. " + assunto +". 2. " + palavraChave1 + ". 3. " + palavraChave2 + ". I. " + getTitulo() + ".\n";
        resultado += "II. " + universidade + "-" + campus + ".\n";
        resultado += "                                   CDD: " + cdd;
        return resultado;    
    }
}