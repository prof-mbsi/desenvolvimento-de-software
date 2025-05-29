package aula2905;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");

        System.out.println("Primeiro nome: " + nomes.get(0));

        nomes.remove(1);  // remove "Carlos"

        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        numeros.set(1, 50); // altera o valor do índice 1 para 50

        System.out.println(numeros);
        
        Queue<String> fila = new LinkedList<>();
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        System.out.println("Atendendo: " + fila.poll()); // Cliente 1
        System.out.println("Próximo: " + fila.peek());  // Cliente 2
        
        Queue<String> tarefas = new LinkedList<>();
        tarefas.add("Enviar email");
        tarefas.add("Gerar relatório");
        tarefas.add("Fazer backup");

        while (!tarefas.isEmpty()) {
            System.out.println("Executando: " + tarefas.poll());
        }

	}

}
