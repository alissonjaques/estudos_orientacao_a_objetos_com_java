package main;

import classes.AutomovelAVenda;
import classes.MotocicletaAVenda;
import classes.VeiculoAVenda;

/**
 *
 * @author Alisson Jaques
 */
public class Main {
    public static void main(String[] args){
        VeiculoAVenda caminhao = new VeiculoAVenda("Caminhão",(short)1997,(double)80000.00);
        AutomovelAVenda carroPopular = new AutomovelAVenda();
        MotocicletaAVenda titan160 = new MotocicletaAVenda((short)2015,(double)9000.00);
        
        System.out.println(caminhao);
        System.out.println(carroPopular);
        System.out.println(titan160);
    }
}
