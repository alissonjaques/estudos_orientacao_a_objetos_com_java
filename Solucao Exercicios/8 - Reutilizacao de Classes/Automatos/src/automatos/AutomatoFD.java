package automatos;

/**
 * A classe AutomatoFD representa um autômato finito determinístico que
 * interpreta cadeias que começam e terminam com 1, sendo o alfabeto desse altômato
 * os símbolos 1 e 0.
 *
 * @author Alisson Jaques
 */
public class AutomatoFD { // declara a classe

    /**
     * O método main permite a execução dessa classe. Ele possui uma estrutura
     * aninhada de comandos switch, dentro de um laço while, que representa as
     * transições do autômato, ao ler uma cadeia de entrada.
     *
     * @param cadeia uma sequência de caracteres a ser lida pelo autômato
     */
    public static void main(String cadeia) {
        int estado; // o estado atual
        int indice; // o indice atual da cadeia

        estado = 0; // o estado inicial é 0 (S)
        indice = 0; // o primeiro caracter da cadeia está no índice 0

        while (indice < cadeia.length()) { // enquanto não percorrer toda a cadeia de entrada, faça            
            switch (estado) { // caso o estado for:
                case 0: // 0 (S), faça: 
                    switch (cadeia.charAt(indice)) { // caso o símbolo da cadeia for
                        case '0': // 0, faça:
                            estado = 3; // vai para o estado 3 (C)
                            break;
                        case '1': // 1: faça
                            estado = 1; // vai para o estado 1 (A)
                            break;
                        default: // senão, informe que o autômato não interpreta a cadeia
                            System.out.println("Cadeia não pertence ao alfabeto do autômato.");
                            return;
                    }
                    break;
                case 1: // 1, faça: 
                    switch (cadeia.charAt(indice)) { // caso o símbolo da cadeia for
                        case '0': //0, faça:
                            estado = 2; // vai para o estado 2 (B)
                            break;
                        case '1': //1, faça:
                            estado = 1; // permanece no estado 1 (A)
                            break;
                        default: // senão, informe que o autômato não interpreta a cadeia 
                            System.out.println("Cadeia não pertence ao alfabeto do autômato.");
                            return;
                    }
                    break;
                case 2:
                    switch (cadeia.charAt(indice)) { // caso o símbolo da cadeia for
                        case '0': //0, faça:
                            estado = 2; // permanece no estado 2 (B)
                            break;
                        case '1': //1, faça:
                            estado = 1; // vai para o estado 1 (A)
                            break;
                        default: // senão, informe que o autômato não interpreta a cadeia 
                            System.out.println("Cadeia não pertence ao alfabeto do autômato.");
                            return;
                    }
                    break;
                case 3:
                    switch (cadeia.charAt(indice)) { // caso o símbolo da cadeia for
                        case '0': //0, faça:
                            estado = 3; // permanece no estado 3 (C)
                            break;
                        case '1': //1, faça:
                            estado = 3; // permanece no estado 3 (C)
                            break;
                        default: // senão, informe que o autômato não interpreta a cadeia 
                            System.out.println("Cadeia não pertence ao alfabeto do autômato.");
                            return;
                    }
                    break;
            }
            indice++;
        }

        if (estado == 1) { // se o estado final for o estado 1 (A)
            System.out.println("Aceita."); // então o autômato aceita a cadeia
        } else { // senão
            System.out.println("Rejeita"); // o autômato não aceita a cadeia
        }
    } // fim do método main
} // fim da classe AutomatoContaPar
 