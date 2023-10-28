package ProvaN7;

import java.util.List;

public class Cliente extends Pessoa{
	private int quantidadeOcupacoes;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nome, String rg, List<Reserva> reserva, int quantidadeOcupacoes) {
		super(nome, rg, reserva);
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}

	public int getQuantidadeOcupacoes() {
		return quantidadeOcupacoes;
	}

	public void setQuantidadeOcupacoes(int quantidadeOcupacoes) {
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}
}
