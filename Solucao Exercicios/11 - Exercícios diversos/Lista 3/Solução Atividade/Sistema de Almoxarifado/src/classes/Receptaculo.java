/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author licin
 */
public class Receptaculo {
    
    private int codigoCorredor;
    static private int ordem = 0;
    private int ordemNoCorredor;
    
    public Receptaculo(int codigoCorredor){
        ordem++;
        ordem = ordemNoCorredor;
        this.codigoCorredor = codigoCorredor;
    }
    
    public Receptaculo(){
    
    }
    
    
}
