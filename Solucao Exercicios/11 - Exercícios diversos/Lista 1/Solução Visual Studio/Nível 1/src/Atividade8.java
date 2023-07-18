import java.util.Scanner; // importação da classe Scanner, para manipular entrada de dados pelo teclado
/**
 * A classe Atividade8 representa um programa de computador que calcula o volume de uma lata de óleo a 
 * partir de duas entradas (o raio e a altura da lata).
 * @author Alisson Jaques
 * 
 */
public class Atividade8 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe, ele recebe como entrada os dados referentes à altura e 
     * raio da lata de óleo e fornece como saída o volume da mesma.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que neste
     * caso serão ignorados
     */
    public static void main(String[] argumentos){

        double raio, altura;                           // Variáveis que representam a altura e o raio da lata
        Scanner scan = new Scanner(System.in);         // Declaração de uma instância da classe Scanner, para obter dados
                                                       // fornecidos pelo usuário

        System.out.println("\n********************** Volume Lata de Óleo ************************");
        

        /*
            É solicitado os dados referentes à altura e raio da lata.
            Os dados fornecidos são usados para inicializar as variáveis raio e altura.       
        */
        System.out.print("Informe o raio da lata: ");
        raio = scan.nextDouble();
        scan.reset(); // limpa o contéudo do objeto scan

        System.out.print("Informe a altura da lata: ");
        altura = scan.nextDouble();
        scan.close(); // fecha o objeto scan

        System.out.println("O volume da lata é: " + volumeDaLata(raio, altura));

    } // fim do método main

    /**
     * O método volumeDaLata recebe como argumentos o raio e a altura da lata e retorna
     * o volume da mesma.
     * @param r o raio da lata
     * @param h a altura da lata
     * @return o volume da lata correspondente aos dados passados
     */
    private static double volumeDaLata(double r, double h){

        double volume; // variável que representa o volume

        volume = Math.PI * Math.pow(r, 2) * h; // cálculo do volume

        return volume;

    } // fim do método volumeDaLata

} // fim da classe Atividade8
