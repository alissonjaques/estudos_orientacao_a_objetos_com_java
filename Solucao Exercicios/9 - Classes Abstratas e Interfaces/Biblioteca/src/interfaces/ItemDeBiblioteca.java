package interfaces;

/**
 * A interface ItemDeBiblioteca, que declara os campos e métodos que qualquer
 * item em uma biblioteca deve ter.
 */
public interface ItemDeBiblioteca {

    /**
     * Declaração dos campos da interface - note que todo campo em uma interface
     * é considerado como public final, não podendo variar.
     */
    int máximoDeDiasParaEmpréstimo = 14;

    /**
     * O método estáEmprestado retorna true se o item estiver emprestado e false
     * caso contrário.
     *
     * @return true se o item estiver emprestado e false caso contrário
     */
    boolean estáEmprestado();

    /**
     * O método empresta modifica o estado de um campo que indica se o item está
     * emprestado ou não para true.
     */
    void empresta();

    /**
     * O método devolve modifica o estado de um campo que indica se o item está
     * emprestado ou não para false.
     */
    void devolve();

    /**
     * O método localização retorna a localização do item na biblioteca
     *
     * @return a localização do item na biblioteca
     */
    String localização();

    /**
     * O método descriçãoSumária retorna uma String contendo uma descrição
     * sumária do item de biblioteca
     *
     * @return a descrição sumária do item da biblioteca
     */
    String descriçãoSumária();

} // fim da interface ItemDeBiblioteca
