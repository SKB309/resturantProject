package RestuPackage;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
	
	private String name;
    private String phoneNumber;
    private LocalDate date;
    private LocalTime time;
    private int numGuests;
    
    
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public int getNumGuests() {
		return numGuests;
	}
	public void setNumGuests(int numGuests) {
		this.numGuests = numGuests;
	}
	public void addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		
	}

}
