/**
 *  A classe PrincipalRetangulo demonstra exemplos de uso das 
 *  classes Ponto2D e Retangulo.
 *  
 *  @author Alisson Jaques  
 */
public class PrincipalRetangulo { // declaração da classe
    
    /**
     * O método main permite a execução desta classe, ele demonstra exemplos de uso das
     * classes Ponto2D e Retangulo.
     * 
     * @param argumentos os argumentos que podem ser passados ao método via linha de comando,
     * mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos){

        /*
            São criados os quatro pontos do retângulo, utilizando
            instâncias da classe Ponto2D, e depois passamos esses pontos
            como argumentos para o construtor da classe Retangulo criando,
            assim, um objeto retângulo.        
        */
        Ponto2D a = new Ponto2D(1,1);                // Ponto A = (1,1)
        Ponto2D b = new Ponto2D(3,1);                // Ponto B = (3,1)
        Ponto2D c = new Ponto2D(3,3);                // Ponto C = (3,3)
        Ponto2D d = new Ponto2D(1,3);                // Ponto D = (1,3)
        Retangulo quadrado2 = new Retangulo(a,b,c,d);  // Retângulo ABCD

        // Tentamos criar um retângulo com pontos absurdos (para verificar o tratando 
        // que a classe Retângulo faz nesses casos)
        Ponto2D a1 = new Ponto2D(1,4);                   // Ponto A = (1,4)
        Ponto2D b1 = new Ponto2D(1,9);                   // Ponto B = (1,9)
        Ponto2D c1 = new Ponto2D(1,5);                   // Ponto C = (1,5)
        Ponto2D d1 = new Ponto2D(1,7);                   // Ponto D = (1,7)
        Retangulo retangulo = new Retangulo(a1,b1,c1,d1);// Retângulo ABCD

        Retangulo clone = quadrado2.clona(); // utilização do método clona, da classe Retangulo
        
        // Impressão dos dados do primeiro retângulo criado:
        System.out.println(quadrado2);
        System.out.println("Diagonal do Retângulo: " + quadrado2.comprimentoDiagonal());
        System.out.println("Altura do Retângulo: " + quadrado2.retornaAltura());
        System.out.println("Área do Retângulo: " + quadrado2.areaRetangulo());
        System.out.println("Base do Retângulo: " + quadrado2.retornaBase());
        System.out.println(); // quebra de linha para organização dos dados no terminal
        
        // Impressão dos dados do segundo retângulo criado:
        System.out.println(retangulo);
        System.out.println("Diagonal do Retângulo: " + retangulo.comprimentoDiagonal());
        System.out.println("Altura do Retângulo: " + retangulo.retornaAltura());
        System.out.println("Área do Retângulo: " + retangulo.areaRetangulo());
        System.out.println("Base do Retângulo: " + retangulo.retornaBase());
        System.out.println(); // quebra de linha para organização dos dados no terminal

        System.out.println(clone.éIgual(quadrado2));    // imprime true
        System.out.println(quadrado2.éIgual(retangulo)); // imprime false
        System.out.println(clone);

    } // fim do método main

} // fim da classe PrincipalRetangulo