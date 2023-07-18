package cartazes;

import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Cartaz extends ItemDeBiblioteca{
    
    private String mensagem;
    private String orgao;
    
    public Cartaz(String titulo, String codigoId, short ano,StatusDoItem status, String mensagem, String orgao){
        super(titulo,codigoId,ano,status);
        this.mensagem = mensagem;
        this.orgao = orgao;
    }
    
    public Cartaz(){
    
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the orgao
     */
    public String getOrgao() {
        return orgao;
    }

    /**
     * @param orgao the orgao to set
     */
    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }
    
    @Override
    public String toString(){
        String resultado = "====================================================================================\n";
        resultado += "--------------------------------- Ficha Catalográfica ------------------------------\n";
        resultado += "\nTitulo: " + getTitulo();
        resultado += "\nCódigo de identificação: " + getCodigoId();
        resultado += "\nAno: " + getAno();
        resultado += "\nSituação: " + getStatus() +"\n";
        resultado += "Mensagem: " + mensagem;
        resultado += "\nOrgão Responsável: " + orgao + "\n";
        resultado += "\n====================================================================================\n";
        return resultado;
    }    
}
