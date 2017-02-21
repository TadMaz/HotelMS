package com.tadi.test;

import java.util.Scanner;
import com.tadi.hotel.Hotel;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		while (true) {
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			System.out.println("Enter phone number: ");
			String number = sc.nextLine();
			
			try{
				hotel.addReservation(name, number);
			}
			catch (Exception e){
				System.out.println(e.getMessage());
				break;
			}
		}
	}
}
