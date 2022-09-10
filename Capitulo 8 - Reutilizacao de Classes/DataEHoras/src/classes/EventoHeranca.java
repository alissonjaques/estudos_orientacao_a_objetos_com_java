package classes;

/**
 *
 * @author Alisson Jaques
 */
public class EventoHeranca extends DataHora{
    private String nomeEvento;
    
    public EventoHeranca(byte hora, byte minuto, byte segundo, byte dia, byte mês, short ano, String nomeEvento){
        super(hora,minuto,segundo,dia,mês,ano);
        this.nomeEvento = nomeEvento;
    }
    
    public EventoHeranca(){
    
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
     *
     */
    @Override
    public String toString(){
        String resultado = "Nome do Evento: " + getNomeEvento() + "\n";
        resultado += super.toString();
        return resultado;
    }
}
