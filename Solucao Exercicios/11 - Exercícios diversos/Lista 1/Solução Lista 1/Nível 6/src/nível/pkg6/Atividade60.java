package nível.pkg6;

import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo usuário

/**
 * A classe Atividade60 possui dois métodos, sendo um o método main e outro um método local para o main.
 * Esta classe representa um programa de computador, que recebe como entrada dois números flutuantes,
 * referentes às coordenadas de um ponto no plano cartesiano ortogonal, e fornece como saída a localização
 * desse ponto (origem, eixo x, eixo y, 1° Quadrante, entre outros).
 * @author Alisson Jaques
 */
public class Atividade60 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe. Ele recebe como entrada dois números flutuantes (pertencentes
     * às coordenadas x e y de um ponto no plano cartesiano), e imprimi, como saída, a localização desse ponto no 
     * terminal. Para tanto, ele utiliza como sub-rotina o método local verificaQuadrante(double,double), também 
     * presente nesta classe.
     * @param argumentos os argumentos que podem passados ao método, via linha de comando, mas que neste caso
     * serão ignorados.
     */
    public static void main(String[] argumentos){

        double x;                               // a abscissa x do ponto
        double y;                               // a ordenada y do ponto
        Scanner scan = new Scanner(System.in);  // scan aponta para um objeto da classe Scanner
        
        System.out.println("************************** Verifica Quadrante *****************************");
        
        /*
            Solicita os valores de x e y e inicializa as variáveis correspondentes com os mesmos.
        */
        System.out.print("\nInforme o valor de x: ");
        x = scan.nextDouble();
        System.out.print("Informe o valor de y: ");
        y = scan.nextDouble();
        scan.close(); // encerra o objeto scan

        System.out.println(); // quebra de linha para organização dos dados no terminal
        switch(verificaQuadrante(x,y)){ // caso o retorno do método verificaQuadrante seja

            case 1: // 1, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta no 1° Quadrante.");
                break;
            case 2: // 2, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta no 2° Quadrante.");
                break;
            case 3: // 3, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta no 3° Quadrante.");
                break;
            case 4: //4, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta no 4° Quadrante.");
                break;
            case 0: // origem, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta na origem.");
                break;
            case 5: // eixo x, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta no 1 eixo x.");
                break;
            case 6: // eixo y, faça:
                System.out.println("O ponto P = "+"("+x+","+y+") esta no eixo y.");
                break;
        }        
        System.out.println("\n***************************************************************************");
    } // fim do método main

    /**
     * O método verificaQuadrante recebe dois números flutuantes como argumentos (x e y) e retorna um número, que
     * é a localização do ponto P = (x,y) no plano cartesiano ortogonal.
     * @param umX o valor da abscissa x do ponto
     * @param umY o valor da ordenada y do ponto
     * @return 
     * 1, se o ponto estiver no 1° quadrante
     * <li>2, se o ponto estiver no 2° quadrante</li>
     * <li>3, se o ponto estiver no 3° quadrante</li>
     * <li>4, se o ponto estiver no 4° quadrante</li>
     * <li>0, se o ponto estiver na origem</li>
     * <li>5, se o ponto estiver no eixo x</li>
     * <li>6, se o ponto estiver no eixo y</li> 
     */
    private static byte verificaQuadrante(double umX, double umY){

        if(umX>0 && umY>0){ // se o ponto estiver no primeiro quadrante
            return 1;
        }
        else if(umX>0 && umY<0){ // senão, se o ponto estiver no segundo quadrante
            return 2;
        }
        else if(umX<0 && umY<0){ // senão, se o ponto estiver no terceiro quadrante
            return 3;
        }
        else if(umX<0 && umY>0){ // senão, se o ponto estiver no quarto quadrante
            return 4;
        }
        else if(umX==0 && umY==0){ // senão, se o ponto estiver na origem
            return 0;
        }
        else if(umY==0){ // senão, se o ponto estiver no eixo x
            return 5;
        }
        else{ // senão (aqui o ponto estará no eixo y)
            return 6;
        }//fim-se
    }// fim do método verificaQuadrante
} // fim da classe Atividade60