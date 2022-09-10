package classes;

/**
 * A classe DataHoraH possui campos e métodos que representam uma data e um horário.
 * Está classe herda da classe Hora e reusa a classe Data por delegação.
 * @author Alisson Jaques
 */
public class DataHoraH extends Hora { // declaração da classe
    
    /**
     * Declaração dos campos da classe
     */
    private Data data;
    
    /**
     * O construtor completo da classe DataHoraH que recebe argumentos para incializar todos 
     * os campos desta classe.
     * @param d o dia
     * @param m o mês
     * @param a o ano
     * @param hora o horário
     */
    public DataHoraH(byte d, byte m, short a, Hora hora) {
        super(hora.hora,hora.minuto,hora.segundo); // delega a inicialização dos campos herdados ao construtor da super classe
        this.data = new Data(d,m,a);
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe DataHoraH que recebe argumentos para inicializar
     * todos os campos desta classe.
     * @param data uma data
     * @param hora um horário
     */
    public DataHoraH(Data data, Hora hora) {
        super(hora.hora,hora.minuto,hora.segundo); // acesso direto, pois os campos não são privados
        this.data = new Data(data.retornaDia(), data.retornaMês(), data.retornaAno());        
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor default para a classe DataHoraH que não recebe argumentos e inicializa
     * os campos da classe com valores default.
     */
    public DataHoraH() {

    } // fim do construtor default
        
    /**
     * O método getData não recebe argumentos e retorna a data encapsulada no objeto.
     * @return a data encapsulada no objeto
     */
    public Data getData() {
        return data;
    }

    /**
     * O método setData recebe como argumento uma data e atualiza a data, encapsulado 
     * no objeto, com o mesmo.
     * @param data a nova data
     */
    public void setData(Data data) {
        this.data = data;
    }
    
    /**
     * O método toString não recebe argumentos e retorna uma string com os campos do
     * objeto formatados.
     * @return uma string com os campos do objeto formatados
     */
    @Override
    public String toString() {
        String resultado = getData().toString();
        resultado += "\n" + super.toString() + "\n";
        return resultado;
    } // fim do método toString
} // fim da classe DataHoraD
