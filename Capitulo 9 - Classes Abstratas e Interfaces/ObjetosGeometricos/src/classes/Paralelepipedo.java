package classes;

import interfaces.ObjetoTridimensional;

/**
 * A classe Paralelepipedo representa um paralelep�pedo tridimensional.
 * @author Alisson Jaques
 */
public class Paralelepipedo implements ObjetoTridimensional { // declara��o da classe
    
    /**
     * Declara��o dos campos da classe
     */
    private Ponto3D primeiroCanto;
    private Ponto3D segundoCanto;
    
    /**
     * O construtor para a classe Paralelepipedo, que recebe argumentos para
     * inicializar todos os campos da classe. Este � o construtor "completo".
     *
     * @param primeiroCanto o primeiro canto do paralelepipedo (uma inst�ncia da classe Ponto3D)
     * @param segundoCanto o segundo canto do paralelepipedo (outra inst�ncia da classe
     * Ponto3D)
     */
    
    public Paralelepipedo(Ponto3D primeiroCanto, Ponto3D segundoCanto){
        this.primeiroCanto = primeiroCanto;
        this.segundoCanto = segundoCanto;
    }
    
    /**
     * Construtor default da classe Paralelepipedo
     */
    public Paralelepipedo(){
    
    }
    
    /**
     * O m�todo centro retorna o ponto em tr�s dimens�es que corresponde ao
     * centro do paralelep�pedo. Neste caso, basta calcular o ponto equidistante dos
     * dois pontos que delimitam o paralelep�pedo, que � calculado usando a m�dia das
     * coordenadas X, Y e Z dos cantos.
     *
     * @return uma inst�ncia da classe Ponto3D representando o centro do
     * paralelep�pedo
     */
    @Override
    public Ponto3D centro() {
        double coordX = (getPrimeiroCanto().getX() + getSegundoCanto().getX()) / 2.;
        double coordY = (getPrimeiroCanto().getY() + getSegundoCanto().getY()) / 2.;
        double coordZ = (getPrimeiroCanto().getZ() + getSegundoCanto().getZ()) / 2.;
        return new Ponto3D(coordX, coordY, coordZ);
    }

    /**
     * O m�todo calculaSuperficie calcula a superf�cie do paralelep�pedo, retornando
     * um valor do tipo double.
     *
     * @return a superf�cie deste paralelep�pedo
     */
    @Override
    public double calculaSuperf�cie() {
        // Calcula o lado X do ret�ngulo, que � a diferen�a entre as coordenadas X do
        // do primeiro e segundo canto do ret�ngulo. O m�todo Math.abs garante que o valor
        // ser� positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do ret�ngulo (diferen�a entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        // Calcula o lado Z do ret�ngulo (diferen�a entre as coordenadas Z dos cantos)
        double ladoZ = Math.abs(getPrimeiroCanto().getZ() - getSegundoCanto().getZ());
        return 2 * ladoX + 2 * ladoY + 2 * ladoZ; // soma do dobro dos lados
    }
    
    /**
     * O m�todo calculaVolume calcula o volume do paralelep�pedo, retornando um
     * valor do tipo double.
     *
     * @return o volume deste paralelep�pedo
     */
    @Override
    public double calculaVolume() {
        // Calcula o lado X do ret�ngulo, que � a diferen�a entre as coordenadas X do
        // do primeiro e segundo canto do ret�ngulo. O m�todo Math.abs garante que o valor
        // ser� positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do ret�ngulo (diferen�a entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        // Calcula o lado Z do ret�ngulo (diferen�a entre as coordenadas Z dos cantos)
        double ladoZ = Math.abs(getPrimeiroCanto().getZ() - getSegundoCanto().getZ());
        return ladoX * ladoY * ladoZ; // multiplica��o dos comprimentos dos lados
    }

    /**
     * @return the primeiroCanto
     */
    public Ponto3D getPrimeiroCanto() {
        return primeiroCanto;
    }

    /**
     * @param primeiroCanto the primeiroCanto to set
     */
    public void setPrimeiroCanto(Ponto3D primeiroCanto) {
        this.primeiroCanto = primeiroCanto;
    }

    /**
     * @return the segundoCanto
     */
    public Ponto3D getSegundoCanto() {
        return segundoCanto;
    }

    /**
     * @param segundoCanto the segundoCanto to set
     */
    public void setSegundoCanto(Ponto3D segundoCanto) {
        this.segundoCanto = segundoCanto;
    }
    
}
