package main;

import classes.Automovel;
import classes.AutomovelBasico;
import classes.AutomovelDeLuxo;

/**
 * A classe DemoAutomoveis, que demonstra instâncias das classes Automovel,
 * AutomovelBasico e AutomovelDeLuxo.
 */
class DemoAutomoveis {

    /**
     * O método main permite a execução desta classe. Este método contém
     * declarações de algumas instâncias das classes Automovel, AutomovelBasico
     * e AutomovelDeLuxo, e chamadas a métodos destas classes.
     *
     * @param argumentos os argumentos que podem ser passados para o método via
     * linha de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Automovel, cujo construtor somente recebe como
        // argumentos o modelo, a cor e o combustível. Note como podemos usar as
        // constantes finais declaradas na classe Automovel como mnemônicos para o tipo
        // de combustível.
        Automovel a = new Automovel("Fusca", "verde", Automovel.MOVIDOAALCOOL);
        // Executamos alguns métodos da classe Automovel
        System.out.println(a); // toString (implicitamente)
        System.out.println(a.quantoCusta());
        System.out.println(a.quantasPrestações());

        // Criamos uma instância da classe AutomovelBasico. Usamos o construtor que recebe
        // como argumentos o modelo, a cor e o combustível (que serão repassados para o
        // construtor da classe ancestral), além de booleanos para representar a existência
        // de retrovisores do lado do passageiro, limpador de pára-brisas e rádio AM/FM.
        // A mesma classe tem um construtor que considera estes três acessórios como
        // existentes por default.
        AutomovelBasico ab = new AutomovelBasico("Corsa", "cinza", Automovel.MOVIDOAGASOLINA,
                true, true, false);
        // Executamos alguns métodos da classe AutomovelBasico
        System.out.println(ab); // toString (implicitamente)
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPrestações()); // método herdado, sem modificações

        // Criamos uma instância da classe AutomovelDeLuxo. Usamos o construtor que recebe
        // como argumentos somente o modelo, a cor e o combustível (que serão repassados
        // para o construtor da classe ancestral, em cascata). Este construtor considera
        // que todos os acessórios são instalados por default. A mesma classe tem um
        // construtor que recebe valores booleanos indicando a existência ou não de cada
        // um dos acessórios.
        AutomovelDeLuxo al = new AutomovelDeLuxo("Classe A", "azul",
                Automovel.MOVIDOAGASOLINA);
        // Executamos alguns métodos da classe AutomovelDeLuxo
        System.out.println(al); // toString (implicitamente)
        System.out.println(al.quantoCusta());
        System.out.println(al.quantasPrestações()); // método superposto
    }

} // fim da classe DemoAutomoveis
