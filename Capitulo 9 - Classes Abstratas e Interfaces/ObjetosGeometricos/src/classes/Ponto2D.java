package classes;

/**
 * A classe Ponto2D, que encapsula um ponto no espa�o cartesiano de duas
 * dimens�es.
 */
public class Ponto2D{ // declara��o da classe
    /**
     * Declara��o dos campos da classe
     */
    private double x, y, d; // as coordenadas do ponto no espa�o bidimensional

    /**
     * O construtor para a classe Ponto2D que rebece dois argumentos flutuantes
     * e inicializa os campos da classe com os mesmos.
     *
     * @param _x um n�mero flutuante que representa a coordenada x do ponto
     * @param _y um n�mero flutuante que representa a coordenada y do ponto
     *
     *
     */
    public Ponto2D(double _x, double _y){
        x = _x;
        y = _y;
    } // fim do construtor com todos os argumentos

    /**
     * O construtor para a classe Ponto2D que recebe um �nico argumento,
     * referente � ordena x, e inicializa a abscissa com esse valor. A ordenada
     * � inicializa com o valor default 0.
     *
     * @param _x x um n�mero flutuante que representa a coordenada x do ponto
     *
     */
    public Ponto2D(double _x){
        x = _x;
        y = 0.0;
    } // fim do construtor com apenas um argumento

    /**
     * O construtor sobrecarregado para a classe Ponto2D, que recebe como
     * argumento uma inst�ncia da pr�pria classe Ponto2D. Ele inicializa os
     * campos das coordenadas copiando os correspondentes da int�ncia passada
     * como argumento.
     *
     * @param outroPonto2D uma outra inst�ncia da classe Ponto2D
     */
    public Ponto2D(Ponto2D outroPonto2D){
        x = outroPonto2D.retornaX();
        y = outroPonto2D.retornaY();
    } // fim do construtor que recebe outro ponto como argumento

    /**
     * O construtor para a classe Ponto2D que n�o recebe nenhum argumento e
     * inicializa os campos da classe com valores default (0 e 0), ou seja, o
     * ponto representa a origem do plano cartesiano ortogonal. A inicializa��o
     * � feita atrav�s de uma chamada ao construtor com todos os argumentos.
     *
     *
     */
    public Ponto2D(){
        this(0.0, 0.0);
    } // fim do construtor default

    /**
     * O m�todo �Igual recebe uma inst�ncia da pr�pria classe Ponto2D como
     * argumento e verifica se as coordenadas encapsuladas na classe e na
     * inst�ncia que foi passada s�o exatamente iguais, e retorna o valor
     * booleano true se forem.
     *
     * @param outroPonto2D outra inst�ncia da pr�pria classe Ponto2D
     * @return true se as coordenadas encapsuladas forem exatamente iguais �s
     * encapsuladas na inst�ncia passada como argumento, false caso contr�rio
     */
    public boolean �Igual(Ponto2D outroPonto2D){
        return (getX() == outroPonto2D.getX())&&(getY() == outroPonto2D.getY());
    } // fim do m�todo �Igual

    /**
     * O m�todo origem retorna uma nova inst�ncia da classe Ponto2D, que cont�m
     * as coordenadas (0,0) (origem das coordenadas). Esta inst�ncia � criada
     * por este m�todo, e pode ser usada diretamente por aplica��es ou classes
     * que executem este m�todo sem necessidade de usar a palavra-chave new.
     * Este m�todo � est�tico e pode ser acessado por outras classes sem a
     * necessidade de criar inst�ncias para a classe Ponto2D.
     *
     * @return uma nova inst�ncia da classe Ponto2D representando a coordenada
     * (0,0)
     */
    public static Ponto2D origem(){
        Ponto2D tempor�rio = new Ponto2D(); // a inicializa��o da inst�ncia � feita aqui
        return tempor�rio; // retornamos a refer�ncia inicializada (0,0)
    } // fim do m�todo origem

    /**
     * O m�todo criaRevertido retorna uma nova inst�ncia da classe Ponto2D, que
     * cont�m as coordenadas com os valores inversos (-x,-y) em rela��o ao
     * objeto atual (x,y)
     *
     * @return revertido uma nova inst�ncia da classe Ponto2D com os campos
     * inversos em rela��o ao objeto atual
     *
     *
     */
    public Ponto2D criaRevertido(){
        Ponto2D revertido = new Ponto2D(-getX(), -getY());//declaramos uma inst�ncia auxiliar
        return revertido;//retornamos a refer�ncia inicializada
    }// fim do m�todo criaRevertido

