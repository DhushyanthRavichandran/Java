package edu.kec.choiceselection;

import java.util.Scanner;

public class choicesSelction extends pin_and_menu {
	private static int existing_pin = 2345;
	private static int balance = 23000;
	private pin_and_menu pm = new pin_and_menu();

	private Scanner scan = new Scanner(System.in);

	public void pinchange() {

		pin_verification(existing_pin);
		existing_pin = pm.reset_password(existing_pin);
		showmenu();

	}

	public void balanceInquiry() {
		pin_verification(existing_pin);
		balance(balance);

	}

	public void withdrawal() {
		pin_verification(existing_pin);
		balance = withdraw(balance);
		showmenu();

	}

	public void exit() {
		System.out.println("you choose exit");
		scan.close();
		System.exit(0);
	}
}
