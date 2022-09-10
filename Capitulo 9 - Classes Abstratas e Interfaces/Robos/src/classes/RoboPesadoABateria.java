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
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     * @param e a energia inicial
     * @param peso o peso do robô em quilos
     */
    public RoboPesadoABateria(String n, int px, int py, short d, long e, double peso) {
        super(n,px,py,d,e);
        this.peso = peso;
    }
    
    public RoboPesadoABateria(){
    
    }
    
     /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está, e deduz o número de passos da
     * energia que o robô tem, esse valor varia de acordo com a direção do robô,
     * se a direção for reta será o valor do peso vezes o número de passos, senão,
     * se a direção for na diagonal, será 1,4 vezes o valor do peso vezes o valor dos
     * passos. Consideramos que um robô a bateria pode se movimentar
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
            energiaASerGasta = 1.4*peso*passos;
        }
        else{
            energiaASerGasta = peso*passos;
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
            setEnergia(getEnergia()-energiaASerGasta); // deduz a energia gasta para o movimento
        } // fim do if
    }
}
