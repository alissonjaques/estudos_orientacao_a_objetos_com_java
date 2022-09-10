package classes;

/**
 *
 * @author Alisson Jaques
 */
public class EventoDelegacao {
    private String nomeEvento;
    private DataHora dataHora;
    
    public EventoDelegacao(String nomeEvento, DataHora dataHora){
        this.nomeEvento = nomeEvento;
        this.dataHora = dataHora;
    }
    
    public EventoDelegacao(){
    
    }

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the dataHora
     */
    public DataHora getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(DataHora dataHora) {
        this.dataHora = dataHora;
    }
    
    @Override
    public String toString(){
        String resultado = "Nome do evento: " + getNomeEvento();
        resultado += "\n" + getDataHora().toString();
        return resultado;
    }
}
