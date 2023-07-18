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
public enum Serie {
    
    PRIMEIRO("1° Ano"), SEGUNDO("2° Ano"), TERCEIRO("3° Ano");
    
    private final String descricao;

    private Serie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
   
}
