package curso_programacao;

public class Academia {

	public static void main(String[] args) {

		Equipamento halteres = new Equipamento("Halteres");
		Equipamento estacao = new Equipamento("Estacao de musculacao");
		Equipamento esteira = new Equipamento("Esteira");
		
		Pessoa igor = new Instrutor("Igor Silva", 35);
		
		Pessoa carla = new Cliente("Carla Souza", 27, esteira);
		Pessoa sara = new Cliente("Sara Almeida", 18, esteira);	
		Pessoa julia = new Cliente("Julia Santos", 32, esteira);
		
		Pessoa andre = new Cliente("Andre Soares", 42, halteres);
		Pessoa joao = new Cliente("Joao Brito", 20, estacao);	
		Pessoa jose = new Cliente("Jose Pereira", 32, halteres);	
		
		
		
		Sessao sabado = new Sessao("2h", igor, carla, sara, julia);
		System.out.println(sabado.toString());
		
		Sessao sexta = new Sessao("3h", igor, andre, joao, jose);
		System.out.println(sexta.toString());	
		
	}

}
