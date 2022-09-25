package com.greatLearning.model;

import java.util.Scanner;

public class Employee {
	private String firstname, lastname;
	Scanner sc = new Scanner(System.in);

	public void Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;

	}

	public void display() {
		System.out.println("dear " + firstname + " your generated credentials are");
	}

}
