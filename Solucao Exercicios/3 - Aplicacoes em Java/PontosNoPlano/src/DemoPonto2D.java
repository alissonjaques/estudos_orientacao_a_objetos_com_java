	/**
	 * A classe DemoPonto2D, que demonstra usos da classe Ponto2D. Esta classe demonstra,
	 * em especial, onde é necessário ou não o uso do operador new para criar novas
	 * instâncias da classe Ponto2D.
	 */
 	class DemoPonto2D{ // declaração da classe
 		
 		/**
 		 * O método main permite a execução desta classe. Este método contém declarações
 		 * de algumas instâncias da classe Ponto2D, e demonstra sua criação e uso.
 		 * @param argumentos os argumentos que podem ser passados para o método via linha
 		 * de comando, mas que neste caso serão ignorados.
 		 */
 		public static void main(String[] argumentos) {
 
 			// Declaramos quatro referências a instâncias da classe Ponto2D, mas não
 			// criamos as instâncias associadas nem as inicializamos ainda.
 			Ponto2D p1; // declaramos somente uma referência
 			Ponto2D p2,p3,p4,p5,p6,p7; // várias referências podem ser declaradas desta forma
 			// Vamos criar duas instâncias e associá-las às referências
 			p1 = new Ponto2D();
 			p2 = new Ponto2D();
 			p6 = new Ponto2D();
 			p7 = new Ponto2D();
 			// Vamos inicializar algumas instâncias com valores
 			p1.inicializaPonto2D(-1.34,9.17);
 			p6.inicializaPonto2D(3, 3);
 			p7.inicializaPonto2D(4, 1);
 			// Como o método toString existe na classe Ponto2D, podemos imprimir diretamente
 			// as instâncias
 			System.out.println("As coordenadas de P1 são "+p1); // imprime (-1.34,9.17)
 			// Se a instância p2 não foi inicializada com valores, que valores ela contém ?
 			System.out.println("As coordenadas de P2 são "+p2); // imprime (0.0,0.0)
 			// Podemos criar instâncias sem usar diretamente o new !
 			p3 = p1.clona(); // o método clona retorna uma nova instância
 			p4 = p1.origem(); // o método origem retorna uma nova instância
 			p5 = p1.criaRevertido();
 			System.out.println("As coordenadas de P3 são "+p3); // imprime (-1.34,9.17)
 			System.out.println("As coordenadas de P4 são "+p4); // imprime (0.0,0.0)
 			System.out.println("As coordenadas de P5 são "+p5); // imprime (1.34,-9.17)
 			// Que pontos são iguais aos outros ?
 			System.out.println("P1 está na mesma posição de P2 ? "+p1.éIgual(p2)); // false
 			System.out.println("P1 está na mesma posição de P3 ? "+p1.éIgual(p3)); // true
 			System.out.println("P1 está na mesma posição de P4 ? "+p1.éIgual(p4)); // false
 			System.out.println("P2 está na mesma posição de P4 ? "+p2.éIgual(p4)); // true
 			// Podemos ter instâncias sem referências !
 			System.out.println(new Ponto2D()); // imprime (0.0,0.0)
 			//testes de outras questões do capítulo 3:
 			System.out.println("Os pontos "+p1+" e "+p3+" possuem eixo comum? "+p1.temEixoComum(p3));
 			System.out.println("Os pontos "+p4+" e "+p5+" possuem eixo comum? "+p4.temEixoComum(p5));
 			System.out.println("A distância entre os pontos "+p2+" e "+p5+" é: "+p2.distancia(p5)+" unidades");
 			System.out.println("A distância entre os pontos "+p1+" e "+p3+" é: "+p1.distancia(p3)+" unidades");
 			System.out.println("A distância do ponto "+p1+" à origem é: "+p1.distanciaDaOrigem());
 			System.out.println("A distância do ponto "+p2+" à origem é: "+p2.distanciaDaOrigem());
 			System.out.println("A distância do ponto "+p3+" à origem é: "+p3.distanciaDaOrigem());
 			System.out.println("A distância do ponto "+p4+" à origem é: "+p4.distanciaDaOrigem());
 			System.out.println("A distância do ponto "+p5+" à origem é: "+p5.distanciaDaOrigem());
 			System.out.println("Os pontos "+p6+" e "+p7+" são próximos? "+p6.éPróximo(p7, 3));
 			System.out.println("Os pontos "+p6+" e "+p7+" são próximos? "+p6.éPróximo(p7, 2));
 			
 		} // fim do método main

 } // fim da classe DemoPonto2D