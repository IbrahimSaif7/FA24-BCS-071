public class Main{

	public static void main(String args[]){


		Ticket ticket = new Ticket(10, new Customer(2, "Maryam", "030023424", "sdfioafe@gmail.com"), 3, 2, "movie one", 20.0);

		Cinema cinema = new Cinema("Cinepax", "gulberg", 5);
		
		ticket.displayTicket();

		System.out.println("");
		cinema.displayCinema();
	}







}