public class DayBookings {
	private boolean[] booked;
	private String day;
	private String room;

	/**
	 * Skapar ett objekt som h�ller reda p� vilka tider som salen room �r bokade
	 * under dagen day. Fr�n b�rjan �r inga tider bokade
	 */
	public DayBookings(String room, String day) {
		this.room = room;
		this.day = day;
		booked = new boolean[24];
	}

	/** Tar reda p� salen */
	public String getRoom() {
		return room;
	}

	/** Tar reda p� dagen */
	public String getDay() {
		return day;
	}

	/** Returnerar true om salen �r bokad under timmen hour, false annars */
	public boolean isBooked(int hour) {
		return booked[hour];
	}

	/**
	 * Unders�ker f�rst om salen �r ledig under alla timmarna start..finish. I
	 * s� fall bokas alla timmarna och returneras true. I annat fall bokas
	 * ingenting och returneras false
	 */
	public boolean book(int start, int finish) {
		boolean free = true;
		for (int i = start; i <= finish; i++) {
			if (isBooked(i)) {
				return false;
			}
		}
		for (int i = start; i <= finish; i++) {
			booked[i] = true;
		}
		return true;

	}
}
