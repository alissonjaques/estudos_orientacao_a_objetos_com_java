package classes;

import interfaces.Escalavel;

/**
 * A classe RetanguloEscalavel representa ret�ngulos que podem mudar de tamanhos.
 * Ela � um tipo de ret�ngulo e um objeto geom�trico.
 * @author Alisson Jaques
 */
public class RetanguloEscalavel extends Retangulo implements Escalavel{ // declara��o da classe
    
    /**
     * O construtor "completo" da classe RetanguloEscalavel que recebe argumentos
     * para inicializar todos os seus campos.
     * @param pc o ponto 2D que representa o primeiro canto do ret�ngulo
     * @param sc o ponto 2D que representa o segundo canto do ret�ngulo
     */
    public RetanguloEscalavel(Ponto2D pc, Ponto2D sc){
        super(pc,sc); // delega��o a inicializa��o ao construtor da superclasse
    }
    
    /**
     * Construtor default da classe
     */
    public RetanguloEscalavel(){
    
    }
    
    /**
     * O m�todo amplia recebe um valor flutuante e amplia o tamanho do ret�ngulo
     * com esse valor.
     * @param escala um valor para amplia��o do ret�ngulo
     */
    @Override
    public void amplia(double escala) {
       segundoCanto.setX(segundoCanto.getX()*escala);
       segundoCanto.setY(segundoCanto.getY()*escala);
    }
    
    /**
     * O m�todo espelha reflete o ret�ngulo, em rela��o ao eixo y, no plano cartesiano
     * ortogonal.
     */
    @Override
    public void espelha() {
        primeiroCanto.setX(-primeiroCanto.getX());
        primeiroCanto.setY(-primeiroCanto.getY());
        segundoCanto.setX(-segundoCanto.getX());
        segundoCanto.setY(-segundoCanto.getY());    
    }   
}
