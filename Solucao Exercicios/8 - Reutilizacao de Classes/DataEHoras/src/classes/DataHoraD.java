package classes;

/**
 * A classe DataHoraD possui campos e métodos que representam uma data e um horário.
 * Está classe herda da classe Data e reusa a classe Hora por delegação.
 * @author Alisson Jaques
 */
public class DataHoraD extends Data { // declaração da classe
    
    /**
     * Declaração dos campos da classe
     */
    private Hora hora;
    
    /**
     * O construtor completo da classe DataHoraD que recebe argumentos para incializar todos 
     * os campos desta classe.
     * @param d o dia
     * @param m o mês
     * @param a o ano
     * @param hora o horário
     */
    public DataHoraD(byte d, byte m, short a, Hora hora) {
        super(d, m, a); // delega a inicialização dos campos herdados ao construtor da super classe
        this.hora = hora;
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe DataHoraD que recebe argumentos para inicializar
     * todos os campos desta classe.
     * @param data uma data
     * @param hora um horário
     */
    public DataHoraD(Data data, Hora hora) {
        super(data.retornaDia(), data.retornaMês(), data.retornaAno());
        this.hora = hora;
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor default para a classe DataHoraD que não recebe argumentos e inicializa
     * os campos da classe com valores default.
     */
    public DataHoraD() {

    } // fim do construtor default
        
    /**
     * O método getHora não recebe argumentos e retorna a hora encapsulada no objeto.
     * @return a hora encapsulada no objeto
     */
    public Hora getHora() {
        return hora;
    }

    /**
     * O método setHora recebe como argumento um horário e atualiza o horário, encapsulado 
     * no objeto, com o mesmo.
     * @param hora o novo horário
     */
    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    /**
     * O método toString não recebe argumentos e retorna uma string com os campos do
     * objeto formatados.
     * @return uma string com os campos do objeto formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\n" + getHora().toString() + "\n";
        return resultado;
    } // fim do método toString
} // fim da classe DataHoraD
