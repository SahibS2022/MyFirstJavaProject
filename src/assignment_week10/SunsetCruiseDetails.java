package assignment_week10;

public class SunsetCruiseDetails extends BookingCruise {
	String cruiseName;
	double priceAdult;
	double priceChild;
	double priceEvent;
	int noOfDays;
	String eventName;// candle Light Dinner

	public SunsetCruiseDetails(String cruiseName, double priceAdult, double priceChild, double priceEvent, int noOfDays,
			String eventName) {
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.priceEvent = priceEvent;
		this.noOfDays = noOfDays;
		this.eventName = eventName;
	}

	public String getCruiseName() {
		return this.cruiseName;
	}

	public double getPriceAdults() {
		return this.priceAdult;
	}

	public double getPriceChilds() {
		return this.priceChild;
	}

	public double getPriceEvent() {
		return this.priceEvent;
	}

	public int getNoOfDays() {
		return this.noOfDays;
	}

	public String getEventName() {
		return this.eventName;
	}
}
