package atm_machine;

import java.util.Scanner;
import edu.kec.choiceselection.choicesSelction;

public class choice extends choicesSelction {

	public void choicelist() {
		choicesSelction choices = new choicesSelction();
		Scanner scan = new Scanner(System.in);
		Integer choice = scan.nextInt();
		switch (choice) {
		case 1:

			System.out.println("You selected Pin Change");
			choices.pinchange();
			break;
		case 2:

			System.out.println("You selected Balance Inquiry");
			choices.balanceInquiry();
			break;
		case 3:

			System.out.println("You selected Withdrawal");
			choices.withdrawal();
			break;
		case 4:

			System.out.println("Exiting program");
			choices.exit();
			break;
		default:

			System.out.println("Invalid choice. Please choose a valid option.");
			scan.close();

		}

	}
}