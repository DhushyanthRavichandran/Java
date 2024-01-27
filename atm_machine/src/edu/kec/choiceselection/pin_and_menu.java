package edu.kec.choiceselection;

import java.util.Scanner;

import atm_machine.choice;
import atm_machine.menu;

public class pin_and_menu implements Ioperations {

	private Scanner scan = new Scanner(System.in);
	private static menu menu = new menu();
	private static choice choice = new choice();

	@Override
	public void showmenu() {
		menu.menubar();
		choice.choicelist();
	}

	@Override
	public boolean pin_verification(int existing_pin) {

		System.out.println("enter your pin");
		Integer pin1 = scan.nextInt();
		if (existing_pin == pin1) {
			return true;
		} else {
			System.out.println("invalid pin");
			showmenu();
			return false;
		}

	}

	@Override
	public int reset_password(int existing_pin) {

		System.out.println("enter new password");

		Integer pin1 = scan.nextInt();

		int new_pin = pin1;
		System.out.println("pin is successfully changed");
		return new_pin;
	}

	@Override
	public void balance(int balance) {
		{
			System.out.println("your account balance is " + balance);
			showmenu();
		}
	}

	@Override
	public int withdraw(int balance) {
		System.out.println("enter the amount to be debited");
		Integer amount = scan.nextInt();
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("successfully debited");
			System.out.println("your current balance= " + balance);
			return balance;
		} else {
			System.out.println("Insufficient balance");
			showmenu();
			return 0;
		}
	}
}
