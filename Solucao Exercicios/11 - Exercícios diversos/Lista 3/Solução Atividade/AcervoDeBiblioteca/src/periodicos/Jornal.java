package periodicos;

import enums.StatusDoItem;
import java.util.Date;

/**
 *
 * @author Alisson Jaques
 */
public class Jornal extends Revista{
    
    private String nomeDiretor;
    
    public Jornal(String titulo, String codigoId,short ano, StatusDoItem status,
            String editora, Date dataDePublicacao, String materialPricipal,
            int numeroDaRevista, short numeroDePaginas, String nomeDiretor){
        
        super(titulo,codigoId,ano,status,editora,dataDePublicacao,materialPricipal,
                numeroDaRevista,numeroDePaginas);
        this.nomeDiretor = nomeDiretor;
    }
    
    public Jornal(){
    
    }
    
    public void setNomeDiretor(String nomeDiretor){
        this.nomeDiretor = nomeDiretor;
    }
    
    public String getNomeDiretor(){
        return nomeDiretor;
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "Diretor: " + nomeDiretor +"\n";
        return resultado;    
    }    
}
