package aula0804agendamento;

public class Consulta {
	
	private String data;
	private Paciente paciente;
	private Medico medico;
	
	//Contrutor com campos
	public Consulta(String data, Paciente paciente, Medico medico) {
		super();
		this.data = data;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	//Getters e setters
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	//Métodos da classe
	public void exibirInfo() {
		System.out.println("Consulta [data=" + data + ", paciente=" + this.paciente.getNome() + ", medico=" + this.medico.getNome() + "]");
	}
	
	

}
