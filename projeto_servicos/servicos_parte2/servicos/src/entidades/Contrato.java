package entidades;

import java.time.LocalDate;

public class Contrato {
	
	private static LocalDate parametroData = LocalDate.now();
	private static int parametroCodigo = 0;
	private String codigoPrestacaoServico;
	private int anoInicioContrato;
	private int mesInicioContrato;
	private Servico servico;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public Contrato(Servico servico, Cliente cliente, Funcionario funcionario) {
		this.gerarNumeroPrestacaoServico();
		this.mesInicioContrato = Contrato.parametroData.getMonthValue();
		this.anoInicioContrato = Contrato.parametroData.getYear(); 
		this.servico = servico;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}
	
	private void gerarNumeroPrestacaoServico() {
		if(Contrato.parametroData.getYear() != LocalDate.now().getYear()) {
			Contrato.parametroData = LocalDate.now();
			Contrato.parametroCodigo = 0;
		}
		this.codigoPrestacaoServico = Contrato.parametroData.getYear()+"-"+(++Contrato.parametroCodigo);	
	}
	
	public String getCodigoPrestacaoServico() {
		return this.codigoPrestacaoServico;
	}

	public int getAnoInicioContrato() {
		return anoInicioContrato;
	}

	public int getMesInicioContrato() {
		return mesInicioContrato;
	}
	
	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "\n Código de prestação serviço: "+this.codigoPrestacaoServico+
				"\n Mês de inicio do contrato: "+this.mesInicioContrato+
				"\n Ano de inicio do contrato: "+this.anoInicioContrato+
				"\n"+cliente.toString()+
				"\n"+funcionario.toString()+
				"\n"+servico.toString();
	}

}
