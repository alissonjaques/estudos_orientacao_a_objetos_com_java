/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * A peça corresponde a um produto qualquer.
 * @author Alisson Jaques
 * @author Gustavo Costa
 */
public class Peca {
    
    private long codigoDeBarrasUpc;
    private String descricao;
    static private int codigo = 0;
    private int codigoDoProduto;
    
    /**
     *
     * @param codigoDeBarrasUpc
     * @param descricao
     */
    public Peca(Long codigoDeBarrasUpc, String descricao){
        codigo++;
        this.codigoDoProduto = codigo;
        this.codigoDeBarrasUpc = codigoDeBarrasUpc;
        this.descricao = descricao;
    }
    
    /**
     *
     */
    public Peca(){
    
    }

    /**
     * @return the codigoDeBarrasUpc
     */
    public long getCodigoDeBarrasUpc() {
        return codigoDeBarrasUpc;
    }

    /**
     * @param codigoDeBarrasUpc the codigoDeBarrasUpc to set
     */
    public void setCodigoDeBarrasUpc(long codigoDeBarrasUpc) {
        this.codigoDeBarrasUpc = codigoDeBarrasUpc;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigo
     */
    public static int getCodigo() {
        return codigo;
    }

    /**
     * @param aCodigo the codigo to set
     */
    public static void setCodigo(int aCodigo) {
        codigo = aCodigo;
    }

    /**
     * @return the codigoDoProduto
     */
    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    /**
     * @param codigoDoProduto the codigoDoProduto to set
     */
    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }
    
    /**
     *
     */
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Código do Produto: " + getCodigoDoProduto();
        resultado += "\nCódigo de barras: " + getCodigoDeBarrasUpc();
        resultado += "\nDescrição do Produto: " + getDescricao();
        return resultado;
    }
}
