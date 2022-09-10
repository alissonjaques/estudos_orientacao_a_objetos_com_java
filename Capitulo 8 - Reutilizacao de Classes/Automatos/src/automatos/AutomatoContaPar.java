package automatos;

/**
 * A classe AutomatoContaPar representa um autômato finito determinístico que interpreta
 * cadeias com quantidas pares de caracteres.
 * 
 * @author Alisson Jaques
 */
public class AutomatoContaPar { // declara a classe
    
    /**
     * O método main permite a execução dessa classe. Ele possui uma estrutura aninhada
     * de comandos switch, dentro de um laço while, que representa as transições do autômato,
     * ao ler uma cadeia de entrada.
     * 
     * @param cadeia uma sequência de caracteres a ser lida pelo autômato
     */
    public static void main(String cadeia){
        int estado; // o estado atual
        int indice; // o indice atual da cadeia
        
        estado = 0; // o estado inicial é 0
        indice = 0; // o primeiro caracterd da cadeia está no índice 0
        
        while(indice<cadeia.length()){ // enquanto não percorrer toda a cadeia de entrada, faça            
            switch(estado){ // caso o estado for:
                case 0: // 0, faça: 
                    switch(cadeia.charAt(indice)){ // caso o símbolo da cadeia for
                        case '0': // 0, faça:
                            estado = 1; // vai para o estado 1
                            break;
                        case '1': // 1: faça
                            estado = 1; // vai para o estado 1
                            break;
                        default: // senão, informe que o autômato não interpreta a cadeia
                            System.out.println("Cadeia não pertence ao alfabeto do autômato.");
                            return;
                    }
                    break;
                case 1: // 1, faça: 
                    switch(cadeia.charAt(indice)){ // caso o símbolo da cadeia for
                        case '0': //0, faça:
                            estado = 0;
                            break;
                        case '1': //1, faça:
                            estado = 0;
                            break;
                        default: // senão, informe que o autômato não interpreta a cadeia 
                            System.out.println("Cadeia não pertence ao alfabeto do autômato.");
                            return;
                    }                    
                    break;            
            }            
            indice++;
        }
        
        if(estado==0){ // se o estado final for o estado 0
            System.out.println("Aceita."); // então o autômato aceita a cadeia
        }
        else{ // senão
            System.out.println("Rejeita"); // o autômato não aceita a cadeia
        }
    } // fim do método main
} // fim da classe AutomatoContaPar