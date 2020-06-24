package curso_programacao;

public class Cliente extends Pessoa{
	
	//RELACIONAMENTO 
	private Equipamento equipamento;

	public Cliente(String nome, int idade, Equipamento equipamento) {
		super(nome, idade);
		this.equipamento = equipamento;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	@Override
	public String toString() {
		return "\n" + "Cliente: " + super.toString() + " Equipamento usado: "+equipamento;
	}
	
	
	

}
