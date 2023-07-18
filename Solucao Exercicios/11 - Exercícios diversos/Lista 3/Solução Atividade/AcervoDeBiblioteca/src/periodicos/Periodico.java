package periodicos;

import classeAncestral.ItemDeBiblioteca;
import enums.StatusDoItem;
import java.util.Date;

/**
 *
 * @author Alisson Jaques
 */
public class Periodico extends ItemDeBiblioteca{
    
    private String editora;
    private String materiaPrincipal;
    private Date dataDePublicacao;
    
    public Periodico(String titulo, String codigoId,short ano, StatusDoItem status, String editora, Date dataDePublicacao, String materiaPrincipal){
        super(titulo,codigoId,ano,status);
        this.editora = editora;
        this.dataDePublicacao = dataDePublicacao;
        this.materiaPrincipal = materiaPrincipal;
    }
    
    public Periodico(){
    
    }   

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the materiaPrincipal
     */
    public String getMateriaPrincipal() {
        return materiaPrincipal;
    }

    /**
     * @param materiaPrincipal the materiaPrincipal to set
     */
    public void setMateriaPrincipal(String materiaPrincipal) {
        this.materiaPrincipal = materiaPrincipal;
    }

    /**
     * @return the dataDePublicacao
     */
    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    /**
     * @param dataDePublicacao the dataDePublicacao to set
     */
    public void setDataDePublicacao(Date dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "--------------------------------- Ficha Catalográfica ------------------------------\n";
        resultado += "Editora: " + editora;
        resultado += "\nMatéria Principal: " + materiaPrincipal;
        resultado += "\nData da publicação: " + dataDePublicacao + "\n";
        return resultado;
    }    
}
