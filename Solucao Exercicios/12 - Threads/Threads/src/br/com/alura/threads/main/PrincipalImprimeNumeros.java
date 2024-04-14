package br.com.alura.threads.main;

import br.com.alura.threads.classes.TarefaImprimeNumeros;

public class PrincipalImprimeNumeros {
    public static void main(String[] args) {
        new Thread(new TarefaImprimeNumeros()).start();
        new Thread(new TarefaImprimeNumeros ()).start();
    }
}