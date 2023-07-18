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
public enum Titulacao {
    
    GRADUADO("Graduado"), ESPECIALISTA("Especialista"), MESTRE("Mestre"), DOUTOR("Doutor");
    
    private final String descricao;

    private Titulacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
