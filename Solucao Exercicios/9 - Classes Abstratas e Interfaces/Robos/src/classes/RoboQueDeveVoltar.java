package classes;

/**
 * A classe RoboQueDeveVoltar � um tipo de rob� com mem�ria que possui duas fun��es
 * diferentes de fazer o rob� retornar � sua posi��o inicial.
 * @author Alisson Jaques
 */
public class RoboQueDeveVoltar extends RoboComMemoria {

    /**
     * Declara��o dos campos da classe
     */
    private double energia;      // a energia que o rob� ainda possui
    private int posicaoXInicial; // a posi��o x inicial do rob�
    private int posicaoYInicial; // a posi��o y inicial do rob�
    
    /**
     * O construtor para a classe RoboQueDeveVoltar, que recebe argumentos para
     * inicializar todos os campos da classe. O construtor chama o construtor da
     * classe ancestral repassando alguns argumentos, e inicializa os outros campos
     * desta classe.
     *
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
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
     * Este m�toda faz o rob� voltar � sua posi��o inicial percorrendo a dist�ncia
     * entre o ponto inicial e final do rob�.
     */
    public void retorna�OrigemAtalho(){
        int distancia = (int)distanciaEntreDoisPontos(posicaoXInicial,posi��oXAtual,
                posicaoYInicial,posi��oYAtual); // calcula a dist�ncia inteira entre os dois pontos
        mudaDire��o((short)calculaAnguloReta(posicaoXInicial,posi��oXAtual, 
                posicaoYInicial,posi��oYAtual)); // muda a posi��o do rob�, fazendo este apontar para o ponto inicial
        move(distancia); // move o rob� at� a posi��o inicial
    }
    
    /**
     * O m�todo distanciaEntreDoisPontos retorna a dist�ncia entre o ponto final e inicial
     * do rob�.
     * 
     * @param p1x o valor da posici��o inicial x do rob�
     * @param p2x o valor da posici��o final x do rob�
     * @param p1y o valor da posici��o inicial y do rob�
     * @param p2y o valor da posici��o final y do rob�
     */
    public double distanciaEntreDoisPontos(int p1x, int p2x, int p1y, int p2y){
        return Math.sqrt(Math.pow((double)p1x-(double)p2x,2)
                +Math.pow((double)p1y-(double)p2y,2));
    }
    
    /**
     * O m�todo calculaAnguloReta retorna o �ngulo, formado pela reta que passa entre
     * o ponto final e inicial do rob�.
     * 
     * @param p1x o valor da posici��o inicial x do rob�
     * @param p2x o valor da posici��o final x do rob�
     * @param p1y o valor da posici��o inicial y do rob�
     * @param p2y o valor da posici��o final y do rob�
     */
    public double calculaAnguloReta(int p1x, int p2x, int p1y, int p2y){
        double tangente = (((double)p2y-(double)p1y)/(double)p2x-(double)p1x);
        return Math.atan(tangente);
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
        if (direcao == 45 || direcao == 135 || direcao == 225 || direcao == 315) {
            energiaASerGasta = passos * 14;
        } else {
            energiaASerGasta = passos * 10;
        }
        if (energiaASerGasta <= getEnergia()) // o rob� tem energia para se movimentar
        {
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
