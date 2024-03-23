package coms.TravelApp.models;

//CREATE TABLE CabFares (
//	    ID INT AUTO_INCREMENT PRIMARY KEY,
//	    FromLocation VARCHAR(50),
//	    ToLocation VARCHAR(50),
//	    Fare DECIMAL(10, 2)
//	);


public class CabFares {
	
	private int Id;
	private String FromLocation;
	private String ToLocation;
	private float Fare;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFromLocation() {
		return FromLocation;
	}
	public void setFromLocation(String fromLocation) {
		FromLocation = fromLocation;
	}
	public String getToLocation() {
		return ToLocation;
	}
	public void setToLocation(String toLocation) {
		ToLocation = toLocation;
	}
	public float getFare() {
		return Fare;
	}
	public void setFare(float fare) {
		Fare = fare;
	}
	
	

}