    /**
     * O m�todo clona retorna uma nova inst�ncia da classe Ponto2D, que cont�m
     * as mesmas coordenadas encapsuladas na classe, ou seja, quando este m�todo
     * for executado a partir de uma inst�ncia desta classe, ele retornar� uma
     * nova inst�ncia com os mesmos valores encapsulados.
     *
     * @return uma nova inst�ncia da classe Ponto2D contendo os valores
     * encapsulados
     */
    public Ponto2D clona(){
        Ponto2D tempor�rio = new Ponto2D(getX(), getY()); // a inicializa��o da inst�ncia � feita aqui
        return tempor�rio; // retornamos a refer�ncia inicializada
    } // fim do m�todo clona

    /**
     * O m�todo temEixoComum possui como argumento outra inst�ncia da classe
     * Ponto2D e analisa se o ponto passado como refer�ncia e o encapsulado
     * possuem algum eixo comum.
     *
     * @param outroPonto2D uma inst�ncia da pr�pria classe Ponto2D
     * @return true se pontos comparados tiverem eixo comum false caso contr�rio
     */
    public boolean temEixoComum(Ponto2D outroPonto2D){
        return (getX() == outroPonto2D.getX()) || (getY() == outroPonto2D.getY());
    }// fim do m�todo temEixoComum

    /**
     * O m�todo dist�ncia calcula a dist�ncia euclidiana entre o ponto
     * encapsulado e o ponto passado como argumento(outra inst�ncia da classe
     * Ponto2D).
     *
     * @param outroPonto2D uma inst�ncia da pr�pria classe Ponto2D
     * @return d a dist�ncia euclidiana entre o ponto encapsulado e o passado
     * como argumento.
     */
    public double distancia(Ponto2D outroPonto2D){
        setD(Math.sqrt(((getX() - outroPonto2D.getX()) * (getX() - outroPonto2D.getX())) + ((getY() - outroPonto2D.getY()) * (getY() - outroPonto2D.getY())))); // d� = ((x1-x2)� + (y1-y2)�)
        return getD();
    } // fim do m�todo distancia

    /**
     * O m�todo dist�nciaDaOrigem n�o possui argumentos, ele retorna a dist�ncia
     * entre o ponto encapsulado e a origem do sistema cartesiano bidimensional.
     *
     * @return distancia(origemDoPlano) um valor flutuante que representa a
     * dist�ncia do ponto encapsulado da origem do sistema de coordenadas
     * cartesiano
     */
    public double distanciaDaOrigem(){
        Ponto2D origemDoPlano = origem(); //Criamos uma refer�ncia a uma inst�ncia da classe Ponto2D e fazemos ela apontar para uma referencia criada pelo m�todo origem (uma refer�ncia
        //cujos campos s�o a origem do eixos coordenados)
        return distancia(origemDoPlano); //retornamos a dist�ncia entre o ponto encapsulado e a origem chamando o m�todo dist�ncia da pr�pria classe 	
    }//fim do m�todo distanciaDaOrigem

    /**
     * O m�todo �Pr�ximo recebe como argumento uma inst�ncia da pr�pria classe
     * Ponto2D e um valor flutuante que representa um limiar e verifica se a
     * dist�ncia entre o ponto encapsulado e o ponto passado como argumento �
     * menor do que o limiar informado.
     *
     * @param outroPonto2D uma inst�ncia da pr�pria classe Ponto2D
     * @param limiar um n�mero real que representa um limiar
     * @return true se a dist�ncia entre o ponto encapsulado e o ponto passado
     * como argumento for menor do que o limiar false caso contr�rio
     */
    public boolean �Pr�ximo(Ponto2D outroPonto2D, double limiar){
        return distancia(outroPonto2D) < limiar;
    } //fim do m�todo �Pr�ximo

    /**
     * O m�todo modifica recebe como argumentos dois n�meros flutuantes e
     * atribu� esses valores aos campos da classe, sendo o primeiro atribu�do �
     * coordenada x e o segundo � coordenada y.
     *
     * @param _x um valor flutuante que representa a coordenada x do ponto no
     * plano
     * @param _y um valor flutuante que representa a coordenada y do ponto no
     * plano
     */
    public void modifica(double _x, double _y){
        setX(_x);
        setY(_y);
    } // fim do m�todo modifica com todos os argumentos

    /**
     * O m�todo modifica sobrecarregado, que recebe um �nico valor flutuante e
     * atribu� o mesmo � coordenada x do ponto no plano.
     *
     * @param _x um valor flutuante que representa a coordenada x do ponto no
     * plano
     */
    public void modifica(double _x){
        modificaX(_x);
    } // fim do m�todo modifica com apenas um argumento flutuante

