package midias;

import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Fitas extends Midia{
    private String faixaMusical[];
    
    public Fitas(String titulo, String codigoId, short ano, StatusDoItem status, 
            String nomeDoArtista, String produtora, byte classificacao, String[] faixaMusical){
        super(titulo,codigoId,ano,status,nomeDoArtista,produtora,classificacao);
        this.faixaMusical = faixaMusical;
    }
    
    public Fitas(){
        
    }

    /**
     * @return the faixaMusical
     */
    public String[] getFaixaMusical() {
        return faixaMusical;
    }

    /**
     * @param faixaMusical the faixaMusical to set
     */
    public void setFaixaMusical(String[] faixaMusical) {
        this.faixaMusical = faixaMusical;
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();        
        resultado += "\n--------------------------------- Faixa Musical ------------------------------------\n";
        for (String faixasMusicais : faixaMusical) {
            resultado += faixasMusicais + "\n";
        }
        return resultado;    
    }
}