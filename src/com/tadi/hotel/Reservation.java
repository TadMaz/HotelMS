package com.tadi.hotel;

public class Reservation {
/** An object of this class represents a reservation*/
	
	private int resID;
	private String name;
	private Date date;
	private Contact contact;
	private int roomNum;
	private String specialReq;
	
	public Reservation(int resID,String name,Date date,Contact contact, int roomNum,String specialReq){
		
		this.resID = resID;
		this.name = name;
		this.date = date;
		this.contact = contact;
		this.roomNum = roomNum;
		this.specialReq = specialReq;
	}

	public int getResID() {
		return resID;
	}

	public void setResID(int resID) {
		this.resID = resID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getSpecialReq() {
		return specialReq;
	}

	public void setSpecialReq(String specialReq) {
		this.specialReq = specialReq;
	}
	
}