    /**
     * O m�doto modifica, que n�o possui nenhum argumento e nenhum comando em
     * seu interior. Quando chamado simplesmente n�o modifica os campos da
     * classe.
     */
    public void modifica(){
    } // fim do m�todo modifica sem argumentos

    /**
     * O m�todo modificaX recebe como argumento um valor flutuante e o atribu� �
     * coordenada x do ponto encapsulado.
     *
     * @param _x um valor flutuante que representa a coordenada x do ponto no
     * plano
     */
    public void modificaX(double _x){
        setX(_x);
    } // fim do m�todo modificaX com todos os argumentos

    /**
     * O m�todo modificaX sem argumentos e sem comandos em seu interior. Que n�o
     * modifica o campo x, quando � chamado.
     */
    public void modificaX(){
    } // fim do m�todo modificaX sem argumentos

    /**
     * O m�todo modificaY recebe como argumento um valor flutuante e o atribu� �
     * coordenada y do ponto encapsulado.
     *
     * @param _y um valor flutuante que representa a coordenada y do ponto no
     * plano
     */
    public void modificaY(double _y){
        setY(_y);
    } // fim do m�todo modificaY com todos os argumentos

    /**
     * O m�todo modificaY sem argumentos e sem comandos em seu interior. Que n�o
     * modifica o campo y, quando � chamado.
     */
    public void modificaY(){
    } // fim do m�todo modificaY sem argumentos

    /**
     * O m�todo retornaY n�o possui argumentos e retorna o valor guardado no
     * campo y do objeto encapsulado.
     *
     * @return y um valor flutuante correspondente � coordenada y do ponto
     * encapsulado
     */
    public double retornaY(){
        return getY();
    } // fim do m�todo retornaY

    /**
     * O m�todo retornaX n�o possui argumentos e retorna o valor guardado no
     * campo x do objeto encapsulado.
     *
     * @return x um valor flutuante correspondente � coordenada x do ponto
     * encapsulado
     */
    public double retornaX(){
        return getX();
    } // fim do m�todo retornaX

    /**
     * O m�todo est�AcimaDe recebe como argumento uma outra inst�ncia da classe
     * Ponto2D e retorna true se o ponto encapsulado estiver acima do ponto
     * passado como argumento.
     *
     * @param outroPonto2D uma outra inst�ncia da classe Ponto2D
     * @return true se o ponto encapsulado estiver acima do ponto passado como
     * argumento, false caso contr�rio
     */
    public boolean est�AcimaDe(Ponto2D outroPonto2D){
        return (getY() > outroPonto2D.getY());
    } // fim do m�todo est�AcimaDe

    /**
     * O m�todo est�AbaixoDe recebe como argumento uma outra inst�ncia da classe
     * Ponto2D e retorna true se o ponto encapsulado estiver abaixo do ponto
     * passado como argumento.
     *
     * @param outroPonto2D uma outra inst�ncia da classe Ponto2D
     * @return true se o ponto encapsulado estiver abaixo do ponto passado como
     * argumento, false caso contr�rio
     */
    public boolean est�AbaixoDe(Ponto2D outroPonto2D){
        return (getY() < outroPonto2D.getY());
    } // fim do m�todo est�AbaixoDe

    /**
     * O m�todo est��EsquerdaDe recebe como argumento uma outra inst�ncia da
     * classe Ponto2D e retorna true se o ponto encapsulado estiver � esquerda
     * do ponto passado como argumento.
     *
     * @param outroPonto2D uma outra inst�ncia da classe Ponto2D
     * @return true se o ponto encapsulado estiver � esquerda do ponto passado
     * como argumento, false caso contr�rio
     */
    public boolean est��EsquerdaDe(Ponto2D outroPonto2D){
        return (getX() < outroPonto2D.getX());
    } // fim do m�todo est��EsquerdaDe

    /**
     * O m�todo est��DireitaDe recebe como argumento uma outra inst�ncia da
     * classe Ponto2D e retorna true se o ponto encapsulado estiver � direita do
     * ponto passado como argumento.
     *
     * @param outroPonto2D uma outra inst�ncia da classe Ponto2D
     * @return true se o ponto encapsulado estiver � direita do ponto passado
     * como argumento, false caso contr�rio
     */
    public boolean est��DireitaDe(Ponto2D outroPonto2D){
        return (getX() > outroPonto2D.getX());
    } // fim do m�todo est��DireitaDe

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
    
    /**
     * O m�todo toString � um m�todo "m�gico" que n�o recebe argumentos, e
     * retorna uma String contendo os valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados como (x,y)
     */
    @Override
    public String toString() {
        String resultado = "(" + getX() + "," + getY() + ")";
        return resultado;
    } // fim do m�todo toString

} // fim da classe Ponto2D