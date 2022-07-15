package teste;

import entidades.Cliente;
import entidades.Funcionario;

public class TesteParteQuatro {
	public static void main(String...args) {
		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Maria", "da Silva", "masilva980@ig.com.br", false);
		
		Funcionario funcionarioUm = new Funcionario("Fulano", "de Tal", "ciclano911@empresa.com.br", true);
		Funcionario funcionarioDois = new Funcionario("Diana", "Periodico", "er981@empresa.com.br", false);

		System.out.println(clienteUm.tratarNome());
		System.out.println(clienteDois.tratarNome());
		System.out.println(funcionarioUm.tratarNome());
		System.out.println(funcionarioDois.tratarNome());
		
	}
}
