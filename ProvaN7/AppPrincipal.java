package ProvaN7;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
public static void main(String[] args) {
		
		Hotel hotel1 = new Hotel("Space Hostel");
		
		Quarto quarto1 = new Quarto("Duplo", 05, hotel1);
		Quarto quarto2 = new Quarto("Simples", 02, hotel1);
		Quarto quarto3 = new Quarto("Duplo", 03, hotel1);
		Quarto quarto4 = new Quarto("Simples", 04, hotel1);
		
		List<Quarto> quartosHotel1 = new ArrayList<Quarto>();
		quartosHotel1.add(quarto1);
		quartosHotel1.add(quarto2);
		
		List<Quarto> quartosHotel2 = new ArrayList<Quarto>();
		quartosHotel2.add(quarto3);
		quartosHotel2.add(quarto4);
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Paulo");
		funcionario1.setRg("123456789");
		funcionario1.setSetor("Recepção");
		
		Reserva reserva1 = new Reserva("25/09/2023", funcionario1, quartosHotel1);
		Reserva reserva2 = new Reserva("28/09/2023", funcionario1, quartosHotel2);
		
		List<Reserva> reservasCliente1 = new ArrayList<Reserva>();
		reservasCliente1.add(reserva1);
		reservasCliente1.add(reserva2);
		
		funcionario1.setReserva(reservasCliente1);
		
		Cliente cliente0 = new Cliente("Santos", "987654321", reservasCliente1, 4);
		
		System.out.println("Nome do cliente: " + cliente0.getNome() + "\n" +
				"Rg do cliente: " + cliente0.getRg() + "\n" +
				"Quantidade de ocupações do cliente: " + cliente0.getQuantidadeOcupacoes() + "\n" +
				"Hotel de hospedagem: " + hotel1.getNome() + "\n" + "---------------------" + "\n" + "Detalhes da hospedagem:");
		for (Reserva reserva : cliente0.getReserva()) {
			System.out.println("Data da reserva: " + reserva.getData() + "\n" + "Funcionário: " + reserva.getFuncionario().getNome());
			for (Quarto detalhes : reserva.getQuarto()) {
				System.out.println("Nº do quarto: " + detalhes.getNumeroDoQuarto() + "\n" + 
				"Tipo do quarto: " + detalhes.getTipo() + "\n" + "---------------------------");
			}
		}
		}
}
