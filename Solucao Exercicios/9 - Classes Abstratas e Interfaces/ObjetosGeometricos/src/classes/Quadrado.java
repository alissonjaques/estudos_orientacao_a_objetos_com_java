package classes;

/**
 * A classe Quadrado possui campos e métodos que encapsulam um quadrado
 * no plano cartesiano ortogonal. Está classe herda da classe Retangulo, 
 * afinal um quadrado é um tipo de retângulo.
 * @author Alisson Jaques
 */
public class Quadrado extends Retangulo { // declaração da classe
    /**
     * O construtor completo da classe Quadrado recebe arguementos para 
     * inicializar todos os seus campos.
     * @param pc o ponto do primero canto do quadrado
     * @param sc o ponto do segundo canto do quadrado
     */
    public Quadrado(Ponto2D pc, Ponto2D sc) {
        super(pc, sc); // delega a inicialização dos campos herdados ao
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
     * O método calculaÁrea retorna a área do quadrado
     * encapsulado.
     * @return a área de quadrado
     */
    @Override
    public double calculaÁrea(){
        double lado = Math.abs(getPrimeiroCanto().getX() - 
                getSegundoCanto().getX());
        return lado * lado;
    } // fim do método calculaÁrea
    
    /**
     * O método calculaPerímetro retorna o perímetro
     * do quadrado encapsulado.
     * @return o perímetro do quadrado
     */
    @Override
    public double calculaPerímetro(){
        double lado = Math.abs(getPrimeiroCanto().getX() - 
                getSegundoCanto().getX());
        return lado * 4;
    } // fim do método calculaPerímetro
    
    /**
     * O método toString retorna um texto contendo os campos da 
     * classe formatados.
     * @return uma string contendo os campos da classe formatados
     */
    @Override
    public String toString(){
        return super.toString().replaceAll("Retângulo","Quadrado");
    }
}
