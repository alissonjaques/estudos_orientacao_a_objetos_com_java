package classes;

import interfaces.Lampada;

/**
 * A classe LampadaIncandescente implementa a interface Lampada e representa uma 
 * lâmpada incandescente.
 * @author Alisson Jaques
 */
public class LampadaIncandescente implements Lampada{
    private boolean estadoDaLampada; // estado da lâmpada
    
    /*
     * O construtor completo da classe LampadaIncandescente que recebe o estado
     * da lâmpada e inicializa seu campo encapsulado com esse valor.
     * @param estadoDaLampada o estado da lâmpada (true = acesa e false = apagada)
     */
    public LampadaIncandescente(boolean estadoDaLampada){
        this.estadoDaLampada = estadoDaLampada;
    }
    
    /*
     * O construtor default inicializa o campo encapsulado da classe LampadaIncandescente
     * com o valor false (apagada).
     */
    public LampadaIncandescente(){
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
     * O método clona retorna uma nova instância da classe LampadaIncandescente,
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
