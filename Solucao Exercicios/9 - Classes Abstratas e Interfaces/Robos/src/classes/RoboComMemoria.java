package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe RoboComMemoria representa um robô que se movimenta em um plano, nas 
 * quatro direções cardeais. Esse robô é capaz de retornar à sua posição inicial, 
 * caso quem o esteja controlando achar necessário. Está classe é uma especialização
 * da classe RoboAbstrato.
 * @author Alisson Jaques
 */
public class RoboComMemoria extends RoboAbstrato { // declaração da classe
    
    /**
     * Declaração dos campos da classe
     */
    protected List<Short> listaDirecoes; // uma lisat contendo as direções que o robô usou nos movimentos
    protected List<Integer> listaPassos; // a quantidade de passos por cada movimento
    protected boolean controlador;       // um botão controlador
    protected short posicaoInicial;      // guarda a posição inicial do robô

    /**
     * O construtor completo da classe RoboComMemoria, que rebece argumentos suficientes
     * para inicializar todos os campos desta classe.
     * @param n o nome do robô
     * @param px a posição x do robô
     * @param py a posição y do robô
     * @param d a direção do robô (em graus)
     */
    public RoboComMemoria(String n, int px, int py, short d) {
        super(n, px, py, d); // delega a inicialização dos campos herdados ao construtor da super classe
        listaDirecoes = new ArrayList();
        listaPassos = new ArrayList();
        controlador = true;
        posicaoInicial = d;
    } // fim do construtor completo

    /**
     * O construtor default da classe RoboComMemoria que não recebe nenhum argumento
     * e inicializa os campos desta classe com valores default.
     */
    public RoboComMemoria() {
        listaDirecoes = new ArrayList();
        listaPassos = new ArrayList();
        controlador = true;
        posicaoInicial = 90;
    } // fim do construtor default

    /**
     * O método retornaÀOrigem realiza todos os movimentos do robô, de forma 
     * invertida, até ele retornar à posição inicial.
     */
    public void retornaÀOrigem() {
        controlador = false;
        for (int i = listaDirecoes.size() - 1; i >= 0; i--) { // enquanto não percorrer todos os movimentos, faça:
            switch (listaDirecoes.get(i)) { // caso direção seja:
                case 90: // norte
                    mudaDireção((short) 270); // muda para sul
                    move(listaPassos.get(i)); // realiza o retorno do movimento
                    break;
                case 270: // sul
                    mudaDireção((short) 90); // muda para norte
                    move(listaPassos.get(i));
                    break;
                case 0: // leste
                    mudaDireção((short) 180); // muda para oeste
                    move(listaPassos.get(i));
                    break;
                case 180: // oeste
                    mudaDireção((short) 0); // muda para leste
                    move(listaPassos.get(i));
                    break;
            }
        }

        listaDirecoes = new ArrayList();
        listaPassos = new ArrayList();
        mudaDireção(getPosicaoInicial()); // retorna a direção atual do robô
        controlador = true;
    } // fim do método retornaÀOrigem

    /**
     * O método mudaDireção permite que a direção do robô seja mudada depois
     * dele ter sido criado.
     *
     * @param novaDireção a nova direção para o robô.
     */
    @Override
    public void mudaDireção(short novaDireção) {
        setDireçãoAtual(novaDireção);
        this.move((int) 0);
    } // fim do método mudaDireção

    /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está. O método foi declarado como sendo
     * abstrato na classe ancestral, e deve ser implementado nesta classe.
     * Consideramos que um robô simples pode se movimentar somente nas quatro
     * direções cardeais, ou seja, 0, 90, 180, 270 graus, correspondentes aos
     * pontos cardeais E, N, O, S. Outros valores são ignorados. Como não
     * podemos modificar diretamente os campos que determinam a posição atual do
     * robô, usamos os métodos moveX e moveY, herdados da classe ancestral.
     *
     * @param passos o número de "passos" para o robô
     */
    @Override
    public void move(int passos) {
        switch (qualDireçãoAtual()) // recuperamos a direção atual através deste método
        {
            case 0:
                moveX(+passos);
                if (controlador) {
                    listaDirecoes.add((short) 0);
                    listaPassos.add(passos);
                }
                break; // passos positivos na direção X
            case 90:
                moveY(+passos);
                if (controlador) {
                    listaDirecoes.add((short) 90);
                    listaPassos.add(passos);
                }
                break; // passos positivos na direção Y
            case 180:
                moveX(-passos);
                if (controlador) {
                    listaDirecoes.add((short) 180);
                    listaPassos.add(passos);
                }
                break; // passos negativos na direção X
            case 270:
                moveY(-passos);
                if (controlador) {
                    listaDirecoes.add((short) 270);
                    listaPassos.add(passos);
                }
                break; // passos negativos na direção Y
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
