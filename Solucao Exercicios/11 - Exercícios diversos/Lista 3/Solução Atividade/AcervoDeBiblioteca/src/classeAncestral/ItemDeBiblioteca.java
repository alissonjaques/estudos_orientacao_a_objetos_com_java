package classeAncestral;

import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class ItemDeBiblioteca {
    
    private String titulo;
    private String codigoId;
    private short ano;
    private StatusDoItem status;
    
    public ItemDeBiblioteca(String titulo, String codigoId, short ano,StatusDoItem status){
        this.titulo = titulo;
        this.codigoId = codigoId;
        this.ano = ano;
        this.status = status;
    }
    
    public ItemDeBiblioteca(){
        this("","",(short)0,StatusDoItem.INDISPONIVEL);
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the codigoId
     */
    public String getCodigoId() {
        return codigoId;
    }

    /**
     * @param codigoId the codigoId to set
     */
    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }

    /**
     * @return the ano
     */
    public short getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(short ano) {
        this.ano = ano;
    }

    /**
     * @return the status
     */
    public StatusDoItem getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusDoItem status) {
        this.status = status;
    }
    
    /**
     *
     * @return 
     */
    @Override
    public String toString(){
        String resultado = "====================================================================================\n";
        resultado += "\nTitulo: " + getTitulo();
        resultado += "\nCódigo de identificação: " + getCodigoId();
        resultado += "\nAno: " + getAno();
        resultado += "\nSituação: " + status +"\n";
        return resultado;    
    }    
}
