package ProvaN7;

public class Quarto {
	private String tipo;
	private int numeroDoQuarto;
	private Hotel hotel;
	
	public Quarto() {
		// TODO Auto-generated constructor stub
	}
	
	public Quarto(String tipo, int numeroDoQuarto, Hotel hotel) {
		super();
		this.tipo = tipo;
		this.numeroDoQuarto = numeroDoQuarto;
		this.hotel = hotel;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}
	public void setNumeroDoQuarto(int numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
