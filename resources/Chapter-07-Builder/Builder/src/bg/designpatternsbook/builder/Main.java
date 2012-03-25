package bg.designpatternsbook.builder;

import java.util.GregorianCalendar;

public class Main {
	
	public static void main(String [ ] args) {	
		FlightSearch search = new FlightSearch.Builder("Sofia", "Paris")
		    .numOfAdultPassangers(2)
			.departureDate(new GregorianCalendar(2012, 2, 5).getTime())
			.returnDate(new GregorianCalendar(2012, 2, 10).getTime())
			.buildSearch();
	}

}
