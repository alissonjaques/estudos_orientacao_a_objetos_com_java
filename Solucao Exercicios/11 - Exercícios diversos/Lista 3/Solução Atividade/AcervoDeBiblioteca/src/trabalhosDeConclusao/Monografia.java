package trabalhosDeConclusao;

import enums.StatusDoItem;

public class Monografia extends TrabalhosDeConclusao{
    
    public Monografia(String titulo, String codigoId, short ano, 
            StatusDoItem status, String autor, String cidadeEstado, 
            short numeroDePaginas, double cm, String[] orientadores, 
            String universidade, String campos, String assunto, String palavraChave1,
            String palavraChave2, String cdd){
        super(titulo,codigoId,ano,status,autor,cidadeEstado,numeroDePaginas,cm,
                orientadores,universidade,campos,assunto,palavraChave1,palavraChave2,
                cdd,TrabalhosDeConclusao.MONOGRAFIA);    
    }
    
    public Monografia(){
    
    }
}