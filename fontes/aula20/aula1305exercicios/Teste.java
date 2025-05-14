package aula1305exercicios;

public class Teste {
	
	int x;
	
	public int getX() {
		try {
			return x;
		} catch(Exception e) {
			System.err.println("ok!");
		} finally {
			System.out.println("Bloco finally foi executado!");
		}
		return 0;
		
	}

}
