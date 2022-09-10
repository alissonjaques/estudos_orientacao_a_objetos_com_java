package classes;

import interfaces.ItemDeBiblioteca;

/**
 * A classe LivroDeBiblioteca, que encapsula os dados de um livro de uma
 * biblioteca. Esta classe herda todos os campos e métodos da classe Livro
 * (consideramos que campos privados são herdados, mesmo que não possam ser
 * acessados diretamente), e implementa os métodos declarados na interface
 * ItemDeBiblioteca.
 */
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    /**
     * Declaração dos campos da classe
     */
    // Este campo que indica o status do empréstimo do material, e é usado por vários
    // métodos, inclusive os que são implementados por causa da interface
    // ItemDeBiblioteca
    private boolean estáEmprestado;
    // Este campo representa a localização do livro na biblioteca.
    private String localização;

    /**
     * O construtor para a classe LivroDeBiblioteca, que recebe argumentos para
     * inicializar todos os campos da classe. Este é o construtor "completo".
     * Este construtor passará para o construtor da classe ancestral a tarefa de
     * inicializar os campos que são herdados da classe ancestral.
     *
     * @param tit o título do livro
     * @param aut o(s) nome(s) do(s) autor(es) do livro
     * @param np o número de páginas do livro
     * @param ae o ano da edição do livro
     * @param loc a localização do livro
     */
    LivroDeBiblioteca(String tit, String aut, short np, short ae, String loc) {
        super(tit, aut, np, ae); // delega a inicialização ao construtor da classe ancestral
        localização = loc;
        estáEmprestado = false; // se acabou de ser criado, não deve estar emprestado ainda
    }

    /**
     * O método empresta deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método modifica o valor do campo estáEmprestado
     * para true.
     */
    @Override
    public void empresta() {
        estáEmprestado = true;
        System.out.print("O livro " + qualTítulo() + " foi emprestado, e deverá ser ");
        System.out.println("devolvido em " + máximoDeDiasParaEmpréstimo + " dias.");
    }

    /**
     * O método devolve deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método modifica o valor do campo estáEmprestado
     * para false.
     */
    @Override
    public void devolve() {
        estáEmprestado = false;
    }

    /**
     * O método estáEmprestado deve ser implementado porque foi declarado na
     * interface ItemDeBiblioteca. Este método retorna o valor do campo privado
     * estáEmprestado.
     *
     * @return o valor do campo estáEmprestado
     */
    @Override
    public boolean estáEmprestado() {
        return estáEmprestado;
    }

    /**
     * O método localização deve ser implementado porque foi declarado na
     * interface ItemDeBiblioteca. Este método retorna o valor do campo privado
     * localização.
     *
     * @return o valor do campo localização
     */
    @Override
    public String localização() {
        return localização;
    }

    /**
     * O método descriçãoSumária deve ser implementado porque foi declarado na
     * interface ItemDeBiblioteca.
     *
     * @return uma descrição sumária do livro.
     */
    @Override
    public String descriçãoSumária() {
        return qualTítulo() + " " + qualAutor();
    }

    /**
     * O método toString retorna os valores dos campos desta classe formatados
     * em uma String. Este método chama explicitamente o método toString da
     * classe ancestral.
     *
     * @return uma String contendo uma representação dos campos desta classe.
     */
    @Override
    public String toString() {
        // Cria uma String temporária para receber o conteúdo dos campos. Esta String
        // receberá primeiramente o resultado do método toString da classe ancestral.
        String temporária = super.toString();
        temporária += "Localização : " + localização + "\n";
        if (estáEmprestado) {
            temporária += "Este livro está emprestado.";
        } else {
            temporária += "Este livro está disponível para empréstimo.";
        }
        return temporária;
    }

} // fim da classe LivroDeBiblioteca
