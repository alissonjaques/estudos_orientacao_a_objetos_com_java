package classes;

import interfaces.ObjetosGeometricos;

/**
 * A classe Circulo, que implementa a interface ObjetoGeometrico e representa um
 * círculo. Esta classe encapsula o ponto central do círculo e seu raio. Todos
 * os métodos declarados na interface ObjetoGeometrico são implementados.
 */
public class Circulo implements ObjetosGeometricos // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * O construtor para a classe Circulo, que recebe argumentos para
     * inicializar todos os campos da classe. Este é o construtor "completo".
     *
     * @param centro o centro do círculo (uma instância da classe Ponto2D)
     * @param raio o raio do círculo
     */
    public Circulo(Ponto2D centro, double raio) {
        this.centro = centro; 
        if (raio < 0) { // se o raio for negativo
            this.raio = 0; // o valor default será 0
        } else {
            this.raio = raio; // senão será o valor passado como argumento
        }
    }

    public Circulo() {

    }

    /**
     * O método centro retorna o ponto em duas dimensões que corresponde ao
     * centro do círculo. Neste caso, basta retornar a instância da classe
     * Ponto2D que representa o próprio centro.
     *
     * @return uma instância da classe Ponto2D representando o centro do círculo
     */
    @Override
    public Ponto2D centro() {
        return getCentro();
    }

    /**
     * O método clona retorna um clone do objeto Circulo, encasulado na classe.
     */
    @Override
    public Circulo clona() {
        return new Circulo(getCentro(), getRaio());
    }

    /**
     * O método calculaÁrea calcula a área do círculo e retorna a área como um
     * valor do tipo double.
     *
     * @return a área deste círculo
     */
    @Override
    public double calculaÁrea() {
        return Math.PI * getRaio() * getRaio(); // pi vezes o quadrado do raio
    }

    /**
     * O método calculaPerímetro calcula o perímetro do círculo e retorna o
     * perímetro como um valor do tipo double.
     *
     * @return o perímetro deste círculo
     */
    @Override
    public double calculaPerímetro() {
        return 2.0 * Math.PI * getRaio(); // dois vezes pi vezes o raio
    }

    /**
     * O método toString retorna os valores dos campos do círculo formatados em
     * uma String.
     *
     * @return uma String contendo uma representação dos campos do círculo
     */
    @Override
    public String toString() {
        // Retorna diretamente uma String criada com os valores dos campos. O método
        // toString da classe Ponto2D é chamado implicitamente.
        return "Círculo com centro em " + getCentro() + " e raio " + getRaio();
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
