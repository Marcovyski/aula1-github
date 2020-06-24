package curso_programacao;

public class Equipamento {

	private String nome;
	
	public Equipamento() {
	}

	public Equipamento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return  nome;
	}
	
	
}
