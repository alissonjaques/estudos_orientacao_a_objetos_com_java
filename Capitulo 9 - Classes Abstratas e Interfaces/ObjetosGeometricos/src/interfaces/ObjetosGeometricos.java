package interfaces;

import classes.Ponto2D;

/**
 * A interface ObjetoGeometrico, que define que m�todos um objeto geom�trico
 * gen�rico bidimensional deve conter. Esta interface n�o declara nenhum campo.
 */
public interface ObjetosGeometricos {

    /**
     * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao
     * centro do objeto geom�trico.
     *
     * @return uma inst�ncia da classe Ponto2D representando o centro do objeto
     * geom�trico.
     */
    Ponto2D centro();

    /**
     * O m�todo calcula�rea calcula a �rea do objeto geom�trico e retorna a �rea
     * como um valor do tipo double.
     *
     * @return a �rea deste objeto geom�trico.
     */
    double calcula�rea();
    
    /**
     * O m�todo clona retorna uma inst�ncia clone da interface 
     * ObjetosGeometricos.
     */
    public ObjetosGeometricos clona();
    
    /**
     * O m�todo calculaPer�metro calcula o per�metro do objeto geom�trico e
     * retorna o per�metro como um valor do tipo double.
     *
     * @return o per�metro deste objeto geom�trico.
     */
    double calculaPer�metro();
    
    @Override
    public String toString();

} // fim da interface ObjetoGeometrico
