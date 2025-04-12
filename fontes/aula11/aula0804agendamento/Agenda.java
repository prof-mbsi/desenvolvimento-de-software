package aula0804agendamento;

import java.util.Iterator;

public class Agenda {
	
	private Consulta[] agenda = new Consulta[3];

	//Getters e setters
	public Consulta[] getAgenda() {
		return agenda;
	}
	public void setAgenda(Consulta[] agenda) {
		this.agenda = agenda;
	}
	
	//Métodos da classe
	
	/*
	 * Percorre o array buscando um espaço vazio. Se encontrar, adiciona a consulta nesse 
	 * espaço. Se não houver espaços vazios, retorna mensagem de erro.
	 */
	public void agendar(Consulta c) {
		boolean agendou = false;
		for (int i = 0; i < agenda.length; i++) {
			if(this.agenda[i] == null) {
				this.agenda[i] = c;
				agendou = true;
				System.out.println("Consulta agendada com sucesso!");
				break;
			}
		}
		if(!agendou) {
			System.err.println("Consulta não agendada. Não há espaço na agenda!");
		}
	}
	
	//Atribui null para o endereço da consulta, liberando espaço para um novo agendamento
	public void cancelar(Consulta c) {
		int indiceDaConsulta = buscaConsulta(c);
		//Se o índice for >= 0 significa que a consulta está no array
		if(indiceDaConsulta >= 0) {
			this.agenda[indiceDaConsulta] = null;
		} else {
			System.err.println("Consulta não encontrada na agenda!");
		}
	}
	
	//Verifica se a consulta está na agenda retornando seu índice
	public int buscaConsulta(Consulta c) {
		//Percorre o array e, se encontrar a consulta, retorna em qual índice ela está
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i] == c) {
				return i;
			}
		}
		//Retorna índice inexistente no array caso não encontre a consulta
		return -1;
	}
	
	/*
	 * Tendo como base o índice da consulta no array agenda, altera a data
	 * e sobrescreve o dado que estava lá anteriormente
	 */
	public void reagendar(Consulta c, String novaData) {
		int indiceDaConsulta = buscaConsulta(c);
		//Se o índice for >= 0 significa que a consulta está no array
		if(indiceDaConsulta >= 0) {
			c.setData(novaData);
			this.agenda[indiceDaConsulta] = c;
		} else {
			System.err.println("Consulta não encontrada na agenda!");
		}
	}
	
	//Percorre o array gerando o relatório
	public void exibirRelatorio() {
		System.out.println();
		System.out.println("---Relatório de agendamentos---");
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i] != null) {
				System.out.println("Data: " + this.agenda[i].getData() + 
						" | Paciente: " + this.agenda[i].getPaciente().getNome() +
						" | Médico: " + this.agenda[i].getMedico().getNome() +
						" | Especialidade: " + this.agenda[i].getMedico().getEspecialidade());
			}
		}
	}
}
