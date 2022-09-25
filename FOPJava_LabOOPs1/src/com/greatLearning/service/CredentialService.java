package com.greatLearning.service;
import  com.greatLearning.model.Employee;


import java.util.Random;
import java.util.Scanner;

public class CredentialService {
	
	private static String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	private static String specialCharacters = "!@#$";
	private static String numbers = "1234567890";
	Employee e = new Employee();
	
	String a = null, b = null;

	public char[] generatePassword(int length) {
		
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}

	public void generateEmail() {
		int x;
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the department from the following \n" + "1-Technical \n" + "2-admin \n"
				+ "3-human resourse \n" + "4-legal \n");
		do {
			x = sc.nextInt();

			switch (x) {
			case 1:
				e.display();
				System.out.println("Email----->" + a + b + "@tech.abc.com");

				break;

			case 2:
				e.display();
				System.out.println("Email----->" + a + b + "@admin.abc.com");

				break;

			case 3:
				e.display();
				System.out.println("Email----->" + a + b + "@hr.abc.com");

				break;

			case 4:
				e.display();
				System.out.println("Email----->" + a + b + "@legal.abc.com");

				break;

			default:
				System.out.println("enter a valid option");
				break;

			}

		} while (x < 1 || x > 4);

	}

	public void showCredentials() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your first name");
		a = sc.nextLine();
		System.out.println("enter your last name");
		b = sc.nextLine();

		e.Employee(a, b);

		generateEmail();
		
		System.out.print("password-->");
		System.out.println(generatePassword(8));

	}

}
