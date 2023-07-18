package classes;

/**
 *
 * @author Alisson
 */
public class RoboPesadoABateria extends RoboABateria{
    public double peso;
    
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
     * @param peso o peso do rob� em quilos
     */
    public RoboPesadoABateria(String n, int px, int py, short d, long e, double peso) {
        super(n,px,py,d,e);
        this.peso = peso;
    }
    
    public RoboPesadoABateria(){
    
    }
    
     /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de
     * unidades na dire��o em que o rob� est�, e deduz o n�mero de passos da
     * energia que o rob� tem, esse valor varia de acordo com a dire��o do rob�,
     * se a dire��o for reta ser� o valor do peso vezes o n�mero de passos, sen�o,
     * se a dire��o for na diagonal, ser� 1,4 vezes o valor do peso vezes o valor dos
     * passos. Consideramos que um rob� a bateria pode se movimentar
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
            energiaASerGasta = 1.4*peso*passos;
        }
        else{
            energiaASerGasta = peso*passos;
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
            setEnergia(getEnergia()-energiaASerGasta); // deduz a energia gasta para o movimento
        } // fim do if
    }
}
