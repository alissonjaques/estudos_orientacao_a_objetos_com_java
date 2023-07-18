package classes;

/**
 * A classe abstrata RoboAbstrato, que define que métodos e campos mínimos uma
 * classe que implementa um robô deve conter. Esta classe é declarada como sendo
 * abstrata, assim não pode ser instanciada diretamente. Alguns de seus métodos
 * tem corpo, podendo ser herdados diretamente por outra classe, ou sobrepostos.
 * Os métodos que são declarados como sendo abstratos não tem corpo, e devem
 * obrigatoriamente ser implementados pelas classes herdeiras (a não ser que as
 * classes herdeiras sejam também abstratas).
 */
public abstract class RoboAbstrato // declaração da classe abstrata
{

    /**
     * Declaração dos campos da classe
     */
    protected String nomeDoRobô;
    protected int posiçãoXAtual, posiçãoYAtual;
    protected short direçãoAtual; // permite maior flexibilidade na representação da
    // direção - consideraremos que são valores em graus

    /**
     * O construtor para a classe RoboAbstrato, que recebe argumentos para
     * inicializar todos os campos da classe.
     *
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    public RoboAbstrato(String n, int px, int py, short d) {
        nomeDoRobô = n;
        posiçãoXAtual = px;
        posiçãoYAtual = py;
        direçãoAtual = d;
    } // fim do construtor com todos os argumentos
    
    /**
     * O construtor default para a classe RoboAbstrato
     * inicializa os campos da classe com valores
     * default.
     */
    public RoboAbstrato(){
    
    } // fim do construtor default
    /**
     * Esta versão do método move modifica a posição do robô em uma unidade na
     * direção em que o robô está. Este método não recebe argumentos, e chama o
     * método move com argumentos.
     */
    public void move() {
        move(1);
    } // fim do método move

    /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está. O método é declarado como
     * abstrato e não tem corpo, pois não sabemos exatamente como um robô
     * (instância de classe que herda desta) irá implementar seus movimentos.
     *
     * @param passos o número de "passos" para o robô
     */
    public abstract void move(int passos);

    /**
     * Este método permite a modificação do campo posiçãoXAtual, já que o método
     * move foi declarado como abstrato e não existe outra maneira de modificar
     * a posição do robô.
     *
     * @param passos o número de "passos" que serão usados para modificar a
     * posição X (horizontal) atual do robô
     */
    public void moveX(int passos) {
        setPosiçãoXAtual(getPosiçãoXAtual() + passos);
    }

    /**
     * Este método permite a modificação do campo posiçãoYAtual, já que o método
     * move foi declarado como abstrato e não existe outra maneira de modificar
     * a posição do robô.
     *
     * @param passos o número de "passos" que serão usados para modificar a
     * posição Y (vertical) atual do robô
     */
    public void moveY(int passos) {
        setPosiçãoYAtual(getPosiçãoYAtual() + passos);
    }

    /**
     * O método mudaDireção permite que a direção do robô seja mudada depois
     * dele ter sido criado.
     *
     * @param novaDireção a nova direção para o robô.
     */
    public void mudaDireção(short novaDireção) {
        setDireçãoAtual(novaDireção);
    } // fim do método mudaDireção

    /**
     * Este método permite a verificação do calor do campo direçãoAtual, já que
     * o mesmo foi declarado como sendo privado.
     *
     * @return o valor do campo direçãoAtual
     */
    public short qualDireçãoAtual() {
        return getDireçãoAtual();
    }
  
    /**
     * @return the nomeDoRobô
     */
    public String getNomeDoRobô() {
        return nomeDoRobô;
    }

    /**
     * @param nomeDoRobô the nomeDoRobô to set
     */
    public void setNomeDoRobô(String nomeDoRobô) {
        this.nomeDoRobô = nomeDoRobô;
    }

    /**
     * @return the posiçãoXAtual
     */
    public int getPosiçãoXAtual() {
        return posiçãoXAtual;
    }

    /**
     * @param posiçãoXAtual the posiçãoXAtual to set
     */
    public void setPosiçãoXAtual(int posiçãoXAtual) {
        this.posiçãoXAtual = posiçãoXAtual;
    }

    /**
     * @return the posiçãoYAtual
     */
    public int getPosiçãoYAtual() {
        return posiçãoYAtual;
    }

    /**
     * @param posiçãoYAtual the posiçãoYAtual to set
     */
    public void setPosiçãoYAtual(int posiçãoYAtual) {
        this.posiçãoYAtual = posiçãoYAtual;
    }

    /**
     * @return the direçãoAtual
     */
    public short getDireçãoAtual() {
        return direçãoAtual;
    }

    /**
     * @param direçãoAtual the direçãoAtual to set
     */
    public void setDireçãoAtual(short direçãoAtual) {
        this.direçãoAtual = direçãoAtual;
    }
      
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado = "Nome do robô: " + getNomeDoRobô() + "\n";
        resultado = resultado + "Posição do robô: (" + getPosiçãoXAtual() + ","
                + getPosiçãoYAtual() + ")\n";
        resultado = resultado + "Direção do robô: " + getDireçãoAtual();
        return resultado;
    } // fim do método toString

} // fim da classe abstrata RoboAbstrato
