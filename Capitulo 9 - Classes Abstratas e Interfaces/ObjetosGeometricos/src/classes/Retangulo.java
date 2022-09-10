package classes;

import interfaces.ObjetosGeometricos;

/**
 * A classe Retangulo, que implementa a interface ObjetoGeometrico e representa
 * um ret�ngulo. Esta classe encapsula os dois pontos extremos do ret�ngulo.
 * Todos os m�todos declarados na interface ObjetoGeometrico s�o implementados.
 */
public class Retangulo implements ObjetosGeometricos // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    protected Ponto2D primeiroCanto, segundoCanto;

    /**
     * O construtor para a classe Retangulo, que recebe argumentos para
     * inicializar todos os campos da classe. Este � o construtor "completo".
     *
     * @param pc o primeiro canto do ret�ngulo (uma inst�ncia da classe Ponto2D)
     * @param sc o segundo canto do ret�ngulo (outra inst�ncia da classe
     * Ponto2D)
     */
    public Retangulo(Ponto2D pc, Ponto2D sc) {
        primeiroCanto = pc;
        segundoCanto = sc;
    }
    
    public Retangulo(){
    
    }
    
    /*
     * O m�todo clona retorna uma nova inst�ncia da classe Retangulo, tendo os mesmos
     * campos do ret�ngulo encapsulado.
     */
    @Override
    public Retangulo clona(){
        return new Retangulo(getPrimeiroCanto(), getSegundoCanto());
    }
    
    /**
     * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao
     * centro do ret�ngulo. Neste caso, basta calcular o ponto equidistante dos
     * dois pontos que delimitam o ret�ngulo, que � calculado usando a m�dia das
     * coordenadas X e Y dos cantos.
     *
     * @return uma inst�ncia da classe Ponto2D representando o centro do
     * ret�ngulo
     */
    @Override
    public Ponto2D centro() {
        double coordX = (getPrimeiroCanto().getX() + getSegundoCanto().getX()) / 2.;
        double coordY = (getPrimeiroCanto().getY() + getSegundoCanto().getY()) / 2.;
        return new Ponto2D(coordX, coordY);
    }

    /**
     * O m�todo calcula�rea calcula a �rea do ret�ngulo e retorna a �rea como um
     * valor do tipo double.
     *
     * @return a �rea deste ret�ngulo
     */
    @Override
    public double calcula�rea() {
        // Calcula o lado X do ret�ngulo, que � a diferen�a entre as coordenadas X do
        // do primeiro e segundo canto do ret�ngulo. O m�todo Math.abs garante que o valor
        // ser� positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do ret�ngulo (diferen�a entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        return ladoX * ladoY; // multiplica��o dos comprimentos dos lados
    }

    /**
     * O m�todo calculaPer�metro calcula o per�metro do ret�ngulo e retorna o
     * per�metro como um valor do tipo double.
     *
     * @return o per�metro deste ret�ngulo
     */
    @Override
    public double calculaPer�metro() {
        // Calcula o lado X do ret�ngulo, que � a diferen�a entre as coordenadas X do
        // do primeiro e segundo canto do ret�ngulo. O m�todo Math.abs garante que o valor
        // ser� positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do ret�ngulo (diferen�a entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        return 2 * ladoX + 2 * ladoY; // soma do dobro dos lados
    }
    
    /**
    * O m�todo calculaAchatamento retorna o achamatemento do ret�ngulo
    * encapsulado (a divis�o do menor lado pelo maior lado).
    * @return o achatamento do ret�ngulo
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
    } // fim do m�todo calculaAchatamento
    
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
     * O m�todo toString retorna os valores dos campos do ret�ngulo formatados
     * em uma String.
     *
     * @return uma String contendo uma representa��o dos campos do ret�ngulo
     */
    @Override
    public String toString() {
        // Retorna diretamente uma String criada com os valores dos campos. O m�todo
        // toString da classe Ponto2D � chamado implicitamente.
        return "Ret�ngulo com cantos " + getPrimeiroCanto() + " e " + getSegundoCanto();
    }
    
} // fim da classe Retangulo
