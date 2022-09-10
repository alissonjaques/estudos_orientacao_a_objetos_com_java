package classes;

/**
 * A classe ConcessionariaDeAutomoveis, que implementa o processo de venda de
 * automóveis em uma concessionária. Para cada tipo de automóvel, o preço e
 * número de suas prestações será impresso. O modelo representado é extremamente
 * simples, e a concessionária somente tem cinco automóveis à venda. Esta classe
 * demonstra polimorfismo de classes usando instâncias das classes herdeiras da
 * classe Automovel. Um método da classe aceitará instâncias de qualquer classe
 * herdeira de Automovel.
 */
class ConcessionariaDeAutomoveis {

    /**
     * O método main permite a execução desta classe. Este método contém
     * declarações de algumas instâncias das classes Automovel, AutomovelBasico
     * e AutomovelDeLuxo, e as usa para mostrar o valor da prestação de cada
     * automóvel.
     *
     * @param argumentos os argumentos que podem ser passados para o método via
     * linha de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Automovel
        Automovel a1 = new Automovel("Fiat", "bege", Automovel.MOVIDOAALCOOL);
        // Criamos duas instâncias da classe AutomovelBasico
        // Uma com o construtor básico
        AutomovelBasico a2 = new AutomovelBasico("Corsa", "cinza",
                Automovel.MOVIDOAGASOLINA);
        // E outra com o construtor mais completo
        AutomovelBasico a3 = new AutomovelBasico("Gol", "branco", Automovel.MOVIDOAGASOLINA,
                false, false, true);
        // Criamos duas instâncias da classe AutomovelDeLuxo
        // Uma com o construtor básico
        AutomovelDeLuxo a4 = new AutomovelDeLuxo("Ibiza", "vermelho",
                Automovel.MOVIDOAGASOLINA);
        // E outra com o construtor mais completo
        AutomovelDeLuxo a5 = new AutomovelDeLuxo("Honda", "prata", Automovel.MOVIDOAGASOLINA,
                true, true, false,
                true, false, true);
        // Imprimimos o "catálogo" da concessionária, ou seja, os dados dos automóveis,
        // preços e condições de pagamento.
        imprime(a1);
        imprime(a2);
        imprime(a3);
        imprime(a4);
        imprime(a5);
    } // fim do método main

    /**
     * O método imprime mostra os dados de uma instância de qualquer classe que
     * descenda da classe Automovel. Os métodos quantoCusta, quantasPrestações e
     * toString das instâncias serão chamados.
     *
     * @param a uma instância de qualquer classe que herde da classe Automovel.
     */
    public static void imprime(Automovel a) {
        System.out.println("Seguem os dados do automóvel escolhido:");
        System.out.println(a); 
    } // fim do método imprime
} // fim da classe ConcessionariaDeAutomoveis