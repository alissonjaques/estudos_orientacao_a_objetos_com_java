package br.com.alura.threads.classes;

public class TarefaImprimeNumeros implements Runnable{
    @Override
    public void run() {
        Thread threadAtual = Thread.currentThread();
        for(int i=1; i<=1000 ; i++) {
            System.out.println(threadAtual.getId() + " - " + i);
        }
    }
}
