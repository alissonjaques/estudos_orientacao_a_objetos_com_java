/**
* A classe ConstantesMatematicas, que contém vários valores que são constantes.
* Esta classe não tem métodos, e todos os campos são declarados como static, assim
* não é necessário criar instâncias desta classe para acessar os valores. Para que
* os valores possam ser acessados de fora da classe sem a necessidade de métodos os
* campos são declarados como public. Para garantir que os valores não poderão ser
* modificados, os campos também são declarados como final.
*/
public class ConstantesMatematicas{ // declaração da classe

	/**
	 * Declaração dos campos da classe
	 */
	final static public double raizDe2 = 1.4142135623730950488;			// A raiz quadrada de 2
	final static public double raizDe3 = 1.7320508075688772935;			// A raiz quadrada de 3
	final static public double raizDe5 = 2.2360679774997896964;			// A raiz quadrada de 5
	final static public double raizDe6 = raizDe2*raizDe3;				// A raiz quadrada de 6: podemos usar as constantes já definidas

} // fim da classe ConstantesMatematicas
