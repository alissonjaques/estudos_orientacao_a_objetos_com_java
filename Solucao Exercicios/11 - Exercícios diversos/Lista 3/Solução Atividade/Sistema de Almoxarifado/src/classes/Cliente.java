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
public class Cliente extends Empresa{
    
    /**
     *
     * @param cnpj
     * @param razaoSocial
     * @param endereco
     * @param numeroDeContato
     */
    public Cliente(String cnpj, String razaoSocial, String endereco, String numeroDeContato){
        super(cnpj,razaoSocial,endereco,numeroDeContato);
    }
    
    /**
     *
     */
    public Cliente(){
    
    }
    
    /**
     *
     */
    public void fazerPedido(){
    
    
    }
    
    @Override
    public String toString(){
        return super.toString();    
    }
}
