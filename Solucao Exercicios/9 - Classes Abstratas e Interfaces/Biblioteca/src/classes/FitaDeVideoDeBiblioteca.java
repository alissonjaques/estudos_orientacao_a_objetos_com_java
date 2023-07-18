package classes;

import enums.Genero;
import interfaces.ItemDeBiblioteca;

/**
 *
 * @author Alisson Jaques
 */
public class FitaDeVideoDeBiblioteca extends FitaDeVideo implements ItemDeBiblioteca {
    /**
     * Declara��o dos campos da classe
     */
    // Este campo que indica o status do empr�stimo do material, e � usado por v�rios
    // m�todos, inclusive os que s�o implementados por causa da interface
    // ItemDeBiblioteca
    private boolean est�Emprestado;
    // Este campo representa a localiza��o do livro na biblioteca.
    private String localiza��o;
    
    public FitaDeVideoDeBiblioteca(String titulo, String diretor, Genero genero, String[] atoresPrincipais,
            double duracao, String lc){
        super(titulo,diretor,genero,atoresPrincipais,duracao);
        localiza��o = lc;
        est�Emprestado = false;
    }
    
    public FitaDeVideoDeBiblioteca(){
    
    }
    
    @Override
    public boolean est�Emprestado() {
        return isEst�Emprestado();
    }

    @Override
    public void empresta() {
        setEst�Emprestado(true);
        System.out.print("A fita de v�deo " + getTitulo() + " foi emprestada, "
                + "e dever� ser ");
        System.out.println("devolvido em " + m�ximoDeDiasParaEmpr�stimo + " dias.");
    }

    @Override
    public void devolve() {
        setEst�Emprestado(false);
    }

    @Override
    public String localiza��o() {
        return getLocaliza��o();
    }

    @Override
    public String descri��oSum�ria() {
        return super.toString();
    }

    /**
     * @return the est�Emprestado
     */
    public boolean isEst�Emprestado() {
        return est�Emprestado;
    }

    /**
     * @param est�Emprestado the est�Emprestado to set
     */
    public void setEst�Emprestado(boolean est�Emprestado) {
        this.est�Emprestado = est�Emprestado;
    }

    /**
     * @return the localiza��o
     */
    public String getLocaliza��o() {
        return localiza��o;
    }

    /**
     * @param localiza��o the localiza��o to set
     */
    public void setLocaliza��o(String localiza��o) {
        this.localiza��o = localiza��o;
    }
}
