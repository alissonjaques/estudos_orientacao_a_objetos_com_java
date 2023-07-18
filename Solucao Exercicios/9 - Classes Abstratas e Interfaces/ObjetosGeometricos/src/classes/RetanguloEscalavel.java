package classes;

import interfaces.Escalavel;

/**
 * A classe RetanguloEscalavel representa retângulos que podem mudar de tamanhos.
 * Ela é um tipo de retângulo e um objeto geométrico.
 * @author Alisson Jaques
 */
public class RetanguloEscalavel extends Retangulo implements Escalavel{ // declaração da classe
    
    /**
     * O construtor "completo" da classe RetanguloEscalavel que recebe argumentos
     * para inicializar todos os seus campos.
     * @param pc o ponto 2D que representa o primeiro canto do retângulo
     * @param sc o ponto 2D que representa o segundo canto do retângulo
     */
    public RetanguloEscalavel(Ponto2D pc, Ponto2D sc){
        super(pc,sc); // delegação a inicialização ao construtor da superclasse
    }
    
    /**
     * Construtor default da classe
     */
    public RetanguloEscalavel(){
    
    }
    
    /**
     * O método amplia recebe um valor flutuante e amplia o tamanho do retângulo
     * com esse valor.
     * @param escala um valor para ampliação do retângulo
     */
    @Override
    public void amplia(double escala) {
       segundoCanto.setX(segundoCanto.getX()*escala);
       segundoCanto.setY(segundoCanto.getY()*escala);
    }
    
    /**
     * O método espelha reflete o retângulo, em relação ao eixo y, no plano cartesiano
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
