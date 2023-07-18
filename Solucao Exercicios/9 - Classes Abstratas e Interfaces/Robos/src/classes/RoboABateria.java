package classes;

/**
 * A classe RoboABateria, que herda da classe RoboAbstrato e que representa um
 * robô que consome energia com seus movimentos. Esta classe herda todos os
 * métodos não-abstratos da classe RoboAbstrato exceto o construtor. Esta classe
 * também implementa o método move, que foi declarado como sendo abstrato na
 * classe ancestral. A classe contém um campo adicional para indicar quantos
 * passos o robô ainda pode dar.
 */
class RoboABateria extends RoboAbstrato // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    private double energia; // a energia que o robô ainda possui

    /**
     * O construtor para a classe RoboABateria, que recebe argumentos para
     * inicializar todos os campos da classe. O construtor chama o construtor da
     * classe ancestral repassando alguns argumentos, e inicializa um campo
     * desta classe.
     *
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     * @param e a energia inicial
     */
    public RoboABateria(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
    }
    
    public RoboABateria(){
    
    }
    
    /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está, e deduz o número de passos da
     * energia que o robô tem, considerando que a cada passo dez unidades de
     * energia são gastas. Consideramos que um robô a bateria pode se movimentar
     * somente em oito direções, em intervalos de 45 graus, ou seja, nas
     * direções 0, 45, 90, 135, 180, 225, 270 e 315 graus - outros valores são
     * ignorados. Note que para os ângulos 45, 135, 225 e 315 graus o robô
     * modificará as suas duas coordenadas. O método não faz nada caso a energia
     * do robô não seja suficiente para movê-lo.
     *
     * @param passos o número de "passos" para o robô
     */
    @Override
    public void move(int passos) {
        double energiaASerGasta; // quanta energia será necessária
        short direcao = getDireçãoAtual();
        if(direcao == 45 || direcao == 135 || direcao == 225 || direcao == 315){
            energiaASerGasta = passos * 14;
        }
        else{
            energiaASerGasta = passos * 10;
        }
        if (energiaASerGasta <= getEnergia()) // o robô tem energia para se movimentar
        {
            switch (qualDireçãoAtual()) // recuperamos a direção atual através deste método
            {
                case 0:
                    moveX(+passos);
                    break; // passos positivos na direção X
                case 45:
                    moveX(+passos); // passos positivos na direção X e
                    moveY(+passos);
                    break; // passos positivos na direção Y
                case 90:
                    moveY(+passos);
                    break; // passos positivos na direção Y
                case 135:
                    moveY(+passos); // passos positivos na direção Y
                    moveX(-passos);
                    break; // passos negativos na direção X
                case 180:
                    moveX(-passos);
                    break; // passos negativos na direção X
                case 225:
                    moveX(-passos); // passos negativos na direção X e
                    moveY(-passos);
                    break; // passos negativos na direção Y
                case 270:
                    moveY(-passos);
                    break; // passos negativos na direção Y
                case 315:
                    moveY(-passos); // passos negativos na direção Y e
                    moveX(+passos);
                    break; // passos positivos na direção X
            } // fim do switch
            setEnergia(getEnergia() - energiaASerGasta); // deduz a energia gasta para o movimento
        } // fim do if
    }
    
    /**
     * O método recarrega recebe como argumento uma quantidade de energia e recarrega essa
     * quantidade de energia no robô, ou seja, soma à energia do robô o valor passado
     * como argumento.
     * @param energia a energia a ser acrescentada no robô
     */
    public void recarrega(long energia){
        this.setEnergia(this.getEnergia() + energia);    
    } // fim do método recarrega
    
    /**
     * O método podeSeMover recebe como argumento o número de passos do robô e verifica
     * se o mesmo conseguirá movimentar esses passos com a sua energia restante.
     * @param passos a quantidade de passos para a movimentação do robô
     */
    public boolean podeSeMover(int passos){       
        return passos <= (int)this.energia;
    }
    
    /**
     * O método sobrecarregado podeSeMover verifica se o robô conseguirá movimentar 
     * um passo, considerando sua energia restante.
     */    
    public boolean podeSeMover(){       
        return 1 <= (int)this.energia;
    }
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados. Este método chama o método
     * toString da classe ancestral e concatena ao resultado da chamada os
     * campos exclusivos desta classe.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado = resultado + "Energia do robô:" + getEnergia();
        return resultado;
    } // fim do método toString

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
