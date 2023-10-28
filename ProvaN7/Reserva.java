package ProvaN7;

import java.util.List;

public class Reserva {
	private String data;
	private Funcionario funcionario;
	private List<Quarto> quarto;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	
	public Reserva(String data, Funcionario funcionario, List<Quarto> quarto) {
		super();
		this.data = data;
		this.funcionario = funcionario;
		this.quarto = quarto;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public List<Quarto> getQuarto() {
		return quarto;
	}
	public void setQuarto(List<Quarto> quarto) {
		this.quarto = quarto;
	}
}
