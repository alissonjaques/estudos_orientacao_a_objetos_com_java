package classes;

/**
 * A classe Ponto3D possui campos e metodos que representam um ponto no espa�o
 * tridimensional. Ela herda da classe Ponto2D sendo uma especializa��o desta.
 * 
 * @author Alisson Jaques
 */
public class Ponto3D extends Ponto2D{ // declara a classe
    /**
     * Campos especificos da classe
     */
    private double z;
    
    /**
     * O construtor completo da classe Ponto3D que recebe uma inst�ncia da classe
     * Ponto2D e um n�mero flutuante, inicializandos os campos da classe com os 
     * mesmos.
     * 
     * @param xy a coordenada de um ponto no plano cartesiano ortogonal
     * @param z um n�mero flutuante que representa a coordenada da terceira dimens�o
     */
    public Ponto3D(Ponto2D xy, double z){
        super(xy); /* delega a inializa��o dos campos herdados para a super classe */
        this.z = z;
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe Ponto3D que recebe tr�s n�meros flutuantes
     * como argumentos e inicializa os campos da classe com os mesmos.
     * 
     * @param x a coordenada x do ponto
     * @param y a coordenada y do ponto
     * @param z a coordenada z do ponto
     */
    public Ponto3D(double x, double y, double z){
        super(new Ponto2D(x,y)); /* delega a inicializa��o dos campos herdados ao construtor da super classe */
        this.z = z;
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor sobrecarregado da classe Ponto3D que recebe uma inst�ncia da
     * classe Ponto2D e inicializa todos os seus campos, a coordenada z � inicializada
     * com o valor default 0.
     * 
     * @param xy um ponto no plano cartesiano
     */
    public Ponto3D(Ponto2D xy){
        super(xy);
        this.z = 0.0;
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor sobrecarregado da classe Ponto3D que recebe como argumento um
     * valor flutuante que representa a coordenada z do ponto e inicializa todos os campos
     * da classe, as coordenadas x e y s�o inicializadas com valores default 0;
     * 
     * @param z a coordenada z do ponto
     */
    public Ponto3D(double z){
        super(new Ponto2D());
        this.z = z;
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor default para a classe Ponto3D que representa a origem do 
     * sistema cartesiano de 3 dimens�es.
     */
    public Ponto3D(){
        super(new Ponto2D());
        z = 0.0;
    } // fim do construtor default
    
    /**
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(double z) {
        this.z = z;
    }
    
    /**
     * O m�todo toString n�o possui argumentos e retorna os campos da classe formatados.
     * 
     * @return os campos da classe formatados
     */
    @Override
    public String toString(){
        String resultado = super.toString().replaceAll("\\)",",");
        resultado += getZ() + ")";
        return resultado;
    } // fim do m�todo toString
} // fim da classe Ponto3D