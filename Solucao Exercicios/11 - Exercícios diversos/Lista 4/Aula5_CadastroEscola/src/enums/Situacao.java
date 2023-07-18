/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author ericd
 */
public enum Situacao {
    
    APROVADO("Aprovado"), REPROVADO("Reprovado"), EM_EXAME("Em exame");
    
    private final String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
   
}
