package classes;

/**
 * A classe abstrata RoboAbstrato, que define que m�todos e campos m�nimos uma
 * classe que implementa um rob� deve conter. Esta classe � declarada como sendo
 * abstrata, assim n�o pode ser instanciada diretamente. Alguns de seus m�todos
 * tem corpo, podendo ser herdados diretamente por outra classe, ou sobrepostos.
 * Os m�todos que s�o declarados como sendo abstratos n�o tem corpo, e devem
 * obrigatoriamente ser implementados pelas classes herdeiras (a n�o ser que as
 * classes herdeiras sejam tamb�m abstratas).
 */
public abstract class RoboAbstrato // declara��o da classe abstrata
{

    /**
     * Declara��o dos campos da classe
     */
    protected String nomeDoRob�;
    protected int posi��oXAtual, posi��oYAtual;
    protected short dire��oAtual; // permite maior flexibilidade na representa��o da
    // dire��o - consideraremos que s�o valores em graus

    /**
     * O construtor para a classe RoboAbstrato, que recebe argumentos para
     * inicializar todos os campos da classe.
     *
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     */
    public RoboAbstrato(String n, int px, int py, short d) {
        nomeDoRob� = n;
        posi��oXAtual = px;
        posi��oYAtual = py;
        dire��oAtual = d;
    } // fim do construtor com todos os argumentos
    
    /**
     * O construtor default para a classe RoboAbstrato
     * inicializa os campos da classe com valores
     * default.
     */
    public RoboAbstrato(){
    
    } // fim do construtor default
    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em uma unidade na
     * dire��o em que o rob� est�. Este m�todo n�o recebe argumentos, e chama o
     * m�todo move com argumentos.
     */
    public void move() {
        move(1);
    } // fim do m�todo move

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de
     * unidades na dire��o em que o rob� est�. O m�todo � declarado como
     * abstrato e n�o tem corpo, pois n�o sabemos exatamente como um rob�
     * (inst�ncia de classe que herda desta) ir� implementar seus movimentos.
     *
     * @param passos o n�mero de "passos" para o rob�
     */
    public abstract void move(int passos);

    /**
     * Este m�todo permite a modifica��o do campo posi��oXAtual, j� que o m�todo
     * move foi declarado como abstrato e n�o existe outra maneira de modificar
     * a posi��o do rob�.
     *
     * @param passos o n�mero de "passos" que ser�o usados para modificar a
     * posi��o X (horizontal) atual do rob�
     */
    public void moveX(int passos) {
        setPosi��oXAtual(getPosi��oXAtual() + passos);
    }

    /**
     * Este m�todo permite a modifica��o do campo posi��oYAtual, j� que o m�todo
     * move foi declarado como abstrato e n�o existe outra maneira de modificar
     * a posi��o do rob�.
     *
     * @param passos o n�mero de "passos" que ser�o usados para modificar a
     * posi��o Y (vertical) atual do rob�
     */
    public void moveY(int passos) {
        setPosi��oYAtual(getPosi��oYAtual() + passos);
    }

    /**
     * O m�todo mudaDire��o permite que a dire��o do rob� seja mudada depois
     * dele ter sido criado.
     *
     * @param novaDire��o a nova dire��o para o rob�.
     */
    public void mudaDire��o(short novaDire��o) {
        setDire��oAtual(novaDire��o);
    } // fim do m�todo mudaDire��o

    /**
     * Este m�todo permite a verifica��o do calor do campo dire��oAtual, j� que
     * o mesmo foi declarado como sendo privado.
     *
     * @return o valor do campo dire��oAtual
     */
    public short qualDire��oAtual() {
        return getDire��oAtual();
    }
  
    /**
     * @return the nomeDoRob�
     */
    public String getNomeDoRob�() {
        return nomeDoRob�;
    }

    /**
     * @param nomeDoRob� the nomeDoRob� to set
     */
    public void setNomeDoRob�(String nomeDoRob�) {
        this.nomeDoRob� = nomeDoRob�;
    }

    /**
     * @return the posi��oXAtual
     */
    public int getPosi��oXAtual() {
        return posi��oXAtual;
    }

    /**
     * @param posi��oXAtual the posi��oXAtual to set
     */
    public void setPosi��oXAtual(int posi��oXAtual) {
        this.posi��oXAtual = posi��oXAtual;
    }

    /**
     * @return the posi��oYAtual
     */
    public int getPosi��oYAtual() {
        return posi��oYAtual;
    }

    /**
     * @param posi��oYAtual the posi��oYAtual to set
     */
    public void setPosi��oYAtual(int posi��oYAtual) {
        this.posi��oYAtual = posi��oYAtual;
    }

    /**
     * @return the dire��oAtual
     */
    public short getDire��oAtual() {
        return dire��oAtual;
    }

    /**
     * @param dire��oAtual the dire��oAtual to set
     */
    public void setDire��oAtual(short dire��oAtual) {
        this.dire��oAtual = dire��oAtual;
    }
      
    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado = "Nome do rob�: " + getNomeDoRob�() + "\n";
        resultado = resultado + "Posi��o do rob�: (" + getPosi��oXAtual() + ","
                + getPosi��oYAtual() + ")\n";
        resultado = resultado + "Dire��o do rob�: " + getDire��oAtual();
        return resultado;
    } // fim do m�todo toString

} // fim da classe abstrata RoboAbstrato
