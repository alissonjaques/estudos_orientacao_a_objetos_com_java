/**
 *  A classe Linha representa uma linha unida por dois pontos no plano
 *  cartesiano ortogonal.
 * 
 *  @author Alisson Jaques
 * 
 */
public class Linha { // declaração da classe

    /*

      Declaração dos campos da classe

    */
    private Ponto2D pontoA;     // o ponto A
    private Ponto2D pontoB;     // o ponto B
    private double comprimento; // o comprimento da linha
    
    /**
     * O construtor completo para a classe Linha, que recebe dois pontos
     * como argumentos e inicializa os campos correspondentes da classe
     * com os mesmos. O campo comprimento é inicializado com o retorno
     * do método distancia da classe Ponto2D. 
     * 
     * @param a o ponto A
     * @param b o ponto B
     */
    Linha(Ponto2D a, Ponto2D b){

        pontoA = new Ponto2D(a.retornaX(), a.retornaY());       // a palavra chave new é usada para encapsular os pontos da classe do usuário
        pontoB = new Ponto2D(b.retornaX(), b.retornaY());
        comprimento = pontoA.distancia(pontoB);       

    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe Linha, que recebe apenas um ponto
     * como argumento e considera o ponto A como default (A = (1,1)). Ele funciona
     * examente como o construtor completo, exceto que aqui temos um ponto default
     * por falta de informação.
     *   
     * @param b o ponto B 
     */
    Linha(Ponto2D b){

        pontoA = new Ponto2D(1,1);
        pontoB = new Ponto2D(b.retornaX(), b.retornaY());
        comprimento = pontoA.distancia(pontoB);  

    } // fim do construtor sobrecarregado com apenas um argumento

    /**
     * O construtor default para a classe Linha, que não recebe nenhum argumento
     * e inicializa os campos da classe com valores default: A = (1,1), B = (1,2) e 
     * comprimento = 1; 
     */
    Linha(){

        pontoA = new Ponto2D(1,1);
        pontoB = new Ponto2D(1,2);
        comprimento = pontoA.distancia(pontoB);

    } // fim do construtor default

    /**
     * O método retornaComprimento retorna o comprimento da linha encapsulada.
     * 
     * @return o comprimento da linha encapsulada
     */
    public double retornaComprimento(){

        return comprimento;

    } // fim do método retornaComprimento

    /**
     * O método retornaPontoA retorna um objeto clone do objeto pontoA da
     * classe encapsulada.
     * 
     * @return um clone do ponto A encapsulado na classe
     */
    public Ponto2D retornaPontoA(){

        return pontoA.clona();

    } // fim do método retornaPontoA

    /**
     * O método retornaPontoB retorna um objeto clone do objeto pontoB da
     * classe encapsulada.
     * 
     * @return um clone do ponto B encapsulado na classe
     */
    public Ponto2D retornaPontoB(){

        return pontoB.clona();

    } // fim do método retornaPontoB

} // fim da classe Linha