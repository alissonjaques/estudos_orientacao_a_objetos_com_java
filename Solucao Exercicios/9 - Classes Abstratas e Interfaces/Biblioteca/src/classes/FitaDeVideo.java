package classes;

import enums.Genero;

/**
 *
 * @author Alisson Jaques
 */
public class FitaDeVideo {
    private String titulo;
    private String diretor;
    private Genero genero;
    private String[] atoresPrincipais;
    private double duracao;
    
    public FitaDeVideo(String titulo, String diretor, Genero genero, String[] atoresPrincipais,
            double duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.atoresPrincipais = atoresPrincipais;
        this.duracao = duracao;
    }
    
    public FitaDeVideo(){
    
    }
    
    /*
     *
     */
    @Override
    public String toString(){
        String resultado = "";
        resultado += "Título: " + getTitulo();
        resultado += "\nDiretor: " + getDiretor();
        resultado += "\nGênero: " + getGenero().toString();
        resultado += "\nAtores Principais: \n";
        
        for(String ator: getAtoresPrincipais()){
            resultado += ator+"\n";
        }
        resultado += "Duração: " + getDuracao() + "\n";
        return resultado;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the atoresPrincipais
     */
    public String[] getAtoresPrincipais() {
        return atoresPrincipais;
    }

    /**
     * @param atoresPrincipais the atoresPrincipais to set
     */
    public void setAtoresPrincipais(String[] atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }

    /**
     * @return the duracao
     */
    public double getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
