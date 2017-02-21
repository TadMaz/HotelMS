package com.tadi.hotel;

public class Date {
	
/**An object of this class represents the date*/
	private DayOfWeek day;
	private Month month;
	private int year;
	
	public Date(DayOfWeek day, Month month,int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}


	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
}
