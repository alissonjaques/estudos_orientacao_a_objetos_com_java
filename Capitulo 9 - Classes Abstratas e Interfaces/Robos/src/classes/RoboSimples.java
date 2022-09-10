package classes;

/**
 * A classe RoboSimples, que herda da classe RoboAbstrato e que representa um
 * robô de comportamento simples. Esta classe herda todos os métodos
 * não-abstratos da classe RoboAbstrato exceto o construtor, que é redeclarado
 * (mas aproveita o construtor da classe ancestral). Esta classe também
 * implementa o método move, que foi declarado como sendo abstrato na classe
 * ancestral. A classe não tem nenhum campo adicional.
 */
class RoboSimples extends RoboAbstrato // declaração da classe
{

    /**
     * O construtor para a classe RoboSimples, que recebe argumentos para
     * inicializar todos os campos da classe, que foram herdados da classe
     * RoboAbstrato. O construtor simplesmente repassa os argumentos para o
     * construtor da classe ancestral.
     *
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    RoboSimples(String n, int px, int py, short d) {
        super(n, px, py, d);
    }
    
    /**
     * O método mudaDireção, sobrescreve o método de mesmo nome (herdado da classe 
     * abstrata RoboAbstrato). Este método recebe um valor que corresponde a um ângulo
     * de nova direção e seta a direção do robô de acordo com esse valor.
     * @param novaDireção a nova direção do robô
     */
    @Override
    public void mudaDireção(short novaDireção) {
        if(novaDireção<45 || novaDireção>315){ // se novaDireção >315 ou novaDireção <45
            setDireçãoAtual((short)0); // nova direção do robô será de 0 graus
        }
        else if(novaDireção>=45 && novaDireção<=135){ // senão se novaDireção >=453 e novaDireção <=135
            setDireçãoAtual((short)90); // nova direção do robô será de 90 graus
        }
        else if(novaDireção>135 && novaDireção<=225){ // senão se novaDireção >135 e novaDireção<=225
            setDireçãoAtual((short)180); // nova direção do robô será de 180 graus
        }
        else if(novaDireção>225 && novaDireção<=315){ // senão se novaDireção >225 e novaDireção <=315
            setDireçãoAtual((short)270); // nova direção do robô será de 270 graus
        }        
    } 
    
    /**
     * Esta versão do método move modifica a posição do robô em um número de
     * unidades na direção em que o robô está. O método foi declarado como sendo
     * abstrato na classe ancestral, e deve ser implementado nesta classe.
     * Consideramos que um robô simples pode se movimentar somente nas quatro
     * direções cardeais, ou seja, 0, 90, 180, 270 graus, correspondentes aos
     * pontos cardeais E, N, O, S. Outros valores são ignorados. Como não
     * podemos modificar diretamente os campos que determinam a posição atual do
     * robô, usamos os métodos moveX e moveY, herdados da classe ancestral.
     *
     * @param passos o número de "passos" para o robô
     */
    @Override
    public void move(int passos) {
        switch (qualDireçãoAtual()) // recuperamos a direção atual através deste método
        {
            case 0:
                moveX(+passos);
                break; // passos positivos na direção X
            case 90:
                moveY(+passos);
                break; // passos positivos na direção Y
            case 180:
                moveX(-passos);
                break; // passos negativos na direção X
            case 270:
                moveY(-passos);
                break; // passos negativos na direção Y
        }
    }

} // fim da classe RoboSimples
