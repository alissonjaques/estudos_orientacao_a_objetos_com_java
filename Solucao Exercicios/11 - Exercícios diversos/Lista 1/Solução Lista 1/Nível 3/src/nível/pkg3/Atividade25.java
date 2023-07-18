package nível.pkg3;

import java.util.Scanner; // importação da classe Scanner, para manipular dados informados pelo teclado

public class Atividade25 { // declara a classe
    
    /**
     * O método main permite a execução dessa classe, ele recebe como entrada a altura e o sexo de uma
     * pessoa, retornando como saída o peso ideal dessa pessoa.
     * @param argumentos os argumentos que podem ser passados ao método, via linha de comando, mas que
     * neste caso serão ignorados.
     */
    public static void main(String[] argumentos){

        double altura, pesoIdeal;                           // altura e peso ideal
        char sexo;                                          // o sexo
        Scanner scan = new Scanner(System.in, "ISO-8859-1"); // a referência scan é declarada e aponta para uma instância da classe Scanner

        System.out.println("******************** Cálculo do Peso Ideal **********************");

        /*
            Solicita a altura e o sexo da pessoa, inicializando as variáveis correspondentes com esses
            dados. Caso a altura seja um valor absurdo ou o sexo inválido o sistema irá solicitar um 
            novo valor, até que um valor válido seja inserido pelo usuário.       
        */
        System.out.print("\nInforme a altura: ");
        altura = scan.nextDouble();
        while(altura<=0 || altura>2.8){ // enquanto a altura for absurda
            System.out.println("Informe um valor válido para a altura:"); // solicita uma nova altura
            altura = scan.nextDouble(); // armazena a nova altura
        }
        scan.reset(); // limpa o objeto scan
        System.out.print("Informe o sexo (m ou f): ");
        sexo = scan.next().charAt(0); // retorna o caracter informado pelo usuário e o armazena na variável sexo
        while(sexo!='m' && sexo!='f'){ // enquanto o sexo for absurdo:
            System.out.println("Opção para sexo inválida, forneça m (masculino) ou f (feminino):"); // solicita um valor válido
            sexo = scan.next().charAt(0); // armazena o novo valor
        }
        scan.close(); // fecha o objeto scan

        if(sexo=='m'){// se a pessoa for do sexo masculino
            pesoIdeal = (72.7 * altura) - 58;
        }
        else{// senão a pessoa será do sexo feminino
            pesoIdeal = (62.1 * altura) -44.7;
        }

        System.out.println("Peso ideal: " + pesoIdeal);
        System.out.println("\n*****************************************************************");
    } // fim do método main
} // fim da classe Atividade25
