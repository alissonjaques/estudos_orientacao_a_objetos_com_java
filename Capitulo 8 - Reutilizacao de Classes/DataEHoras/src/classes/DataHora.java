package classes;

/**
 * A classe DataHora, que reusa as classes Data e Hora através de delegação. A
 * data e hora são representadas por instâncias das respectivas classes que
 * estão embutidas na classe DataHora, e toda a interação entre esta classe e as
 * embutidas é feita através da chamada de métodos das classes embutidas. Esta
 * classe demonstra o conceito de reutilização de classes através de delegação
 * ou composição.
 */
class DataHora // declaração da classe
{

    /**
     * Declaração dos campos da classe. Estes campos são declarados como
     * privados para que não possam ser acessados de fora da classe.
     */
    private Data estaData; // uma instância da classe Data representa o dia, mês e ano
    private Hora estaHora; // uma instância da classe Hora representa a hora, minuto
    // e segundo

    /**
     * O construtor para a classe DataHora, que recebe argumentos para
     * inicializar todos os campos que esta classe indiretamente contém, e chama
     * os construtores das classes Data e Hora para inicializar os campos das
     * instâncias destas classes.
     *
     * @param hora a hora
     * @param minuto o minuto
     * @param segundo o segundo
     * @param dia o dia
     * @param mês o mês
     * @param ano o ano
     */
    public DataHora(byte hora, byte minuto, byte segundo, byte dia, byte mês, short ano) {
        estaData = new Data(dia, mês, ano);
        estaHora = new Hora(hora, minuto, segundo);
    } // fim do construtor completo
    
    /**
     * O construtor para a classe DataHora, que recebe argumentos para
     * inicializar os campos que representam uma data. O construtor também
     * inicializará os campos que representam uma hora, considerando que todos
     * valem zero (meia-noite). De novo, os construtores das classes embutidas
     * nesta serão chamados.
     *
     * @param dia o dia
     * @param mês o mês
     * @param ano o ano
     */
    public DataHora(byte dia, byte mês, short ano) {
        estaData = new Data(dia, mês, ano);
        estaHora = new Hora((byte) 0, (byte) 0, (byte) 0); // cast necessário
    }
    
    /**
     * O construtor default para a classe DataHora, que não recebe argumentos e incializa os campos
     * da classe com valores default. Para tanto, esse construtor utiliza os construtores default
     * das classes Data e Hora, inicializando seus campos com instâncias default.
     */
    public DataHora(){
        estaData = new Data();
        estaHora = new Hora();   
    } // fim do construtor default
    
    /**
     * O método éIgual recebe como argumento uma instância da própria classe DataHora
     * e verifica se está instância é igual à instância encapsulada, se for é retornado
     * o valor booleano true, senão false.
     * 
     * @param outraDataHora uma instância da classe DataHora
     * @return true se a instância passada como argumento for igual à encapsulada ou false,
     * caso contrário.
     */
    public boolean éIgual(DataHora outraDataHora){
        return getEstaData().éIgual(outraDataHora.getEstaData()) && getEstaHora().éIgual(outraDataHora.getEstaHora());    
    } // fim do método éIgual
    
    /**
     * O método éAntesDe recebe uma data e hora como argumento e verifica se essa data e hora é anterior
     * à data e hora encapsulada na classe.
     * 
     * @param dataHora uma instância da própria classe DataHora
     * @return true se a data hora passada como argumento vier antes da encapsulada, false
     * caso contrário
     */
    public boolean éAntesDe(DataHora dataHora){
        if(estaData.éAntesDe(dataHora.estaData)){
            return true;
        }
        else if(estaData.éIgual(dataHora.estaData)){
            return estaHora.éAntesDe(dataHora.estaHora);
        }
        else{
            return false;
        }    
    } // fim do método éAntesDe
    
    /**
     * O método éDepoisDe recebe uma data e hora como argumento e verifica se essa data e hora é posterior
     * à data e hora encapsulada na classe.
     * 
     * @param dataHora uma instância da própria classe DataHora
     * @return true se a data hora passada como argumento vier depois da encapsulada, false
     * caso contrário
     */
    public boolean éDepoisDe(DataHora dataHora){
        if(estaData.éDepoisDe(dataHora.estaData)){
            return true;
        }
        else if(estaData.éIgual(dataHora.estaData)){
            return estaHora.éDepoisDe(dataHora.estaHora);
        }
        else{
            return false;
        }    
    } // fim do método éDepoisDe
    
    /**
     * O método getEstaData retorna da data encapsulada na classe DataHora.
     * 
     * @return a data encapsulada na classe DataHora
     */
    public Data getEstaData() {
        return estaData;
    } // fim do método getEstaData

    /**
     * O método setEstaData atualiza a data, encapsulada na classe DataHora, 
     * com a data passada como argumento.
     * 
     * @param estaData uma instância da classe Data
     */
    public void setEstaData(Data estaData) {
        this.estaData = estaData;
    } // fim do método setEstaData

    /**
     * O método getEstaHora retorna da hora encapsulada na classe DataHora.
     * 
     * @return a hora encapsulada na classe DataHora
     */
    public Hora getEstaHora() {
        return estaHora;
    } // fim do método getEstaHora

    /**
     * O método setEstaHora atualiza a hora, encapsulada na classe DataHora, 
     * com a hora passada como argumento.
     * 
     * @param estaHora uma instância da classe Hora
     */
    public void setEstaHora(Hora estaHora) {
        this.estaHora = estaHora;
    } // fim do método setEstaHora
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados. Os valores são obtidos através
     * da chamada implícita aos métodos toString das instâncias das classes
     * embutidas.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        return getEstaData() + " " + getEstaHora();
    } // fim do método toString
    
} // fim da classe DataHora
