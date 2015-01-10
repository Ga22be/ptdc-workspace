import java.util.ArrayList;

public class ReservationList {
	private ArrayList<Reservation> resList;
	private int reservationNumber;
	
	public ReservationList(){
		resList = new ArrayList<Reservation>();
		reservationNumber = 0;
	}
	
	public Reservation find(int reservationNbr){
		for(int i = 0; i < resList.size(); i++){
			if(resList.get(i).getReservationNumber() == reservationNbr){
				return resList.get(i);
			}
		}
		return null;
	}
	
	public int insertReservation(int tickets, Performance perf){
			reservationNumber += 1;
			perf.reserveTickets(tickets);
			Reservation res = new Reservation(reservationNumber, tickets, perf);
			resList.add(res);
			return reservationNumber;
	}
	
	public void delete(Reservation r){
		for(int i = 0; i < resList.size(); i++){
			if(resList.get(i).equals(r)){
				resList.remove(i);
			}
		}
	}
}
