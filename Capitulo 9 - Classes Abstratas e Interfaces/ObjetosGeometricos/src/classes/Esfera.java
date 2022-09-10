package classes;

import interfaces.ObjetoTridimensional;

/**
 * A classe Esfera possui campos e m�todos que representam um esfera, por ser um
 * objeto tridimensional est� classe implementa a interface ObjetoTridimensional
 * @author Alisson Jaques
 */
public class Esfera implements ObjetoTridimensional{ // declara��o da classe
    /**
     * Declara��o dos campos da classe
     */
    private double raio;
    private Ponto3D centro;
    
    /**
     * O construtor completo da classe Esfera, que recebe argumentos
     * para inicializar todos os seus campos.
     * @param raio o raio da esfera
     * @param centro a coordenada tridimensional que representa o centro
     * da esfera
     */
    public Esfera(double raio, Ponto3D centro){
        this.raio = raio;
        this.centro = centro;
    }
    
    /**
     * Construtor default da classe Esfera
     */
    public Esfera(){
    
    }
    
    /**
     * O m�todo centro retorna o centro da esfera.
     * @return o ponto que representa o centro da esfera
     */
    @Override
    public Ponto3D centro() {
        return centro;
    }
    
    /**
     * @return a medida da superf�cie da esfera
     */
    @Override
    public double calculaSuperf�cie() {
        return 4 * Math.PI *Math.pow(raio,2);
    }
    
    /**
     * @return o volume da esfera
     */
    @Override
    public double calculaVolume() {
        return (4.0/3.0)*Math.PI*Math.pow(raio,3);
    }    
}
