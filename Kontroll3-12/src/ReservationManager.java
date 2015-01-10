
public class ReservationManager {
	private PerformanceList pl;
	private ReservationList rl;
	
	public ReservationManager(PerformanceList pl, ReservationList rl){
		this.pl = pl;
		this.rl = rl;
	}
	
	public void makeReservation(String time, int tickets){
		Performance perf = pl.findPerformance(time);
		if( perf == null){
			System.out.println("Ingen sådan föreställning");
		} else {
			if(perf.getTicketsLeft < tickets){
				System.out.println("För få biljetter kvar");
			} else {
				System.out.println(rl.insertReservation(tickets, perf));
			}
		}
	}
	
	public void printTickets(int reservationNumber){
		Reservation res = rl.find(reservationNumber);
		if(res == null){
			System.out.println("Ingen sådan bokning");
		} else {
			for(int i = 0; i < res.getNbrTickets(); i++){
				res.printOneTicket();
			}
			rl.delete(res);
		}
	}
}
