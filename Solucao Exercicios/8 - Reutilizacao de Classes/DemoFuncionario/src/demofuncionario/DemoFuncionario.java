package demofuncionario;

import classes.Data;
import classes.Funcionario0;
import classes.Pessoa0;

/**
 * A classe DemoFuncionario0, que demonstra o uso de uma instância da classe
 * Funcionario0. Esta classe demonstra o que ocorre quando uma instância de uma
 * classe cujos campos tem modificadores de acesso é reaproveitada (via
 * delegação ou composição) dentro de outra classe que redeclara os
 * modificadores de acesso. ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE
 * ERROS INTENCIONAIS.
 */
class DemoFuncionario { // declaração da classe

    /**
     * O método main permite a execução desta classe. Este método declara uma
     * instância da classe Funcionario0 e tenta acessar alguns de seus campos e
     * dos campos das classes que são usadas pela classe Funcionario0.
     *
     * @param argumentos os argumentos que podem ser passados para o método via
     * linha de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Pessoa0, cujo construtor espera como terceiro
        // argumento uma instância da classe Data
        Pessoa0 pessoaChan = new Pessoa0("Patrick Chan", 90235422,
                new Data((byte) 22, (byte) 2, (short) 1964));
        // Criamos uma instância da classe Funcionario0, cujo construtor espera como
        // primeiro argumento uma instância da classe Pessoa0, como segundo argumento uma
        // instância da classe Data e como terceiro argumento um valor do tipo float.
        Funcionario0 funcionárioChan = new Funcionario0(pessoaChan,
                new Data((byte) 14, (byte) 2, (byte) 1990),
                (float) 2400.00);
        /*        
// Tentamos modificar diretamente o campo funcionário da instância. Teremos um
        // erro de compilação pois o campo funcionário é privado da classe Funcionario0.
        funcionárioChan.funcionário = new Pessoa0("José Ribamar", 87124324,
                new Data((byte) 9, (byte) 1, (short) 1931));
        // Tentamos modificar diretamente o nome do campo funcionário da instância. Teremos
        // outro erro de compilação pois mesmo que o campo nome da classe Pessoa0 seja
        // público, o campo funcionário da classe Funcionario0 é privado, impedindo o
        // acesso.
        funcionárioChan.funcionário.nome = "José Ribamar";
        // Tentamos modificar o campo salário da instância. Teremos novamente um erro de
        // compilação pois o campo salário é privado da classe Funcionario0.
        funcionárioChan.salário = (float) 1200.00;
        // Tentamos modificar o campo admissão da instância. Desta vez não teremos erros
        // pois o campo admissão é público da classe Funcionario0, podendo ser acessado
        // diretamente usando o operador ponto.
        funcionárioChan.admissão = new Data((byte) 14, (byte) 2, (byte) 1989);
        // Tentamos modificar diretamente o campo dia do campo admissão da instância.
        // Teremos novamente um erro de compilação pois, mesmo que a instância admissão
        // da classe Data tenha sido declarada como pública na classe Funcionario0, o campo
        // dia é declarado como private na classe Data.
        funcionárioChan.admissão.dia = (byte) 22;
         */
    } // fim do método main

} // fim da classe DemoFuncionario
