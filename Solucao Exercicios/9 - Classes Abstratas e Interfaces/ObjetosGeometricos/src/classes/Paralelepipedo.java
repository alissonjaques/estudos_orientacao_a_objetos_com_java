package classes;

import interfaces.ObjetoTridimensional;

/**
 * A classe Paralelepipedo representa um paralelepípedo tridimensional.
 * @author Alisson Jaques
 */
public class Paralelepipedo implements ObjetoTridimensional { // declaração da classe
    
    /**
     * Declaração dos campos da classe
     */
    private Ponto3D primeiroCanto;
    private Ponto3D segundoCanto;
    
    /**
     * O construtor para a classe Paralelepipedo, que recebe argumentos para
     * inicializar todos os campos da classe. Este é o construtor "completo".
     *
     * @param primeiroCanto o primeiro canto do paralelepipedo (uma instância da classe Ponto3D)
     * @param segundoCanto o segundo canto do paralelepipedo (outra instância da classe
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
     * O método centro retorna o ponto em três dimensões que corresponde ao
     * centro do paralelepípedo. Neste caso, basta calcular o ponto equidistante dos
     * dois pontos que delimitam o paralelepípedo, que é calculado usando a média das
     * coordenadas X, Y e Z dos cantos.
     *
     * @return uma instância da classe Ponto3D representando o centro do
     * paralelepípedo
     */
    @Override
    public Ponto3D centro() {
        double coordX = (getPrimeiroCanto().getX() + getSegundoCanto().getX()) / 2.;
        double coordY = (getPrimeiroCanto().getY() + getSegundoCanto().getY()) / 2.;
        double coordZ = (getPrimeiroCanto().getZ() + getSegundoCanto().getZ()) / 2.;
        return new Ponto3D(coordX, coordY, coordZ);
    }

    /**
     * O método calculaSuperficie calcula a superfície do paralelepípedo, retornando
     * um valor do tipo double.
     *
     * @return a superfície deste paralelepípedo
     */
    @Override
    public double calculaSuperfície() {
        // Calcula o lado X do retângulo, que é a diferença entre as coordenadas X do
        // do primeiro e segundo canto do retângulo. O método Math.abs garante que o valor
        // será positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do retângulo (diferença entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        // Calcula o lado Z do retângulo (diferença entre as coordenadas Z dos cantos)
        double ladoZ = Math.abs(getPrimeiroCanto().getZ() - getSegundoCanto().getZ());
        return 2 * ladoX + 2 * ladoY + 2 * ladoZ; // soma do dobro dos lados
    }
    
    /**
     * O método calculaVolume calcula o volume do paralelepípedo, retornando um
     * valor do tipo double.
     *
     * @return o volume deste paralelepípedo
     */
    @Override
    public double calculaVolume() {
        // Calcula o lado X do retângulo, que é a diferença entre as coordenadas X do
        // do primeiro e segundo canto do retângulo. O método Math.abs garante que o valor
        // será positivo.
        double ladoX = Math.abs(getPrimeiroCanto().getX() - getSegundoCanto().getX());
        // Calcula o lado Y do retângulo (diferença entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(getPrimeiroCanto().getY() - getSegundoCanto().getY());
        // Calcula o lado Z do retângulo (diferença entre as coordenadas Z dos cantos)
        double ladoZ = Math.abs(getPrimeiroCanto().getZ() - getSegundoCanto().getZ());
        return ladoX * ladoY * ladoZ; // multiplicação dos comprimentos dos lados
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
