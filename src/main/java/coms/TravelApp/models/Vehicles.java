package coms.TravelApp.models;

//CREATE TABLE Vehicles (
//	    Vid INT AUTO_INCREMENT PRIMARY KEY,
//	    VechName VARCHAR(50),
//	    VechNo VARCHAR(50),
//	    OwnerName VARCHAR(50),
//	    Seats INT,
//	    Phone VARCHAR(15)
//	);
public class Vehicles {
	
	private int Vid;
	private String VechName;
	private String VechNo;
	private String OwnerName;
	private int Seats;
	private String Phone;
	public int getVid() {
		return Vid;
	}
	public void setVid(int vid) {
		Vid = vid;
	}
	public String getVechName() {
		return VechName;
	}
	public void setVechName(String vechName) {
		VechName = vechName;
	}
	public String getVechNo() {
		return VechNo;
	}
	public void setVechNo(String vechNo) {
		VechNo = vechNo;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public int getSeats() {
		return Seats;
	}
	public void setSeats(int seats) {
		Seats = seats;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	

}
