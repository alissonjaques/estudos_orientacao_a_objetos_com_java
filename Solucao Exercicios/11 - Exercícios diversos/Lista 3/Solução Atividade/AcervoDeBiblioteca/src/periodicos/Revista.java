package periodicos;

import enums.StatusDoItem;
import java.util.Date;

/**
 *
 * @author Alisson Jaques
 */
public class Revista extends Periodico{
    
    private int numeroDaRevista;
    private short numeroDePaginas;
    
    public Revista(String titulo, String codigoId,short ano, StatusDoItem status,
            String editora, Date dataDePublicacao, String materialPricipal,
            int numeroDaRevista, short numeroDePaginas){
        super(titulo,codigoId,ano,status,editora,dataDePublicacao,materialPricipal);
        this.numeroDaRevista = numeroDaRevista;
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public Revista(){
    
    }

    /**
     * @return the numeroDaRevista
     */
    public int getNumeroDaRevista() {
        return numeroDaRevista;
    }

    /**
     * @param numeroDaRevista the numeroDaRevista to set
     */
    public void setNumeroDaRevista(int numeroDaRevista) {
        this.numeroDaRevista = numeroDaRevista;
    }
        
    /**
     * @return the numeroDePaginas
     */
    public short getNumeroDePaginas() {
        return numeroDePaginas;
    }

    /**
     * @param numeroDePaginas the numeroDePaginas to set
     */
    public void setNumeroDePaginas(short numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "Número da revista: " + numeroDaRevista;
        resultado += "\nNúmero de páginas: " + numeroDePaginas + "\n";
        return resultado;
    }
}
