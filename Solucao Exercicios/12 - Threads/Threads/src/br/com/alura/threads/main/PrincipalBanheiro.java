package br.com.alura.threads.main;

import br.com.alura.threads.classes.Banheiro;
import br.com.alura.threads.classes.TarefaNumero1;
import br.com.alura.threads.classes.TarefaNumero2;

public class PrincipalBanheiro {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();

        //Passando a tarefa e o nome do Thread
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");

        convidado1.start();
        convidado2.start();
    }
}