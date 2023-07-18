/**
 *  A classe Retangulo possuí campos e métodos que representam
 *  um retângulo no plano cartesiano ortogonal.
 *  
 *  @author Alisson Jaques 
 */
public class Retangulo {

    /*

        Declaração dos campos da classe
    
    */
    private Ponto2D pontoA; // Ponto A
    private Ponto2D pontoB; // Ponto B
    private Ponto2D pontoC; // Ponto C
    private Ponto2D pontoD; // Ponto D

    /**
     *  O construtor da classe Retangulo, que recebe quatro pontos como
     *  argumentos e cria instâncias correspondentes para seus campos,
     *  formando um retângulo ABCD com as mesmas. Caso sejam fornecidos
     *  pontos inválidos (que não formam retângulo) será criado um retângulo
     *  default que representa um quadrado de lado um, seus pontos serão 
     *  A = (1,1), B = (2,1), C = (2,2) e D = (1,2).
     * 
     *  @param A o ponto A do Retângulo
     *  @param B o ponto B do Retângulo
     *  @param C o ponto C do Retângulo
     *  @param D o ponto D do Retângulo
     */
    Retangulo(Ponto2D A, Ponto2D B, Ponto2D C, Ponto2D D){

        if(verificaRetangulo(A,B,C,D)){ // se o pontos formarem um retângulo

            /* Cria instâncias e as associam com os campos da classe.
               A palavra chave new é usada para garantir o encapsulamento
               dos campos da classe.
            */
            pontoA = new Ponto2D(A.retornaX(),A.retornaY());
            pontoB = new Ponto2D(B.retornaX(),B.retornaY());
            pontoC = new Ponto2D(C.retornaX(),C.retornaY());
            pontoD = new Ponto2D(D.retornaX(),D.retornaY());

        }
        else{ // senão

            // Informamos que será criado um retângulo default e criamos instâncias
            // com valores default para os campos da classe.
            System.out.println("Os pontos não formam um retângulo, será criado um retângulo default.");
            pontoA = new Ponto2D(1,1);
            pontoB = new Ponto2D(2,1);
            pontoC = new Ponto2D(2,2);
            pontoD = new Ponto2D(1,2);
        
        } // fim-se

    } // fim do construtor

    /**
     *  O construtor default para a classe retângulo, que não
     *  recebe nenhum argumento e cria um retângulo ABCD default,
     *  cujos pontos são: A = (1,1), B = (2,1), C = (2,2) e D = (1,2).
     */
    Retangulo(){

        // Informa que não foram informados pontos ao construtor da classe e que,
        // devido a isso, será criado um retângulo default
        System.out.println("Os pontos não foram informados, será criado um retângulo default.");
        pontoA = new Ponto2D(1,1);
        pontoB = new Ponto2D(2,1);
        pontoC = new Ponto2D(2,2);
        pontoD = new Ponto2D(1,2);

    } // fim do construtor default

    /**
	 * O método clona retorna uma nova instância da classe Retangulo, que contém os
	 * mesmos pontos encapsulados na classe, ou seja, quando este método for
	 * executado a partir de uma instância desta classe, ele retornará uma nova
	 * instância com os mesmos valores encapsulados.
	 * @return uma nova instância da classe Retangulo contendo os valores encapsulados
	 */
	public Retangulo clona() {
		
		return new Retangulo(pontoA, pontoB, pontoC, pontoD); // uma instância clone do retângulo encapsulado é retornada
	
    } // fim do método clona

    /**
     *  O método éIgual verifica se o retângulo passado como argumento é igual ao retângulo
     *  encapsulado. Se for igual este método retorna o valor booleano true, caso contrário
     *  retorna o valor booleano false.
     *  
     *  @param outroRetangulo uma outra instância da classe Retangulo
     *  @return true se os retângulos forem iguais, false caso contrário
     */
    public boolean éIgual(Retangulo outroRetangulo){

        if((pontoA.éIgual(outroRetangulo.pontoA)) && (pontoB.éIgual(outroRetangulo.pontoB)) && (pontoC.éIgual(outroRetangulo.pontoC)) && (pontoD.éIgual(outroRetangulo.pontoD))){ // se os retângulos forem iguais
            
            return true; // retorna true

        }
        else{ // senão
            
            return false; // retorna false

        }// fim-se

    } // fim do método éIgual
    
