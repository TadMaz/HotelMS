package com.tadi.hotel;

public class Hotel {

	Database database;
	
	
	public Hotel() {
		// TODO Auto-generated constructor stub
		database = new MySQLDatabase();
	}
	
	public void addReservation(String name, String number) throws HotelException {
		// TODO Auto-generated method stub
		
		// TODO verify that info is correct
		// verify your data
		// if its incorrect, throw HotelException
		// throw new HotelException("phone numer must be 8 chars long.");
		// TODO add to database
		
		Reservation res = new Reservation(resID, name, date, contact, roomNum, specialReq);
		database.add(res);
		
	}
	
	/**
	 * 
	 * @param resID
	 * @throws HotelException
	 */
	public void deleteReservation(String resID) throws HotelException{
		
	}
		
}
