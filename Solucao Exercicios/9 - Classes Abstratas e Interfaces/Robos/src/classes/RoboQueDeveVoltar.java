package classes;

/**
 * A classe RoboQueDeveVoltar é um tipo de robô com memória que possui duas funções
 * diferentes de fazer o robô retornar à sua posição inicial.
 * @author Alisson Jaques
 */
public class RoboQueDeveVoltar extends RoboComMemoria {

    /**
     * Declaração dos campos da classe
     */
    private double energia;      // a energia que o robô ainda possui
    private int posicaoXInicial; // a posição x inicial do robô
    private int posicaoYInicial; // a posição y inicial do robô
    
    /**
     * O construtor para a classe RoboQueDeveVoltar, que recebe argumentos para
     * inicializar todos os campos da classe. O construtor chama o construtor da
     * classe ancestral repassando alguns argumentos, e inicializa os outros campos
     * desta classe.
     *
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     * @param e a energia inicial
     */
    public RoboQueDeveVoltar(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        posicaoXInicial = px;
        posicaoYInicial = py;
        energia = e;
    }
    
    /**
     * O construtor defaul para a classe RoboQueDeveVoltar
     */
    public RoboQueDeveVoltar() {

    }
    
    /**
     * Este métoda faz o robô voltar à sua posição inicial percorrendo a distância
     * entre o ponto inicial e final do robô.
     */
    public void retornaÀOrigemAtalho(){
        int distancia = (int)distanciaEntreDoisPontos(posicaoXInicial,posiçãoXAtual,
                posicaoYInicial,posiçãoYAtual); // calcula a distância inteira entre os dois pontos
        mudaDireção((short)calculaAnguloReta(posicaoXInicial,posiçãoXAtual, 
                posicaoYInicial,posiçãoYAtual)); // muda a posição do robô, fazendo este apontar para o ponto inicial
        move(distancia); // move o robô até a posição inicial
    }
    
    /**
     * O método distanciaEntreDoisPontos retorna a distância entre o ponto final e inicial
     * do robô.
     * 
     * @param p1x o valor da posicição inicial x do robô
     * @param p2x o valor da posicição final x do robô
     * @param p1y o valor da posicição inicial y do robô
     * @param p2y o valor da posicição final y do robô
     */
    public double distanciaEntreDoisPontos(int p1x, int p2x, int p1y, int p2y){
        return Math.sqrt(Math.pow((double)p1x-(double)p2x,2)
                +Math.pow((double)p1y-(double)p2y,2));
    }
    
    /**
     * O método calculaAnguloReta retorna o ângulo, formado pela reta que passa entre
     * o ponto final e inicial do robô.
     * 
     * @param p1x o valor da posicição inicial x do robô
     * @param p2x o valor da posicição final x do robô
     * @param p1y o valor da posicição inicial y do robô
     * @param p2y o valor da posicição final y do robô
     */
    public double calculaAnguloReta(int p1x, int p2x, int p1y, int p2y){
        double tangente = (((double)p2y-(double)p1y)/(double)p2x-(double)p1x);
        return Math.atan(tangente);
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
        if (direcao == 45 || direcao == 135 || direcao == 225 || direcao == 315) {
            energiaASerGasta = passos * 14;
        } else {
            energiaASerGasta = passos * 10;
        }
        if (energiaASerGasta <= getEnergia()) // o robô tem energia para se movimentar
        {
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
    }

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

}
