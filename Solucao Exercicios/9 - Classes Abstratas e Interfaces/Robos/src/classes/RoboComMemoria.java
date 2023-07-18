package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe RoboComMemoria representa um rob� que se movimenta em um plano, nas 
 * quatro dire��es cardeais. Esse rob� � capaz de retornar � sua posi��o inicial, 
 * caso quem o esteja controlando achar necess�rio. Est� classe � uma especializa��o
 * da classe RoboAbstrato.
 * @author Alisson Jaques
 */
public class RoboComMemoria extends RoboAbstrato { // declara��o da classe
    
    /**
     * Declara��o dos campos da classe
     */
    protected List<Short> listaDirecoes; // uma lisat contendo as dire��es que o rob� usou nos movimentos
    protected List<Integer> listaPassos; // a quantidade de passos por cada movimento
    protected boolean controlador;       // um bot�o controlador
    protected short posicaoInicial;      // guarda a posi��o inicial do rob�

    /**
     * O construtor completo da classe RoboComMemoria, que rebece argumentos suficientes
     * para inicializar todos os campos desta classe.
     * @param n o nome do rob�
     * @param px a posi��o x do rob�
     * @param py a posi��o y do rob�
     * @param d a dire��o do rob� (em graus)
     */
    public RoboComMemoria(String n, int px, int py, short d) {
        super(n, px, py, d); // delega a inicializa��o dos campos herdados ao construtor da super classe
        listaDirecoes = new ArrayList();
        listaPassos = new ArrayList();
        controlador = true;
        posicaoInicial = d;
    } // fim do construtor completo

    /**
     * O construtor default da classe RoboComMemoria que n�o recebe nenhum argumento
     * e inicializa os campos desta classe com valores default.
     */
    public RoboComMemoria() {
        listaDirecoes = new ArrayList();
        listaPassos = new ArrayList();
        controlador = true;
        posicaoInicial = 90;
    } // fim do construtor default

    /**
     * O m�todo retorna�Origem realiza todos os movimentos do rob�, de forma 
     * invertida, at� ele retornar � posi��o inicial.
     */
    public void retorna�Origem() {
        controlador = false;
        for (int i = listaDirecoes.size() - 1; i >= 0; i--) { // enquanto n�o percorrer todos os movimentos, fa�a:
            switch (listaDirecoes.get(i)) { // caso dire��o seja:
                case 90: // norte
                    mudaDire��o((short) 270); // muda para sul
                    move(listaPassos.get(i)); // realiza o retorno do movimento
                    break;
                case 270: // sul
                    mudaDire��o((short) 90); // muda para norte
                    move(listaPassos.get(i));
                    break;
                case 0: // leste
                    mudaDire��o((short) 180); // muda para oeste
                    move(listaPassos.get(i));
                    break;
                case 180: // oeste
                    mudaDire��o((short) 0); // muda para leste
                    move(listaPassos.get(i));
                    break;
            }
        }

        listaDirecoes = new ArrayList();
        listaPassos = new ArrayList();
        mudaDire��o(getPosicaoInicial()); // retorna a dire��o atual do rob�
        controlador = true;
    } // fim do m�todo retorna�Origem

    /**
     * O m�todo mudaDire��o permite que a dire��o do rob� seja mudada depois
     * dele ter sido criado.
     *
     * @param novaDire��o a nova dire��o para o rob�.
     */
    @Override
    public void mudaDire��o(short novaDire��o) {
        setDire��oAtual(novaDire��o);
        this.move((int) 0);
    } // fim do m�todo mudaDire��o

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
                if (controlador) {
                    listaDirecoes.add((short) 0);
                    listaPassos.add(passos);
                }
                break; // passos positivos na dire��o X
            case 90:
                moveY(+passos);
                if (controlador) {
                    listaDirecoes.add((short) 90);
                    listaPassos.add(passos);
                }
                break; // passos positivos na dire��o Y
            case 180:
                moveX(-passos);
                if (controlador) {
                    listaDirecoes.add((short) 180);
                    listaPassos.add(passos);
                }
                break; // passos negativos na dire��o X
            case 270:
                moveY(-passos);
                if (controlador) {
                    listaDirecoes.add((short) 270);
                    listaPassos.add(passos);
                }
                break; // passos negativos na dire��o Y
        }
    }

    /**
     * @return the posicaoInicial
     */
    public short getPosicaoInicial() {
        return posicaoInicial;
    }

    /**
     * @param posicaoInicial the posicaoInicial to set
     */
    public void setPosicaoInicial(short posicaoInicial) {
        this.posicaoInicial = posicaoInicial;
    }
}
