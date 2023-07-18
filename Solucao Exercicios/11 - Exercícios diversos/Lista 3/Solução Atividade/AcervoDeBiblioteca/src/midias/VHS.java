package midias;

import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class VHS extends Midia {
    
    private double tempoDeDuracao;
    
    public VHS(String titulo, String codigoId, short ano, StatusDoItem status, 
                String nomeDoArtista, String produtora, byte classificacao, double tempoDeDuracao){
        super(titulo,codigoId,ano,status,nomeDoArtista,produtora, classificacao);
        this.tempoDeDuracao = (tempoDeDuracao<=0) ? 0:tempoDeDuracao;        
    }
    
    public VHS(){
    
    }

    /**
     * @return the tempoDeDuracao
     */
    public double getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    /**
     * @param tempoDeDuracao the tempoDeDuracao to set
     */
    public void setTempoDeDuracao(double tempoDeDuracao) {
        double aux = getTempoDeDuracao();
        this.tempoDeDuracao = (tempoDeDuracao<=0) ? aux:tempoDeDuracao;
    }
        
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "Tempo de duração: " + tempoDeDuracao + " horas\n";
        return resultado;    
    }
}