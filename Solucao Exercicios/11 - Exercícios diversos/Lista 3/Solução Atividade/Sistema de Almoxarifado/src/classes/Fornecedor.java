/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * @author Alisson Jaques
 * @author Gustavo Costa
 */
public class Fornecedor extends Empresa{
    
    /**
     *
     * @param cnpj
     * @param razaoSocial
     * @param endereco
     * @param numeroDeContato
     */
    public Fornecedor(String cnpj, String razaoSocial, String endereco, String numeroDeContato){
        super(cnpj,razaoSocial,endereco,numeroDeContato);
    }
    
    /**
     *
     */
    public void fazerEntrega(){
    
    }
    
    @Override
    public String toString(){
        return super.toString();    
    }
}
