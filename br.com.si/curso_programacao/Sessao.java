package curso_programacao;

public class Sessao {
	
	private String duracao;
	private Pessoa instrutor;
	private Pessoa cliente;
	private Pessoa cliente2;	
	private Pessoa cliente3;
	
	public Sessao(String duracao, Pessoa instrutor, Pessoa cliente, Pessoa cliente2, Pessoa cliente3) {
		this.duracao = duracao;
		this.instrutor = instrutor;
		this.cliente = cliente;
		this.cliente2 = cliente2;
		this.cliente3 = cliente3;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Pessoa getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Pessoa instrutor) {
		this.instrutor = instrutor;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Pessoa getCliente2() {
		return cliente2;
	}

	public void setCliente2(Pessoa cliente2) {
		this.cliente2 = cliente2;
	}

	public Pessoa getCliente3() {
		return cliente3;
	}

	public void setCliente3(Pessoa cliente3) {
		this.cliente3 = cliente3;
	}

	@Override
	public String toString() {
		return "\nSessao: \n" + "Duracao da sessao: " + duracao + "\n" + instrutor + "\n" + cliente + "\n"
				+ cliente2 + "\n" + cliente3 ;
	}
	
	
	
	
}
