package aula0804agendamento;

public class Main {

	public static void main(String[] args) {
		
		Medico m1 = new Medico();
		m1.setNome("Dr. Fulano");
		m1.setEspecialidade("Oftalmologista");
		Medico m2 = new Medico();
		m2.setNome("Dr. Cicrano");
		m2.setEspecialidade("Clínico Geral");
		
		Paciente p1 = new Paciente();
		p1.setNome("Primeiro Paciente");
		p1.setDataDeNascimento("10/10/2000");
		p1.setCpf("01001");
		Paciente p2 = new Paciente();
		p2.setNome("Segundo Paciente");
		p2.setDataDeNascimento("11/11/2001");
		p2.setCpf("02002");
		Paciente p3 = new Paciente();
		p3.setNome("Terceiro Paciente");
		p3.setDataDeNascimento("12/12/2002");
		p3.setCpf("03003");
		
		Consulta c1 = new Consulta("15/04/2025", p3, m1);
		Consulta c2 = new Consulta("16/04/2025", p3, m2);
		Consulta c3 = new Consulta("17/04/2025", p1, m1);
		Consulta c4 = new Consulta("18/04/2025", p2, m1);
		
		Agenda ag = new Agenda();
		ag.agendar(c1);
		ag.agendar(c2);
		ag.agendar(c3);
		ag.agendar(c4);
		
		/*
		 * Agendamentos também podem ser feitos da forma abaixo:
		 * Assim, não é necessário criar o objeto especificamente para isso
		 * ag.agendar(new Consulta("15/04/2025", p3, m1));
		 */
		
		ag.exibirRelatorio();
		ag.cancelar(c2);
		ag.exibirRelatorio();
		ag.reagendar(c3, "19/04/2025");
		ag.exibirRelatorio();
	}

}
