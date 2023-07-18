package interfaces;

/**
 * A interface ConstantesMatematicas que representa
 * uma coleção de algumas constantes de raiz quadradas
 * não perfeitas.
 * @author Alisson Jaques
 */
public interface ConstantesMatematicas {
    /**
     * Declaração dos campos da interface
     */
    // A raiz quadrada de 2
    double RAIZDE2 = 1.4142135623730950488;
    // A raiz quadrada de 3
    double RAIZDE3 = 1.7320508075688772935;
    // A raiz quadrada de 5
    double RAIZDE5 = 2.2360679774997896964;
    // A raiz quadrada de 6: podemos usar as constantes já definidas
    double RAIZDE6 = RAIZDE2 * RAIZDE3;
}
