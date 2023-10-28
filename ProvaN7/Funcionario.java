package ProvaN7;

import java.util.List;

public class Funcionario extends Pessoa{
	private String setor;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	
	public Funcionario(String nome, String rg, List<Reserva> reserva, String setor) {
		super(nome, rg, reserva);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
