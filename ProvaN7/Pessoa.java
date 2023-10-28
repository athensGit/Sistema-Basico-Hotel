package ProvaN7;

import java.util.List;

public class Pessoa {
	protected String nome;
	protected String rg;
	protected List<Reserva> reserva;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String rg, List<Reserva> reserva) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.reserva = reserva;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public List<Reserva> getReserva() {
		return reserva;
	}
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
}
