package com.tadi.hotel;

public interface Database {


	public boolean addReservation(Reservation res) throws DatabaseException;
	
	public boolean deleteReservation(String resID) throws DatabaseException;
}
