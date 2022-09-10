package classes;

/**
 * A classe RoboSimples, que herda da classe RoboAbstrato e que representa um
 * rob� de comportamento simples. Esta classe herda todos os m�todos
 * n�o-abstratos da classe RoboAbstrato exceto o construtor, que � redeclarado
 * (mas aproveita o construtor da classe ancestral). Esta classe tamb�m
 * implementa o m�todo move, que foi declarado como sendo abstrato na classe
 * ancestral. A classe n�o tem nenhum campo adicional.
 */
class RoboSimples extends RoboAbstrato // declara��o da classe
{

    /**
     * O construtor para a classe RoboSimples, que recebe argumentos para
     * inicializar todos os campos da classe, que foram herdados da classe
     * RoboAbstrato. O construtor simplesmente repassa os argumentos para o
     * construtor da classe ancestral.
     *
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     */
    RoboSimples(String n, int px, int py, short d) {
        super(n, px, py, d);
    }
    
    /**
     * O m�todo mudaDire��o, sobrescreve o m�todo de mesmo nome (herdado da classe 
     * abstrata RoboAbstrato). Este m�todo recebe um valor que corresponde a um �ngulo
     * de nova dire��o e seta a dire��o do rob� de acordo com esse valor.
     * @param novaDire��o a nova dire��o do rob�
     */
    @Override
    public void mudaDire��o(short novaDire��o) {
        if(novaDire��o<45 || novaDire��o>315){ // se novaDire��o >315 ou novaDire��o <45
            setDire��oAtual((short)0); // nova dire��o do rob� ser� de 0 graus
        }
        else if(novaDire��o>=45 && novaDire��o<=135){ // sen�o se novaDire��o >=453 e novaDire��o <=135
            setDire��oAtual((short)90); // nova dire��o do rob� ser� de 90 graus
        }
        else if(novaDire��o>135 && novaDire��o<=225){ // sen�o se novaDire��o >135 e novaDire��o<=225
            setDire��oAtual((short)180); // nova dire��o do rob� ser� de 180 graus
        }
        else if(novaDire��o>225 && novaDire��o<=315){ // sen�o se novaDire��o >225 e novaDire��o <=315
            setDire��oAtual((short)270); // nova dire��o do rob� ser� de 270 graus
        }        
    } 
    
    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de
     * unidades na dire��o em que o rob� est�. O m�todo foi declarado como sendo
     * abstrato na classe ancestral, e deve ser implementado nesta classe.
     * Consideramos que um rob� simples pode se movimentar somente nas quatro
     * dire��es cardeais, ou seja, 0, 90, 180, 270 graus, correspondentes aos
     * pontos cardeais E, N, O, S. Outros valores s�o ignorados. Como n�o
     * podemos modificar diretamente os campos que determinam a posi��o atual do
     * rob�, usamos os m�todos moveX e moveY, herdados da classe ancestral.
     *
     * @param passos o n�mero de "passos" para o rob�
     */
    @Override
    public void move(int passos) {
        switch (qualDire��oAtual()) // recuperamos a dire��o atual atrav�s deste m�todo
        {
            case 0:
                moveX(+passos);
                break; // passos positivos na dire��o X
            case 90:
                moveY(+passos);
                break; // passos positivos na dire��o Y
            case 180:
                moveX(-passos);
                break; // passos negativos na dire��o X
            case 270:
                moveY(-passos);
                break; // passos negativos na dire��o Y
        }
    }

} // fim da classe RoboSimples
