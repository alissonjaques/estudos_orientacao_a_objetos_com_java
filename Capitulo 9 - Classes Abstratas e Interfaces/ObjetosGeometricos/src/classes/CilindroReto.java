package classes;

import interfaces.ObjetoTridimensional;

/**
 * A classe CilindroReto representa um cilindro reto e é um objeto tridimensional.
 * @author Alisson Jaques
 */
public class CilindroReto implements ObjetoTridimensional{ // declara a classe
    /**
     * Declaração dos campos da classe
     */
    private Ponto3D centro;
    private double raio;
    private double altura;
    
    /**
     * O construtor "completo" da classe CilindroReto que recebe argumentos
     * para inicializar todos os seus campos encapsulados.
     * @param centro um ponto 3D que representa o centro do cilindro reto
     * @param raio o raio da base do cilindro reto
     * @param altura a altura do cilindro reto
     */
    public CilindroReto(Ponto3D centro, double raio, double altura){
        this.centro = centro;
        this.raio = raio;
        this.altura = altura;
    }
    
    /**
     * Construtor default da classe CilindroReto
     */
    public CilindroReto(){
    
    }
    
    /**
     * @return um ponto 3D que representa o centro deste cilindro reto
     */
    @Override
    public Ponto3D centro() {
        return getCentro();
    }
    
    /**
     * @return a medida da superfície deste cilindro reto
     */
    @Override
    public double calculaSuperfície() {
        return (Math.PI*getRaio()*(Math.sqrt(Math.pow(raio,2)+Math.pow(altura,2))))
                + Math.PI*Math.pow(raio,2);
    }
    
    /**
     * o volume deste cilindro reto
     */
    @Override
    public double calculaVolume() {
        return (1/3.)*Math.PI*Math.pow(raio,2)*altura;
    }

    /**
     * @return the centro
     */
    public Ponto3D getCentro() {
        return centro;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(Ponto3D centro) {
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

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
