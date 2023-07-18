package interfaces;

import classes.Ponto3D;

/**
 * A interface ObjetoTridimensional declara quais métodos
 * um objeto trimensional deve conter.
 * @author Alisson Jaques
 */
public interface ObjetoTridimensional {
    
    /**
    * O método centro retorna um ponto tridimensional
    * que representa o centro do objeto geométrico.
    * @return a coordenada do centro do objeto tridimensional 
    */
    Ponto3D centro();
    
    /**
     * O método calculaSuperfície retorna a àrea de superfície do
     * objeto tridimensional.
     * @return a superfície do objeto tridimensional
     */
    double calculaSuperfície();
    
    /**
     * O método calculaVolume retorna o volume do objeto trimensional.
     * @return o volume do objeto tridimensional
     */
    double calculaVolume();
} // fim da interface ObjetoTridimensional
