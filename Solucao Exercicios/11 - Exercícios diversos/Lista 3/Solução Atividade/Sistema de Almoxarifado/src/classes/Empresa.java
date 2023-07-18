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
public class Empresa {
    
    private String cnpj;
    private String razaoSocial;
    private String endereco;
    private String numeroDeContato;
    
    /**
     * @param cnpj
     * @param razaoSocial
     * @param endereco
     * @param numeroDeContato
     */
    public Empresa(String cnpj, String razaoSocial, String endereco, String numeroDeContato){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.numeroDeContato = numeroDeContato;
    }
    
    /**
     *
     */
    public Empresa(){
    
    }
    
    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numeroDeContato
     */
    public String getNumeroDeContato() {
        return numeroDeContato;
    }

    /**
     * @param numeroDeContato the numeroDeContato to set
     */
    public void setNumeroDeContato(String numeroDeContato) {
        this.numeroDeContato = numeroDeContato;
    }
    
    /**
     *
     */
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Razão Social: " + getRazaoSocial();
        resultado += "\nCNPJ: " + getCnpj();
        resultado += "\nEndereço: " + getEndereco();
        resultado += "\nNumero de Contato: " + getNumeroDeContato();
        return resultado;
    }    
}
