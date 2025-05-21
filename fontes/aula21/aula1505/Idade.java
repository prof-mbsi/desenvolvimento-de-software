package aula1505;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Idade {
	
	LocalDate nascimento;
	
	public Idade(String dataDeNascimento) throws DateTimeParseException{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		nascimento = LocalDate.parse(dataDeNascimento, dtf);
		System.out.println(this.nascimento);
	}
	
	public void calculaIdade() {
		LocalDate hoje = LocalDate.now();
		System.out.println(nascimento.until(hoje).getYears());
	}
	//
}
