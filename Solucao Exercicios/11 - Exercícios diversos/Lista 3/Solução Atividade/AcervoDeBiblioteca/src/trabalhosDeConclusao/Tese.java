package trabalhosDeConclusao;

import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Tese extends TrabalhosDeConclusao{
    
    public Tese(String titulo, String codigoId, short ano, 
            StatusDoItem status, String autor, String cidadeEstado, 
            short numeroDePaginas, double cm, String[] orientadores, 
            String universidade, String campos, String assunto, String palavraChave1,
            String palavraChave2, String cdd){
        super(titulo,codigoId,ano,status,autor,cidadeEstado,numeroDePaginas,cm,
                orientadores,universidade,campos,assunto,palavraChave1,palavraChave2,
                cdd,TrabalhosDeConclusao.TESE);    
    }
    
    public Tese(){
    
    }
}
