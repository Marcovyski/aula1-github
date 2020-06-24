package curso_programacao;

public class Instrutor extends Pessoa implements Carteira{
	
	private Carteira codigo;
	
	public Instrutor(String nome, int idade) {
		super(nome, idade);
	}

	public Carteira getCodigo() {
		return codigo;
	}

	public void setCodigo(Carteira codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nInstrutor: " + super.toString() + " Codigo da Carteirinha: " + codigoconfef;
	}

}