    /**
     *  O método verificaRetangulo verifica se os pontos passados ao construtor da
     *  classe formam um retângulo. Se os pontos formarem retângulo é retornado o valor
     *  booleano true, caso não formem o método retorna o valor booleano false.
     *  @return true se os pontos informados formam retângulo, false caso contrário
     */
    public boolean verificaRetangulo(Ponto2D A, Ponto2D B, Ponto2D C, Ponto2D D){

        if(A.distancia(B) == C.distancia(D) && A.distancia(D) == B.distancia(C) && A.retornaX() == D.retornaX() && B.retornaX() == C.retornaX() && A.retornaY() == B.retornaY() && D.retornaY() == C.retornaY()){ // se os pontos formarem um retângulo

            return true; // retorna true

        }
        else{ // senão

            return false; // retorna false

        } // fim-se

    } // fim do método verificaRetangulo

    /**
     *  O método areaRetangulo não possuí argumentos e retorna
     *  a área do retângulo encapsulado.
     *  
     *  @return a área do retângulo encapsulado
     */
    public double areaRetangulo(){

        double area;

        area = pontoA.distancia(pontoB)*pontoB.distancia(pontoC); // area = base*altura

        return area;

    } // fim do método areaRetangulo

    /**
     *  O método retornaBase não possuí argumentos e retorna a
     *  base do retângulo encapsulado.
     * 
     *  @return a base do retângulo encapsulado
     */
    public double retornaBase(){

        return pontoA.distancia(pontoB);

    } // fim do método retornaBase

    /**
     *  O método retornaAltura não possuí argumentos e retorna a
     *  altura do retângulo encapsulado.
     * 
     *  @return a altura do retângulo encapsulado
     */
    public double retornaAltura(){

        return pontoB.distancia(pontoC);

    } // fim do método retornaAltura

    /**
     *  O método comprimentoDiagonal retorna o comprimento da 
     *  diagonal do retângulo encapsulado, este método não possuí
     *  argumentos.
     * 
     *  @return o comprimento da diagonal do retângulo encapsulado
     */
    public double comprimentoDiagonal(){

        // diagonal = raizQuadrada(b² + h²)
        double diagonal = Math.sqrt((pontoA.distancia(pontoB)*pontoA.distancia(pontoB))+(pontoB.distancia(pontoC)*pontoB.distancia(pontoC)));

        return diagonal;

    } // fim do método comprimentoDiagonal

    /**
     * O método retornaA retorna um clone do ponto A,
     * do retângulo encapsulado.
     * @return uma nova instância da classe Ponto2D, clone do pontoA
     * encapsulado
     */
    public Ponto2D retornaA(){

        return new Ponto2D(pontoA);

    } // fim do método retornaA

    /**
     * O método retornaB retorna um clone do ponto B,
     * do retângulo encapsulado.
     * @return uma nova instância da classe Ponto2D, clone do pontoB
     * encapsulado
     */
    public Ponto2D retornaB(){

        return new Ponto2D(pontoB);

    } // fim do método retornaB

    /**
     * O método retornaC retorna um clone do ponto C,
     * do retângulo encapsulado.
     * @return uma nova instância da classe Ponto2D, clone do pontoC
     * encapsulado
     */
    public Ponto2D retornaC(){

        return new Ponto2D(pontoC);

    } // fim do método retornaC

    /**
     * O método retornaA retorna um clone do ponto D,
     * do retângulo encapsulado.
     * @return uma nova instância da classe Ponto2D, clone do pontoD
     * encapsulado
     */
    public Ponto2D retornaD(){

        return new Ponto2D(pontoD);

    } // fim do método retornaD

    public Retangulo calculaInterseccao(Retangulo outroRetangulo){

        return null;


    }

    /**
     *  O método toString não possuí argumentos, ele retorna uma
     *  string contendo os campos do objeto formatados.
     *  
     *  @return uma string que representa o objeto da classe
     */
    public String toString(){

        String descricaoRetangulo = "";
        descricaoRetangulo += "Retângulo ABCD constituído pelos seguintes pontos:\n\n";
        descricaoRetangulo += "A = "+pontoA.toString()+"\n";
        descricaoRetangulo += "B = "+pontoB.toString()+"\n";
        descricaoRetangulo += "C = "+pontoC.toString()+"\n";
        descricaoRetangulo += "D = "+pontoD.toString()+"\n";
        
        return descricaoRetangulo;

    } // fim do método toString
    
} // fim classe Retangulo