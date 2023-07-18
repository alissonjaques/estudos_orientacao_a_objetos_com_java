/**
* A classe DemoRegistroAcademicoSemConstrutor, que demonstra o uso de instâncias da
* classe RegistroAcademicoSemConstrutor.
*/
class DemoRegistroAcademicoSemConstrutor{ // declaração da classe

	/**
	 * O método main permite a execução desta classe. Este método contém declarações de
	 * algumas instâncias da classe RegistroAcademicoSemConstrutor, e demonstra seu uso.
	 * @param argumentos os argumentos que podem ser passados para o método via linha
	 * de comando, mas que neste caso serão ignorados.
	 */
	public static void main(String[] argumentos){

		// Declaramos duas referências a instâncias da classe
		// RegistroAcademicoSemConstrutor, e as inicializamos com a palavra-chave new
		RegistroAcademicoSemConstrutor michael = new RegistroAcademicoSemConstrutor();
		RegistroAcademicoSemConstrutor roberto = new RegistroAcademicoSemConstrutor();
		// Chamamos o método de inicialização somente para uma das instâncias
		michael.inicializaRegistroAcademicoSemConstrutor("Michael Goodrich",34980030,
															(byte)2,100.0);
		// Calculamos a mensalidade dos dois alunos - mesmo que um não tenha sido
		// inicializado !
		System.out.println("A mensalidade do Michael é "+michael.calculaMensalidade());
		System.out.println("A mensalidade do Roberto é "+roberto.calculaMensalidade());

	} // fim do método main

} // fim da classe DemoRegistroAcademicoSemConstrutor
