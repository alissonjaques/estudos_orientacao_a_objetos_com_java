package classes;

/**
 *
 * @author Alisson Jaques
 */
public class MotocicletaAVenda extends VeiculoAVenda {

    public MotocicletaAVenda(short ano, double precoDeVenda) {
        super("Motocicleta", ano, precoDeVenda);
    }

    public MotocicletaAVenda() {
        this((short) 2000, (double) 20000.00);
    }
}
