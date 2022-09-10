package interfaces;

import classes.Ponto3D;

/**
 * A interface ObjetoTridimensional declara quais m�todos
 * um objeto trimensional deve conter.
 * @author Alisson Jaques
 */
public interface ObjetoTridimensional {
    
    /**
    * O m�todo centro retorna um ponto tridimensional
    * que representa o centro do objeto geom�trico.
    * @return a coordenada do centro do objeto tridimensional 
    */
    Ponto3D centro();
    
    /**
     * O m�todo calculaSuperf�cie retorna a �rea de superf�cie do
     * objeto tridimensional.
     * @return a superf�cie do objeto tridimensional
     */
    double calculaSuperf�cie();
    
    /**
     * O m�todo calculaVolume retorna o volume do objeto trimensional.
     * @return o volume do objeto tridimensional
     */
    double calculaVolume();
} // fim da interface ObjetoTridimensional
