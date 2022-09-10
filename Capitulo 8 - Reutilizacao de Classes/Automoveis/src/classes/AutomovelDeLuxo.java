package classes;

/**
 * A classe AutomovelDeLuxo, que encapsula os dados de um automóvel básico à
 * venda, e que herda da classe AutomovelBasico.
 */
public class AutomovelDeLuxo extends AutomovelBasico {

    /**
     * Declaração dos campos da classe (acessórios que um automóvel de luxo pode
     * ter)
     */
    private boolean direçãoHidráulica;
    private boolean câmbioAutomático;
    private boolean vidrosETravasElétricos;

    /**
     * O construtor da classe AutomovelDeLuxo, que recebe argumentos para
     * inicializar seus campos.
     *
     * @param m o modelo do automóvel
     * @param c a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     * @param retro true se o automóvel tem retrovisor do lado do passageiro
     * @param limpa true se o automóvel tem limpador do vidro traseiro
     * @param rádio true se o automóvel tem rádio AM/FM
     * @param dir true se o automóvel tem direção hidráulica
     * @param camb true se o automóvel tem câmbio automático
     * @param vidro true se o automóvel tem vidros e travas elétricos
     */
    public AutomovelDeLuxo(String m, String c, byte comb,
            boolean retro, boolean limpa, boolean rádio,
            boolean dir, boolean camb, boolean vidro) {
        super(m, c, comb, retro, limpa, rádio); // a inicialização dos campos herdados é
        // feita pela superclasse
        direçãoHidráulica = dir; // a inicialização dos campos desta classe é feita
        câmbioAutomático = camb; // diretamente pelo construtor
        vidrosETravasElétricos = vidro;
    }

    /**
     * O construtor da classe AutomovelDeLuxo, que recebe argumentos para
     * inicializar seus campos. Esta versão do construtor considera que os
     * acessórios estão todos presentes.
     *
     * @param m o modelo do automóvel
     * @param c a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     */
    public AutomovelDeLuxo(String m, String c, byte comb) {
        super(m, c, comb); // a inicialização dos campos herdados é feita pela superclasse
        direçãoHidráulica = true;
        câmbioAutomático = true;
        vidrosETravasElétricos = true;
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
        if (direçãoHidráulica) {
            preço += 5340;
        }
        if (câmbioAutomático) {
            preço += 7500;
        }
        if (vidrosETravasElétricos) {
            preço += 2320;
        }
        return preço;
    }

    /**
     * O método quantasPrestações retorna o número máximo de prestações para
     * este tipo de automóvel. É necessário sobrepor o método herdado da classe
     * Automóvel para que o valor correto seja impresso !
     *
     * @return o número máximo de prestações
     */
    @Override
    public byte quantasPrestações() {
        return 36;
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
        if (direçãoHidráulica) {
            resultado += "Com direção hidráulica\n";
        }
        if (câmbioAutomático) {
            resultado += "Com câmbio automático\n";
        }
        if (vidrosETravasElétricos) {
            resultado += "Com vidros e travas elétricas\n";
        }
        return resultado; // retorna o resultado da concatenação
    }

} // fim da classe AutomovelDeLuxo
