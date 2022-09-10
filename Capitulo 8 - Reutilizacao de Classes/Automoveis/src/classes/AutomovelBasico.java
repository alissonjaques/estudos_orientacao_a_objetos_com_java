package classes;

/**
 * A classe AutomovelBasico, que encapsula os dados de um automóvel básico à
 * venda, e que herda da classe Automovel.
 */
public class AutomovelBasico extends Automovel {

    /**
     * Declaração dos campos da classe (acessórios que um automóvel básico pode
     * ter)
     */
    private boolean retrovisorDoLadoDoPassageiro;
    private boolean limpadorDoVidroTraseiro;
    private boolean rádioAMFM;

    /**
     * O construtor da classe AutomovelBasico, que recebe argumentos para
     * inicializar seus campos.
     *
     * @param m o modelo do automóvel
     * @param c a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     * @param retro true se o automóvel tem retrovisor do lado do passageiro
     * @param limpa true se o automóvel tem limpador do vidro traseiro
     * @param rádio true se o automóvel tem rádio AM/FM
     */
    public AutomovelBasico(String m, String c, byte comb,
            boolean retro, boolean limpa, boolean rádio) {
        super(m, c, comb); // A inicialização dos campos herdados é feita pela superclasse.
        retrovisorDoLadoDoPassageiro = retro; // a inicialização dos campos desta classe
        limpadorDoVidroTraseiro = limpa; // é feita diretamente pelo construtor
        rádioAMFM = rádio;
    }

    /**
     * O construtor da classe AutomovelBasico, que recebe argumentos para
     * inicializar seus campos. Esta versão do construtor considera que os
     * acessórios estão todos presentes.
     *
     * @param m o modelo do automóvel
     * @param c a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     */
    public AutomovelBasico(String m, String c, byte comb) {
        super(m, c, comb); // a inicialização dos campos herdados é feita pela superclasse
        retrovisorDoLadoDoPassageiro = true;
        limpadorDoVidroTraseiro = true;
        rádioAMFM = true;
    }

    /**
     * O método quantoCusta retorna o preço do automóvel, calculado de acordo
     * com o tipo de combustível. Este método usa o método quantoCusta da
     * superclasse para calcular o preço-base do automóvel, e acrescenta o valor
     * dos opcionais.
     *
     * @return o preço do automóvel
     */
    @Override
    public float quantoCusta() {
        float preço = super.quantoCusta(); // calcula o preço-base do automóvel
        if (retrovisorDoLadoDoPassageiro) {
            preço += 280;
        }
        if (limpadorDoVidroTraseiro) {
            preço += 650;
        }
        if (rádioAMFM) {
            preço += 190;
        }
        return preço;
    }

    /**
     * O método toString retorna uma String contendo os campos desta classe com
     * uma formatação simples.
     *
     * @return os campos da classe, formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString(); // a String que irá receber a concatenação
        // dos campos, já recebendo os dados
        // formatados do automóvel
        if (retrovisorDoLadoDoPassageiro) {
            resultado += "Com retrovisor do lado do passageiro\n";
        }
        if (limpadorDoVidroTraseiro) {
            resultado += "Com limpador do vidro traseiro\n";
        }
        if (rádioAMFM) {
            resultado += "Com rádio AM/FM\n";
        }
        return resultado; // retorna o resultado da concatenação
    }

} // fim da classe AutomovelBasico
