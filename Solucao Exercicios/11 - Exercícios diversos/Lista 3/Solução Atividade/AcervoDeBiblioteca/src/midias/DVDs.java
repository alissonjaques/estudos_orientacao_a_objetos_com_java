package midias;

import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class DVDs extends VHS{
    
    private boolean bluray;
    
    public DVDs(String titulo, String codigoId, short ano, StatusDoItem status, 
                String nomeDoArtista, String produtora, byte classificacao, 
                double tempoDeDuracao, boolean bluray){
        super(titulo,codigoId,ano,status,nomeDoArtista,produtora,classificacao,tempoDeDuracao);
        this.bluray = bluray;    
    }
    
    public DVDs(){
    
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();
        if(bluray){
            resultado += "Qualidade em Blu-Ray\n";
        }        
        return resultado;    
    }    
}