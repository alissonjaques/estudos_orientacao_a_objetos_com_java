package main;

import classes.Circulo;
import classes.Ponto2D;
import classes.Retangulo;
import interfaces.ObjetosGeometricos;

/**
 * A classe DemoObjetosGeometricos, que demonstra instâncias de classes que
 * implementam a interface ObjetoGeometrico.
 */
class DemoObjetosGeometricos // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém
     * declarações de instâncias das classes Circulo e Retangulo, duas classes
     * que implementam a interface ObjetoGeometrico.
     *
     * @param argumentos os argumentos que podem ser passados para o método via
     * linha de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas instâncias das classes Circulo e Retangulo
        Circulo c1 = new Circulo(new Ponto2D(0, 0), 100); // centrado na origem, raio 100
        Circulo c2 = new Circulo(new Ponto2D(-1, -1), 1); // centrado em (-1,-1), raio 1
        Circulo c3 = new Circulo(new Ponto2D(10, 8), 0); // centrado em (10,8), raio 0 (!)
        Retangulo r1 = new Retangulo(new Ponto2D(-2, -2), // um canto está em (-2,-2)
                new Ponto2D(2, 2)); // e o outro em (2,2)
        Retangulo r2 = new Retangulo(new Ponto2D(-100, -1), // um canto está em (-100,1)
                new Ponto2D(100, 1)); // e o outro em (100,1)
        Retangulo r3 = new Retangulo(new Ponto2D(0, 0), // um canto está em (0,0)
                new Ponto2D(0, 0)); // e o outro também !
        // Vamos imprimir os dados completos de cada um destes objetos geométricos
        imprimeTodosOsDados(c1);
        imprimeTodosOsDados(c2);
        imprimeTodosOsDados(c3);
        imprimeTodosOsDados(r1);
        imprimeTodosOsDados(r2);
        imprimeTodosOsDados(r3);
    } // fim do método main

    /**
     * O método imprimeTodosOsDados imprime todos os dados de uma instância de
     * uma classe que implemente a interface ObjetoGeometrico.
     *
     * @param og uma instância de qualquer classe que implemente a interface
     * ObjetoGeometrico.
     */
    private static void imprimeTodosOsDados(ObjetosGeometricos og) {
        // Primeiro, imprime os dados padrão do objeto - podemos fazer isto diretamente
        // através da chamada implícita ao método toString
        System.out.println(og);
        // Podemos imprimir a sua área e perímetro com chamadas diretas aos métodos das
        // classes
        System.out.println("Perímetro:" + og.calculaPerímetro());
        System.out.println("Área:" + og.calculaÁrea());
        if(og instanceof Retangulo){
            System.out.println("Achatamento: "+((Retangulo) og).calculaAchatamento());
        }
        // Imprimimos uma linha em branco para melhor visualização dos resultados
        System.out.println();
    } // fim do método imprimeTodosOsDados

} // fim da classe DemoObjetosGeometricos
