package classes;

/**
 *
 * @author Alisson Jaques
 */
public class AutomovelAVenda extends VeiculoAVenda {

    public AutomovelAVenda(short ano, double precoDeVenda) {
        super("Automovel", ano, precoDeVenda);
    }
    
    public AutomovelAVenda(){
        this((short)2000,(double)20000.00);
    }
}
