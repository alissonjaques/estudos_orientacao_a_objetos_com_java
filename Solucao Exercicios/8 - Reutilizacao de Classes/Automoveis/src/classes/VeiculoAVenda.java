package classes;

/**
 *
 * @author Alisson Jaques
 */
public class VeiculoAVenda {

    private String tipo;
    private short ano;
    private double precoDeVenda;

    public VeiculoAVenda(String tipo, short ano, double precoDeVenda) {
        this.tipo = tipo;
        this.ano = ano;
        this.precoDeVenda = precoDeVenda;
    }

    public VeiculoAVenda() {

    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ano
     */
    public short getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(short ano) {
        this.ano = ano;
    }

    /**
     * @return the precoDeVenda
     */
    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    /**
     * @param precoDeVenda the precoDeVenda to set
     */
    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    /**
     *
     */
    @Override
    public String toString() {
        String resultado = "";
        resultado += "Tipo: " + getTipo();
        resultado += "\nAno: " + getAno();
        resultado += "\nPreço de Venda: R$" + getPrecoDeVenda() + "\n";
        return resultado;
    }
}
