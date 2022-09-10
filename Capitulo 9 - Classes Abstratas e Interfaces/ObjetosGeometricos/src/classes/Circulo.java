package classes;

import interfaces.ObjetosGeometricos;

/**
 * A classe Circulo, que implementa a interface ObjetoGeometrico e representa um
 * c�rculo. Esta classe encapsula o ponto central do c�rculo e seu raio. Todos
 * os m�todos declarados na interface ObjetoGeometrico s�o implementados.
 */
public class Circulo implements ObjetosGeometricos // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * O construtor para a classe Circulo, que recebe argumentos para
     * inicializar todos os campos da classe. Este � o construtor "completo".
     *
     * @param centro o centro do c�rculo (uma inst�ncia da classe Ponto2D)
     * @param raio o raio do c�rculo
     */
    public Circulo(Ponto2D centro, double raio) {
        this.centro = centro; 
        if (raio < 0) { // se o raio for negativo
            this.raio = 0; // o valor default ser� 0
        } else {
            this.raio = raio; // sen�o ser� o valor passado como argumento
        }
    }

    public Circulo() {

    }

    /**
     * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao
     * centro do c�rculo. Neste caso, basta retornar a inst�ncia da classe
     * Ponto2D que representa o pr�prio centro.
     *
     * @return uma inst�ncia da classe Ponto2D representando o centro do c�rculo
     */
    @Override
    public Ponto2D centro() {
        return getCentro();
    }

    /**
     * O m�todo clona retorna um clone do objeto Circulo, encasulado na classe.
     */
    @Override
    public Circulo clona() {
        return new Circulo(getCentro(), getRaio());
    }

    /**
     * O m�todo calcula�rea calcula a �rea do c�rculo e retorna a �rea como um
     * valor do tipo double.
     *
     * @return a �rea deste c�rculo
     */
    @Override
    public double calcula�rea() {
        return Math.PI * getRaio() * getRaio(); // pi vezes o quadrado do raio
    }

    /**
     * O m�todo calculaPer�metro calcula o per�metro do c�rculo e retorna o
     * per�metro como um valor do tipo double.
     *
     * @return o per�metro deste c�rculo
     */
    @Override
    public double calculaPer�metro() {
        return 2.0 * Math.PI * getRaio(); // dois vezes pi vezes o raio
    }

    /**
     * O m�todo toString retorna os valores dos campos do c�rculo formatados em
     * uma String.
     *
     * @return uma String contendo uma representa��o dos campos do c�rculo
     */
    @Override
    public String toString() {
        // Retorna diretamente uma String criada com os valores dos campos. O m�todo
        // toString da classe Ponto2D � chamado implicitamente.
        return "C�rculo com centro em " + getCentro() + " e raio " + getRaio();
    }

    /**
     * @return the centro
     */
    public Ponto2D getCentro() {
        return centro;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(Ponto2D centro) {
        this.centro = centro;
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

} // fim da classe Circulo
