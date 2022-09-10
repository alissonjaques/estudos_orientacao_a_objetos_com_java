import java.util.Scanner; // importação da classe Scanner para manipular dados fornecidos pelo usuário

/**
 *  A classe PrincipalCartaDeBaralho possuí um único método,
 *  que é o método main. Esta classe demonstra usos da classe
 *  CartaDeBaralho.
 *  
 * @author Alisson Jaques
 */
public class PrincipalCartaDeBaralho { // declaração da classe
    
    /**
     *  O método main permite a execução desta classe,
     *  ele demonstra usos da classe CartaDeBaralho.
     *  @param argumentos os argumentos que podem ser passados ao
     *  método via linha de comando, mas que neste caso serão ignorados 
     */
    public static void main(String[] argumentos){

        byte valorDaCarta, naipeDaCarta; // declaração de variáveis auxiliares

        CartaDeBaralho zap = new CartaDeBaralho((byte)4,(byte)2); // criamos uma carta (Quatro de Paus)
        Scanner opcao = new Scanner(System.in); // criamos uma referência para uma instância da classe Scanner

        System.out.println(); // quebra de linha para organização dos dados no terminal
        zap.imprimeCarta();   // imprimimos os campos do objeto zap formatados (Quatro de Paus)

        System.out.println("\nInforme o valor da carta e o seu naipe:"); // solicitamos ao usuário que nos informe uma carta
        valorDaCarta = opcao.nextByte();  // armazenamos o valor da carta informado na variável valorDaCarta
        naipeDaCarta = opcao.nextByte();  // armazenamos o valor do naipe informado na variável naipeDaCarta
        opcao.close(); // fechamos a referência opcao

        System.out.println(); // quebra de linha para organização dos dados no terminal
        CartaDeBaralho cartaEscolhida = new CartaDeBaralho(valorDaCarta,naipeDaCarta); // declaramos uma nova instância da classe
                                                                                       // CartaDeBaralho passando como argumento para
                                                                                       // o construtor dessa classe os valores informados
                                                                                       // pelo usuário
        // imprimimos a carta informada pelo usuário                                                                               
        System.out.print("A carta escolhida foi: ");
        cartaEscolhida.imprimeCarta();
        System.out.println(); // quebra de linha para organização dos dados no terminal

    } // fim do método main

} // fim da classe PrincipalCartaDeBaralho
