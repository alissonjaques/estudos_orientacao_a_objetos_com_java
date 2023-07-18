package trabalhosDeConclusao;

import enums.StatusDoItem;

/**
 *
 * @author Alisson Jaques
 */
public class Dissertacao extends TrabalhosDeConclusao{
    
    public Dissertacao(String titulo, String codigoId, short ano, 
            StatusDoItem status, String autor, String cidadeEstado, 
            short numeroDePaginas, double cm, String[] orientadores, 
            String universidade, String campos, String assunto, String palavraChave1,
            String palavraChave2, String cdd){
        super(titulo,codigoId,ano,status,autor,cidadeEstado,numeroDePaginas,cm,
                orientadores,universidade,campos,assunto,palavraChave1,palavraChave2,
                cdd,TrabalhosDeConclusao.DISSERTACAO);    
    }
    
    public Dissertacao(){
    
    }
}
