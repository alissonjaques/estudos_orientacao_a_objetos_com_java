/**
 *  A classe PrincipalPonto2D possuí um único método,
 *  que é o método main. Este método permite a execução
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

    System.out.println(umEUm.estáAcimaDe(origem));       // imprime true
    System.out.println(umEUm.estáAbaixoDe(doisEZero));   // imprime false
    System.out.println(origem.estáÀEsquerdaDe(umEUm));   // imprime true
    System.out.println(origem.estáÀDireitaDe(umEUm));    // imprime false
    System.out.println(doisEZero.estáÀDireitaDe(umEUm)); // imprime true 
    System.out.println(doisEZero.estáÀEsquerdaDe(umEUm));// imprime false

    } // fim do método main

} // fim da  classe PrincipalPonto2D
