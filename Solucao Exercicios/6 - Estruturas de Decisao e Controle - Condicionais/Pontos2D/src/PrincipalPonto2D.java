/**
 *  A classe PrincipalPonto2D possu� um �nico m�todo,
 *  que � o m�todo main. Este m�todo permite a execu��o
 *  dessa classe. Esta classe demonstra usos da classe
 *  Ponto2D.
 *  
 *  @author Alisson Jaques
 *  
 */
public class PrincipalPonto2D {

    public static void main(String[] argumentos){

    Ponto2D origem = Ponto2D.origem(); // ponto P = (0,0)    
    Ponto2D umEUm = new Ponto2D(1,1);
    Ponto2D doisEZero = new Ponto2D(2);

    System.out.println(umEUm.est�AcimaDe(origem));       // imprime true
    System.out.println(umEUm.est�AbaixoDe(doisEZero));   // imprime false
    System.out.println(origem.est��EsquerdaDe(umEUm));   // imprime true
    System.out.println(origem.est��DireitaDe(umEUm));    // imprime false
    System.out.println(doisEZero.est��DireitaDe(umEUm)); // imprime true 
    System.out.println(doisEZero.est��EsquerdaDe(umEUm));// imprime false

    } // fim do m�todo main

} // fim da  classe PrincipalPonto2D
