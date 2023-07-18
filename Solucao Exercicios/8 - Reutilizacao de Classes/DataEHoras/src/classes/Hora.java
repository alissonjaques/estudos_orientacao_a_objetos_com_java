package classes;

/**
 * A classe Hora, que encapsula os dados de uma hora qualquer e que faz parte do
 * pacote DataHora.
 */
public class Hora {

    /**
     * Declaração dos campos da classe. Os campos são declarados sem
     * modificadores, e serão acessíveis somente para as classes que herdarem
     * desta.
     */
    byte hora, minuto, segundo;

    /**
     * O construtor da classe, que recebe argumentos para inicializar os campos
     * da classe. Note que o construtor é declarado como sendo público, caso
     * contrário ele não poderá ser chamado de fora do pacote! Nenhuma
     * verificação é feita nos valores, para manter o exemplo simples.
     *
     * @param h a hora a ser encapsulada por uma instância desta classe
     * @param m o minuto a ser encapsulado por uma instância desta classe
     * @param s o segundo a ser encapsulado por uma instância desta classe
     */
    public Hora(byte h, byte m, byte s) {
        hora = h;
        minuto = m;
        segundo = s;
    }
    
    /**
     * O construtor default para a classe Hora que não recebe argumentos e inicializa
     * os campos da classe com valores default.
     */
    public Hora(){
        hora = 0;
        minuto = 0;
        segundo =0;
    }
    
    /**
     * O método éIgual recebe uma instância da própria classe Hora como
     * argumento e verifica se a hora representada pela classe e pela instância
     * que foi passada é a mesma. A comparação é feita comparando os campos da
     * das instâncias, um a um.
     *
     * @param outraHora uma instância da própria classe Hora
     * @return true se a hora encapsulada for igual à passada, false caso
     * contrário
     */
    public boolean éIgual(Hora outraHora) {
        return (hora == outraHora.hora)
                && // se as horas forem iguais E
                (minuto == outraHora.minuto)
                && // se os minutos forem iguais E
                (segundo == outraHora.segundo); // se os segundos forem iguais
    } // fim do método éIgual
    
    /**
     * O método éAntesDe recebe um horário como argumento e verifica se esse horário é anterior
     * ao encapsulado na classe.
     * 
     * @param umaHora uma instância da própria classe Hora
     * @return true se a hora passada como argumento vier antes da encapsulada, false
     * caso contrário
     */
    public boolean éAntesDe(Hora umaHora){
        if(hora==umaHora.hora){
           if(minuto==umaHora.minuto){
               if(segundo==umaHora.segundo){
                   return false;
               }
               else return segundo>umaHora.segundo;
           }
           else return minuto>umaHora.minuto;        
        }
        else return hora>umaHora.hora;
    } // fim do método éAntesDe
    
    /**
     * O método éDepoisDe recebe um horário como argumento e verifica se esse horário é posterior
     * ao encapsulado na classe.
     * 
     * @param umaHora uma instância da própria classe Hora
     * @return true se a hora passada como argumento vier depois da encapsulada, false
     * caso contrário
     */
    public boolean éDepoisDe(Hora umaHora){
        if(hora==umaHora.hora){
           if(minuto==umaHora.minuto){
               if(segundo==umaHora.segundo){
                   return false;
               }
               else return segundo<umaHora.segundo;
           }
           else return minuto<umaHora.minuto;        
        }
        else return hora<umaHora.hora;
    } // fim do método éDepoisDe

    /**
     * O método toString, que retorna uma String contendo os campos desta
     * classe, formatados de forma adequada.
     *
     * @return uma String com os valores dos campos desta classe
     */
    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    } // fim do método toString
} // fim da classe Hora
