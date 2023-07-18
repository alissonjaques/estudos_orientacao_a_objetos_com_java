package livros;

import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Livro extends ItemDeBiblioteca{
    
    private String autor;
    private byte numeroEdicao;
    private String estado;
    private String editora;
    private short numeroDePaginas;
    private double cm;
    private String isbn;
    private String assunto;
    private String palavraChave1;
    private String palavraChave2;
    private String cdu;
    
    public Livro(String titulo, String codigoId, short ano,StatusDoItem status, String autor,
            byte numeroEdicao, String estado, String editora, short numeroDePaginas, double cm, String isbn, 
            String assunto, String palavraChave1, String palavraChave2, String cdu){
        super(titulo,codigoId,ano,status);
        this.autor = autor;
        this.numeroEdicao = (numeroEdicao<=0) ? 0:numeroEdicao;
        this.estado = estado;
        this.editora = editora;
        this.numeroDePaginas = (numeroDePaginas<=0) ? 0:numeroDePaginas;
        this.cm = (cm<=0) ? 0:cm;
        this.isbn = isbn;
        this.assunto = assunto;
        this.palavraChave1 = palavraChave1;
        this.palavraChave2 = palavraChave2;
        this.cdu = cdu;    
    }
    
    public Livro(){
    
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
     * @return the numeroEdicao
     */
    public byte getNumeroEdicao() {
        return numeroEdicao;
    }

    /**
     * @param numeroEdicao the numeroEdicao to set
     */
    public void setNumeroEdicao(byte numeroEdicao) {
        byte aux = getNumeroEdicao();
        this.numeroEdicao = (numeroEdicao<=0) ? aux:numeroEdicao;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
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
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
        resultado += autor+".\n\n";
        resultado += getTitulo() + " - " + numeroEdicao + "° Edição - " + estado + " : "
                    + editora + ", " + getAno() + ".\n";
        resultado += numeroDePaginas + " pág.: " + cm + "cm.\n\n";
        resultado += "ISBN: " +isbn + "\n\n";
        resultado += "1. " + assunto +". I. " + palavraChave1 + ". II. " + palavraChave2 + ". III. " + getTitulo() + ".\n\n";
        resultado += "                                   CDU: " + cdu;
        return resultado;
    }
}
