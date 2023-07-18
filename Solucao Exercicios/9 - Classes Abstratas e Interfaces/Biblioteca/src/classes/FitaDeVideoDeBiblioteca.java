package classes;

import enums.Genero;
import interfaces.ItemDeBiblioteca;

/**
 *
 * @author Alisson Jaques
 */
public class FitaDeVideoDeBiblioteca extends FitaDeVideo implements ItemDeBiblioteca {
    /**
     * Declaração dos campos da classe
     */
    // Este campo que indica o status do empréstimo do material, e é usado por vários
    // métodos, inclusive os que são implementados por causa da interface
    // ItemDeBiblioteca
    private boolean estáEmprestado;
    // Este campo representa a localização do livro na biblioteca.
    private String localização;
    
    public FitaDeVideoDeBiblioteca(String titulo, String diretor, Genero genero, String[] atoresPrincipais,
            double duracao, String lc){
        super(titulo,diretor,genero,atoresPrincipais,duracao);
        localização = lc;
        estáEmprestado = false;
    }
    
    public FitaDeVideoDeBiblioteca(){
    
    }
    
    @Override
    public boolean estáEmprestado() {
        return isEstáEmprestado();
    }

    @Override
    public void empresta() {
        setEstáEmprestado(true);
        System.out.print("A fita de vídeo " + getTitulo() + " foi emprestada, "
                + "e deverá ser ");
        System.out.println("devolvido em " + máximoDeDiasParaEmpréstimo + " dias.");
    }

    @Override
    public void devolve() {
        setEstáEmprestado(false);
    }

    @Override
    public String localização() {
        return getLocalização();
    }

    @Override
    public String descriçãoSumária() {
        return super.toString();
    }

    /**
     * @return the estáEmprestado
     */
    public boolean isEstáEmprestado() {
        return estáEmprestado;
    }

    /**
     * @param estáEmprestado the estáEmprestado to set
     */
    public void setEstáEmprestado(boolean estáEmprestado) {
        this.estáEmprestado = estáEmprestado;
    }

    /**
     * @return the localização
     */
    public String getLocalização() {
        return localização;
    }

    /**
     * @param localização the localização to set
     */
    public void setLocalização(String localização) {
        this.localização = localização;
    }
}
