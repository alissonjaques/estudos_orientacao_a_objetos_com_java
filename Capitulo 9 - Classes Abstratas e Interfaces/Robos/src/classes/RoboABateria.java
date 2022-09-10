package classes;

/**
 * A classe RoboABateria, que herda da classe RoboAbstrato e que representa um
 * rob� que consome energia com seus movimentos. Esta classe herda todos os
 * m�todos n�o-abstratos da classe RoboAbstrato exceto o construtor. Esta classe
 * tamb�m implementa o m�todo move, que foi declarado como sendo abstrato na
 * classe ancestral. A classe cont�m um campo adicional para indicar quantos
 * passos o rob� ainda pode dar.
 */
class RoboABateria extends RoboAbstrato // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    private double energia; // a energia que o rob� ainda possui

    /**
     * O construtor para a classe RoboABateria, que recebe argumentos para
     * inicializar todos os campos da classe. O construtor chama o construtor da
     * classe ancestral repassando alguns argumentos, e inicializa um campo
     * desta classe.
     *
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     * @param e a energia inicial
     */
    public RoboABateria(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
    }
    
    public RoboABateria(){
    
    }
    
    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de
     * unidades na dire��o em que o rob� est�, e deduz o n�mero de passos da
     * energia que o rob� tem, considerando que a cada passo dez unidades de
     * energia s�o gastas. Consideramos que um rob� a bateria pode se movimentar
     * somente em oito dire��es, em intervalos de 45 graus, ou seja, nas
     * dire��es 0, 45, 90, 135, 180, 225, 270 e 315 graus - outros valores s�o
     * ignorados. Note que para os �ngulos 45, 135, 225 e 315 graus o rob�
     * modificar� as suas duas coordenadas. O m�todo n�o faz nada caso a energia
     * do rob� n�o seja suficiente para mov�-lo.
     *
     * @param passos o n�mero de "passos" para o rob�
     */
    @Override
    public void move(int passos) {
        double energiaASerGasta; // quanta energia ser� necess�ria
        short direcao = getDire��oAtual();
        if(direcao == 45 || direcao == 135 || direcao == 225 || direcao == 315){
            energiaASerGasta = passos * 14;
        }
        else{
            energiaASerGasta = passos * 10;
        }
        if (energiaASerGasta <= getEnergia()) // o rob� tem energia para se movimentar
        {
            switch (qualDire��oAtual()) // recuperamos a dire��o atual atrav�s deste m�todo
            {
                case 0:
                    moveX(+passos);
                    break; // passos positivos na dire��o X
                case 45:
                    moveX(+passos); // passos positivos na dire��o X e
                    moveY(+passos);
                    break; // passos positivos na dire��o Y
                case 90:
                    moveY(+passos);
                    break; // passos positivos na dire��o Y
                case 135:
                    moveY(+passos); // passos positivos na dire��o Y
                    moveX(-passos);
                    break; // passos negativos na dire��o X
                case 180:
                    moveX(-passos);
                    break; // passos negativos na dire��o X
                case 225:
                    moveX(-passos); // passos negativos na dire��o X e
                    moveY(-passos);
                    break; // passos negativos na dire��o Y
                case 270:
                    moveY(-passos);
                    break; // passos negativos na dire��o Y
                case 315:
                    moveY(-passos); // passos negativos na dire��o Y e
                    moveX(+passos);
                    break; // passos positivos na dire��o X
            } // fim do switch
            setEnergia(getEnergia() - energiaASerGasta); // deduz a energia gasta para o movimento
        } // fim do if
    }
    
    /**
     * O m�todo recarrega recebe como argumento uma quantidade de energia e recarrega essa
     * quantidade de energia no rob�, ou seja, soma � energia do rob� o valor passado
     * como argumento.
     * @param energia a energia a ser acrescentada no rob�
     */
    public void recarrega(long energia){
        this.setEnergia(this.getEnergia() + energia);    
    } // fim do m�todo recarrega
    
    /**
     * O m�todo podeSeMover recebe como argumento o n�mero de passos do rob� e verifica
     * se o mesmo conseguir� movimentar esses passos com a sua energia restante.
     * @param passos a quantidade de passos para a movimenta��o do rob�
     */
    public boolean podeSeMover(int passos){       
        return passos <= (int)this.energia;
    }
    
    /**
     * O m�todo sobrecarregado podeSeMover verifica se o rob� conseguir� movimentar 
     * um passo, considerando sua energia restante.
     */    
    public boolean podeSeMover(){       
        return 1 <= (int)this.energia;
    }
    
    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados. Este m�todo chama o m�todo
     * toString da classe ancestral e concatena ao resultado da chamada os
     * campos exclusivos desta classe.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado = resultado + "Energia do rob�:" + getEnergia();
        return resultado;
    } // fim do m�todo toString

    /**
     * @return the energia
     */
    public double getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(double energia) {
        this.energia = energia;
    }

} // fim da classe RoboABateria
