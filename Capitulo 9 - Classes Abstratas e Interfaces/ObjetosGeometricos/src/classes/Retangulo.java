package classes;

import interfaces.ObjetosGeometricos;

/**
 * A classe Retangulo, que implementa a interface ObjetoGeometrico e representa
 * um retângulo. Esta classe encapsula os dois pontos extremos do retângulo.
 * Todos os métodos declarados na interface ObjetoGeometrico são implementados.
 */
public class Retangulo implements ObjetosGeometricos // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    protected Ponto2D primeiroCanto, segundoCanto;

    /**
     * O construtor para a classe Retangulo, que recebe argumentos para
     * inicializar todos os campos da classe. Este é o construtor "completo".
     *
     * @param pc o primeiro canto do retângulo (uma instância da classe Ponto2D)
     * @param sc o segundo canto do retângulo (outra instância da classe
     * Ponto2D)
     */
    public Retangulo(Ponto2D pc, Ponto2D sc) {
        primeiroCanto = pc;
        segundoCanto = sc;
    }
    
    public Retangulo(){
    
    }
    
    /*
     * O método clona retorna uma nova instância da classe Retangulo, tendo os mesmos
     * campos do retângulo encapsulado.
     */
    @Override
    public Retangulo clona(){
        return new Retangulo(getPrimeiroCanto(), getSegundoCanto());
    }
    
    /**
     * O método centro retorna o ponto em duas dimensões que corresponde ao
     * centro do retângulo. Neste caso, basta calcular o ponto equidistante dos
     * dois pontos que delimitam o retângulo, que é calculado usando a média das
     * coordenadas X e Y dos cantos.
     *
     * @return uma instância da classe Ponto2D representando o centro do
     * retângulo
     */
    @Override
    public Ponto2D centro() {
        double coordX = (getPrimeiroCanto().getX() + getSegundoCanto().getX()) / 2.;
        double coordY = (getPrimeiroCanto().getY() + getSegundoCanto().getY()) / 2.;
        return new Ponto2D(coordX, coordY);
    }

    /**
     * O método calculaÁrea calcula a área do retângulo e retorna a área como um
     * valor do tipo double.
     *
     * @return a área deste retângulo
     */
    @Override
    public double calculaÁrea() {
        // Calcula o lado X do retângulo, que é a diferença entre as coordenadas X do
        // do primeiro e segundo canto do retângulo. O método Math.abs garante que o valor
        // será positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do retângulo (diferença entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        return ladoX * ladoY; // multiplicação dos comprimentos dos lados
    }

    /**
     * O método calculaPerímetro calcula o perímetro do retângulo e retorna o
     * perímetro como um valor do tipo double.
     *
     * @return o perímetro deste retângulo
     */
    @Override
    public double calculaPerímetro() {
        // Calcula o lado X do retângulo, que é a diferença entre as coordenadas X do
        // do primeiro e segundo canto do retângulo. O método Math.abs garante que o valor
        // será positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do retângulo (diferença entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        return 2 * ladoX + 2 * ladoY; // soma do dobro dos lados
    }
    
    /**
    * O método calculaAchatamento retorna o achamatemento do retângulo
    * encapsulado (a divisão do menor lado pelo maior lado).
    * @return o achatamento do retângulo
    */
    public double calculaAchatamento(){
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        if(ladoX<ladoY){
           return ladoX/ladoY;
        }
        else{
           return ladoY/ladoX;
        } 
    } // fim do método calculaAchatamento
    
    /**
     * @return the primeiroCanto
     */
    public Ponto2D getPrimeiroCanto() {
        return primeiroCanto;
    }

    /**
     * @param primeiroCanto the primeiroCanto to set
     */
    public void setPrimeiroCanto(Ponto2D primeiroCanto) {
        this.primeiroCanto = primeiroCanto;
    }

    /**
     * @return the segundoCanto
     */
    public Ponto2D getSegundoCanto() {
        return segundoCanto;
    }

    /**
     * @param segundoCanto the segundoCanto to set
     */
    public void setSegundoCanto(Ponto2D segundoCanto) {
        this.segundoCanto = segundoCanto;
    }
    
     /**
     * O método toString retorna os valores dos campos do retângulo formatados
     * em uma String.
     *
     * @return uma String contendo uma representação dos campos do retângulo
     */
    @Override
    public String toString() {
        // Retorna diretamente uma String criada com os valores dos campos. O método
        // toString da classe Ponto2D é chamado implicitamente.
        return "Retângulo com cantos " + getPrimeiroCanto() + " e " + getSegundoCanto();
    }
    
} // fim da classe Retangulo
