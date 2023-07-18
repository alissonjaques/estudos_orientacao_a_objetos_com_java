package mapas;

import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Mapa extends ItemDeBiblioteca {
    
    private String legenda;
    private String escala;
    
    public Mapa(String titulo, String codigoId, short ano, StatusDoItem status, String legenda, String escala){
        super(titulo,codigoId,ano,status);
        this.legenda = legenda;
        this.escala = escala;
    }
    
    public Mapa(){
    
    }

    /**
     * @return the legenda
     */
    public String getLegenda() {
        return legenda;
    }

    /**
     * @param legenda the legenda to set
     */
    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    /**
     * @return the escala
     */
    public String getEscala() {
        return escala;
    }

    /**
     * @param escala the escala to set
     */
    public void setEscala(String escala) {
        this.escala = escala;
    }
    
    @Override
    public String toString(){
        String resultado = "====================================================================================\n";
        resultado += "--------------------------------- Ficha Catalográfica ------------------------------\n";
        resultado += "\nTitulo: " + getTitulo();
        resultado += "\nCódigo de identificação: " + getCodigoId();
        resultado += "\nAno: " + getAno();
        resultado += "\nSituação: " + getStatus() +"\n";
        resultado += "Legenda: " + legenda;
        resultado += "\nEscala: " + escala + "\n";
        resultado += "\n====================================================================================\n";
        return resultado;
    }
}
