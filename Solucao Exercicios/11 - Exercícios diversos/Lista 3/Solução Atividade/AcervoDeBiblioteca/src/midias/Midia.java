package midias;


import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Midia extends ItemDeBiblioteca{
    
    public static final byte LIVRE = 1;
    public static final byte MAIOR18ANOS = 0;
    
    private String nomeArtista;
    private String produtora;
    private byte classificacao;
    
    public Midia(String titulo, String codigoId, short ano, StatusDoItem status, String nomeDoArtista, String produtora, byte classificacao){
        super(titulo,codigoId,ano,status);
        this.nomeArtista = nomeDoArtista;
        this.produtora = produtora;
        this.classificacao = (classificacao != 1 && classificacao != 0) ? 1: classificacao;
    }
    
    public Midia(){
    
    }
    
    
    /**
     * @return the nomeArtista
     */
    public String getNomeArtista() {
        return nomeArtista;
    }

    /**
     * @param nomeArtista the nomeArtista to set
     */
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
    
    /**
     * @return the classificacao
     */
    public byte getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(byte classificacao) {
        byte aux = getClassificacao();
        this.classificacao = (classificacao != 1 && classificacao != 0) ? aux:classificacao;
    }
    
    /**
     * @return the produtora
     */
    public String getProdutora() {
        return produtora;
    }

    /**
     * @param produtora the produtora to set
     */
    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "--------------------------------- Ficha Catalográfica ------------------------------\n";
        resultado += "Nome do artista/banda musical/diretor: " + nomeArtista;
        resultado += "\nDistribuidora: " + produtora + "\n";
        resultado += "Classificação: ";
        switch(classificacao){
            case LIVRE:
                resultado += "Livre\n";
                break;
            case MAIOR18ANOS:
                resultado += "Maiores de 18 anos\n";
                break;        
        }        
        return resultado;    
    }   
}