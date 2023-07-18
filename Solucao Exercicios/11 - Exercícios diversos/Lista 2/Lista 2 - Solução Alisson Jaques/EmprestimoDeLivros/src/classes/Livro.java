package classes;

import enums.StatusDoLivro;
import static enums.StatusDoLivro.DISPONÍVEL;

/**
 *
 * @author Alisson Jaques
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private String codigoDeIdentificacao;
    private int anoDePublicacao;
    private StatusDoLivro status;
    
    public Livro(String titulo, String autor, String codigoDeIdentificacao, int anoDePublicacao, StatusDoLivro status){
        this.titulo = titulo;
        this.autor = autor;
        this.codigoDeIdentificacao = codigoDeIdentificacao;
        this.anoDePublicacao = anoDePublicacao;
        this.status = status;    
    }
    
    public Livro(){
        this("","","",0,DISPONÍVEL);    
    }

    /**
     * @return the nome
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the nome to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the codigoDeIdentificacao
     */
    public String getCodigoDeIdentificacao() {
        return codigoDeIdentificacao;
    }

    /**
     * @param codigoDeIdentificacao the codigoDeIdentificacao to set
     */
    public void setCodigoDeIdentificacao(String codigoDeIdentificacao) {
        this.codigoDeIdentificacao = codigoDeIdentificacao;
    }

    /**
     * @return the anoDePublicacao
     */
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    /**
     * @param anoDePublicacao the anoDePublicacao to set
     */
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    /**
     * @return the status
     */
    public StatusDoLivro getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusDoLivro status) {
        this.status = status;
    }
    
    public String toString(){
        String descricaoLivro = "";
        descricaoLivro += "Título do livro: " + titulo + "\n";
        descricaoLivro += "Autor: " + autor + "\n";
        descricaoLivro += "Código na biblioteca: " + codigoDeIdentificacao + "\n";
        descricaoLivro += "Ano de publicacao: " + anoDePublicacao + "\n";
        descricaoLivro += "Status do livro: " + status + "\n";
        return descricaoLivro;
    }
}
