package classes;

import interfaces.Cores;
import interfaces.Lampada;

/**
 * A classe LampadaDeNatal que representa uma simples lâmpada natalina. Essa classe
 * representa herança múltipla, pois implementa duas interfaces (Lampada e Cores).
 * @author Alisson Jaques
 */
public class LampadaDeNatal implements Lampada, Cores{
    private boolean estadoDaLampada; // estado da lâmpada
    
    /*
     * O construtor completo da classe LampadaDeNatal que recebe o estado
     * da lâmpada e inicializa seu campo encapsulado com esse valor.
     * @param estadoDaLampada o estado da lâmpada (true = acesa e false = apagada)
     */
    public LampadaDeNatal(boolean estadoDaLampada){
        this.estadoDaLampada = estadoDaLampada;
    }
    
    /*
     * O construtor default inicializa o campo encapsulado da classe LampadaDeNatal
     * com o valor false (apagada).
     */
    public LampadaDeNatal(){
        estadoDaLampada = false;
    }
    
    /**
     * O método acendeLampada altera o valor do campo encapsulado da classe para 
     * true (acesa).
     */
    @Override
    public void acendeLampada() {
        setEstadoDaLampada(true);
    }
    
    /**
     * O método acendeLampada altera o valor do campo encapsulado da classe para 
     * false (apagada).
     */
    @Override
    public void apagaLampada() {
        setEstadoDaLampada(false);
    }
    
    /*
     * O método mostraEstado imprimi no terminal o estado atual da lâmpada.
     */
    @Override
    public void mostraEstado() {
        if(isEstadoDaLampada()){
            System.out.println("A lâmpada esta acesa.");
        }
        else{
            System.out.println("A lâmpada esta apagada.");
        }
    }
    
    /**
     * O método clona retorna uma nova instância da classe LampadaDeNatal,
     * com os mesmos campos encapsulados do objeto atual.
     */
    @Override
    public Lampada clona() {
        return new LampadaIncandescente(isEstadoDaLampada());
    }

    /**
     * @return the estadoDaLampada
     */
    public boolean isEstadoDaLampada() {
        return estadoDaLampada;
    }

    /**
     * @param estadoDaLampada the estadoDaLampada to set
     */
    public void setEstadoDaLampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }    
    
}
