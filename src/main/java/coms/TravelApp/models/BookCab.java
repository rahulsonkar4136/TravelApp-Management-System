package coms.TravelApp.models;
//CREATE TABLE BookCab (
//	    BookID INT AUTO_INCREMENT PRIMARY KEY,
//	    Date DATE,
//	    FromLocation VARCHAR(50),
//	    ToLocation VARCHAR(50),
//	    VechNo VARCHAR(50),
//	    CustomerName VARCHAR(100),
//	    Phone VARCHAR(15)

public class BookCab {
	private int BookId;
	private String Date;
	private String FromLoc;
	private String ToLoc;
	private String VechNo;
	private String CustomerName;
	private int Phone;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getFromLoc() {
		return FromLoc;
	}
	public void setFromLoc(String fromLoc) {
		FromLoc = fromLoc;
	}
	public String getToLoc() {
		return ToLoc;
	}
	public void setToLoc(String toLoc) {
		ToLoc = toLoc;
	}
	public String getVechNo() {
		return VechNo;
	}
	public void setVechNo(String vechNo) {
		VechNo = vechNo;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	
	
	
	

}
