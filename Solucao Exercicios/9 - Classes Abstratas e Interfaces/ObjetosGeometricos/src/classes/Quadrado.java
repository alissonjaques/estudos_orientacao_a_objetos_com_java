package classes;

/**
 * A classe Quadrado possui campos e m�todos que encapsulam um quadrado
 * no plano cartesiano ortogonal. Est� classe herda da classe Retangulo, 
 * afinal um quadrado � um tipo de ret�ngulo.
 * @author Alisson Jaques
 */
public class Quadrado extends Retangulo { // declara��o da classe
    /**
     * O construtor completo da classe Quadrado recebe arguementos para 
     * inicializar todos os seus campos.
     * @param pc o ponto do primero canto do quadrado
     * @param sc o ponto do segundo canto do quadrado
     */
    public Quadrado(Ponto2D pc, Ponto2D sc) {
        super(pc, sc); // delega a inicializa��o dos campos herdados ao
                       // construtor da super classe
    } // fim do construtor completo
    
    /**
     * O construtor default para a classe quadrado 
     * inicializa os campos dessa classe com valores
     * default.
     */
    public Quadrado(){
    
    } // fim do construtor default
    
    /**
     * O m�todo calcula�rea retorna a �rea do quadrado
     * encapsulado.
     * @return a �rea de quadrado
     */
    @Override
    public double calcula�rea(){
        double lado = Math.abs(getPrimeiroCanto().getX() - 
                getSegundoCanto().getX());
        return lado * lado;
    } // fim do m�todo calcula�rea
    
    /**
     * O m�todo calculaPer�metro retorna o per�metro
     * do quadrado encapsulado.
     * @return o per�metro do quadrado
     */
    @Override
    public double calculaPer�metro(){
        double lado = Math.abs(getPrimeiroCanto().getX() - 
                getSegundoCanto().getX());
        return lado * 4;
    } // fim do m�todo calculaPer�metro
    
    /**
     * O m�todo toString retorna um texto contendo os campos da 
     * classe formatados.
     * @return uma string contendo os campos da classe formatados
     */
    @Override
    public String toString(){
        return super.toString().replaceAll("Ret�ngulo","Quadrado");
    }
}
