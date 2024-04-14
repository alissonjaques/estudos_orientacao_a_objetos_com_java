package br.com.alura.threads.main;

import br.com.alura.threads.classes.TarefaBuscaNome;

public class PrincipalBuscaTextual {
    public static void main(String[] args) {

        String nomeProcurado = "da";

        Thread threadAutores = new Thread(new TarefaBuscaNome("src//br//com//alura//threads//arquivos//autores.txt", nomeProcurado));
        Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome("src//br//com//alura//threads//arquivos//assinaturas1.txt", nomeProcurado));
        Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome("src//br//com//alura//threads//arquivos//assinaturas2.txt", nomeProcurado));

        threadAutores.start();
        threadAssinaturas1.start();
        threadAssinaturas2.start();
    }
}