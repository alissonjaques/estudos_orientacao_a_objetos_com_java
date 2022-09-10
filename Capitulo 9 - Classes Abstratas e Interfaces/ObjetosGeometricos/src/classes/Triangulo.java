package classes;

import interfaces.ObjetosGeometricos;

/**
 *
 * @author Alisson Jaques
 */
public class Triangulo implements ObjetosGeometricos {

    /*
     * Declaração dos campos da classe 
     */
    private Ponto2D A;
    private Ponto2D B;
    private Ponto2D C;

    /**
     * O construtor completo da classe Retangulo que rebece como argumento três
     * ponstos, que representam os pontos cartesianos do triângulo, e
     * inicializa todos os campos da classe.
     *
     * @param A o ponta A do triângulo
     * @param B o ponta B do triângulo
     * @param C o ponta C do triângulo
     */
    public Triangulo(Ponto2D A, Ponto2D B, Ponto2D C) {
        this.A = A;
        this.B = B;
        this.C = C;
    } // fim do construtor completo

    /**
     * O construtor default para a classe Triangulo que não recebe nenhum
     * argumento e inicializa os campos da classe com valores default.
     */
    public Triangulo() {

    } // fim do construtor default 
    
    /**
     * O método centro retorna o ponto bidimensional que representa o baricentro
     * do triângulo encapsulado.
     * @return o ponto que representa o baricentro do triângulo
     */
    @Override
    public Ponto2D centro() {
        double Xg = (getA().getX() + getB().getX() + getC().getX())/3;
        double Yg = (getA().getY() + getB().getY() + getC().getY())/3;
        return new Ponto2D(Xg,Yg);
    }
    
    /**
     * O método calculaArea calcula e retorna a área do triângulo.
     * @return a área do triângulo
     */
    @Override
    public double calculaÁrea() {
        return Math.sqrt(getS()*(getS()-getLadoAB())*(getS()-getLadoAC())*(getS()-getLadoBC()));
    }
    
    /**
     * O método clona retona uma nova instância da classe Triângulo com os mesmos
     * dados da intância atual.
     * @return uma nova instância do triângulo atual
     */
    @Override
    public ObjetosGeometricos clona() {
        return new Triangulo(getA(),getB(),getC());
    }
    
    /**
     * O método calculaPerímetro retorna o perímetro do triângulo encapsulado.
     * @return o perímetro do triângulo
     */
    @Override
    public double calculaPerímetro() {
        return getLadoAB() + getLadoBC() + getLadoAC();
    }
    
    /**
     * O método getS retorna o semiperímetro do triângulo.
     * @return o semiperímetro do triângulo
     */
    public double getS(){
        return calculaPerímetro()/2;
    }
    
    /**
     * @return a medida do lado AB do triângulo
     */
    public double getLadoAB(){
        return Math.sqrt(Math.pow(getA().getX()-getB().getX(),2)+Math.pow(getA().getY()-getB().getY(),2));
    }
    
    /**
     * @return a medida do lado BC do triângulo 
     */
    public double getLadoBC(){
        return Math.sqrt(Math.pow(getB().getX()-getC().getX(),2)+Math.pow(getB().getY()-getC().getY(),2));
    }
    
    /**
     * @return a medida do lado AC do triângulo
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
