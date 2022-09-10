package classes;

/**
 * A classe Livro, que encapsula os dados de um livro. Para simplificar, somente
 * os campos e métodos mais básicos são implementados nesta classe.
 */
public class Livro {

    /**
     * Declaração dos campos da classe
     */
    private String título, autor; // o título e autor do livro
    private short númeroDePáginas; // o número de páginas do livro
    private short anoDaEdição; // o ano da edição do livro

    /**
     * O construtor para a classe Livro, que recebe argumentos para inicializar
     * todos os campos da classe. Este é o construtor "completo".
     *
     * @param tit o título do livro
     * @param aut o(s) nome(s) do(s) autor(es) do livro
     * @param np o número de páginas do livro
     * @param ae o ano da edição do livro
     */
    Livro(String tit, String aut, short np, short ae) {
        título = tit;
        autor = aut;
        númeroDePáginas = np;
        anoDaEdição = ae;
    }

    /**
     * O método qualTítulo retorna o título deste livro.
     *
     * @return o título do livro
     */
    public String qualTítulo() {
        return título;
    }

    /**
     * O método qualAutor retorna o autor deste livro.
     *
     * @return o autor do livro
     */
    public String qualAutor() {
        return autor;
    }

    /**
     * O método toString retorna os valores dos campos desta classe formatados
     * em uma String.
     *
     * @return uma String contendo uma representação dos campos desta classe.
     */
    public String toString() {
        // Retorna diretamente uma String criada com os valores dos campos.
        return "Título : " + título + "\n"
                + "Autor : " + autor + "\n"
                + "Número de Páginas : " + númeroDePáginas + "\n"
                + "Ano da Edição : " + anoDaEdição + "\n";
    }

} // fim da classe Livro
