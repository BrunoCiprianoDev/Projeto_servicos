package entidades;

public class Funcionario extends Pessoa {
	private static int parametroCodigoFuncionario = 0;
	private String codigoFuncionario;
	
	public Funcionario(String nome, String sobrenome, String email, boolean sexo) {
		super(nome, sobrenome, email, sexo);
		this.codigoFuncionario = "F"+(++parametroCodigoFuncionario);
	}
	
	public Funcionario(Funcionario funcionario) {
		super(funcionario);
		this.codigoFuncionario = funcionario.codigoFuncionario;
	}
	
	public String getCodigoFuncionario() {
		return this.codigoFuncionario;
	}
	
	@Override
	public String toString() {
		return "\n Código do funcionario: "+this.codigoFuncionario+
				"\n Nome do funcionario: "+super.getNome()+" "+super.getSobrenome()+
				"\n E-mail: "+super.getEmail()+
				"\n Sexo: "+super.getSexo();
	}

	@Override
	public String tratarNome() {
			return (this.getSexo()==true) ? 
					"Prezado senhor "+this.getNome()+" "+this.getSobrenome() :
					"Prezada senhora "+this.getNome()+" "+this.getSobrenome() ;
	}
	
}
