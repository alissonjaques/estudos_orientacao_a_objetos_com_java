package classes;

import interfaces.ObjetosGeometricos;

/**
 *
 * @author Alisson Jaques
 */
public class Triangulo implements ObjetosGeometricos {

    /*
     * Declara��o dos campos da classe 
     */
    private Ponto2D A;
    private Ponto2D B;
    private Ponto2D C;

    /**
     * O construtor completo da classe Retangulo que rebece como argumento tr�s
     * ponstos, que representam os pontos cartesianos do tri�ngulo, e
     * inicializa todos os campos da classe.
     *
     * @param A o ponta A do tri�ngulo
     * @param B o ponta B do tri�ngulo
     * @param C o ponta C do tri�ngulo
     */
    public Triangulo(Ponto2D A, Ponto2D B, Ponto2D C) {
        this.A = A;
        this.B = B;
        this.C = C;
    } // fim do construtor completo

    /**
     * O construtor default para a classe Triangulo que n�o recebe nenhum
     * argumento e inicializa os campos da classe com valores default.
     */
    public Triangulo() {

    } // fim do construtor default 
    
    /**
     * O m�todo centro retorna o ponto bidimensional que representa o baricentro
     * do tri�ngulo encapsulado.
     * @return o ponto que representa o baricentro do tri�ngulo
     */
    @Override
    public Ponto2D centro() {
        double Xg = (getA().getX() + getB().getX() + getC().getX())/3;
        double Yg = (getA().getY() + getB().getY() + getC().getY())/3;
        return new Ponto2D(Xg,Yg);
    }
    
    /**
     * O m�todo calculaArea calcula e retorna a �rea do tri�ngulo.
     * @return a �rea do tri�ngulo
     */
    @Override
    public double calcula�rea() {
        return Math.sqrt(getS()*(getS()-getLadoAB())*(getS()-getLadoAC())*(getS()-getLadoBC()));
    }
    
    /**
     * O m�todo clona retona uma nova inst�ncia da classe Tri�ngulo com os mesmos
     * dados da int�ncia atual.
     * @return uma nova inst�ncia do tri�ngulo atual
     */
    @Override
    public ObjetosGeometricos clona() {
        return new Triangulo(getA(),getB(),getC());
    }
    
    /**
     * O m�todo calculaPer�metro retorna o per�metro do tri�ngulo encapsulado.
     * @return o per�metro do tri�ngulo
     */
    @Override
    public double calculaPer�metro() {
        return getLadoAB() + getLadoBC() + getLadoAC();
    }
    
    /**
     * O m�todo getS retorna o semiper�metro do tri�ngulo.
     * @return o semiper�metro do tri�ngulo
     */
    public double getS(){
        return calculaPer�metro()/2;
    }
    
    /**
     * @return a medida do lado AB do tri�ngulo
     */
    public double getLadoAB(){
        return Math.sqrt(Math.pow(getA().getX()-getB().getX(),2)+Math.pow(getA().getY()-getB().getY(),2));
    }
    
    /**
     * @return a medida do lado BC do tri�ngulo 
     */
    public double getLadoBC(){
        return Math.sqrt(Math.pow(getB().getX()-getC().getX(),2)+Math.pow(getB().getY()-getC().getY(),2));
    }
    
    /**
     * @return a medida do lado AC do tri�ngulo
     */
    public double getLadoAC(){
        return Math.sqrt(Math.pow(getA().getX()-getC().getX(),2)+Math.pow(getA().getY()-getC().getY(),2));
    }  

    /**
     * @return the A
     */
    public Ponto2D getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(Ponto2D A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public Ponto2D getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(Ponto2D B) {
        this.B = B;
    }

    /**
     * @return the C
     */
    public Ponto2D getC() {
        return C;
    }

    /**
     * @param C the C to set
     */
    public void setC(Ponto2D C) {
        this.C = C;
    }
}
