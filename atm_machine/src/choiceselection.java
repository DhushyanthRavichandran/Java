
import java.util.Scanner;

public class choicesSelction {
	public void pinchange() {
		Scanner scan = new Scanner(System.in);
		Integer pin = scan.nextInt();

		Integer existing_pin = 2345;
		if (pin == existing_pin) {
			System.out.println("enter new pin");
			pin = scan.nextInt();
		} else {
			System.out.println("invalid pin");
			System.exit(0);
		}

	}

	public void balanceInquiry() {
		Scanner scan = new Scanner(System.in);
		Integer pin = scan.nextInt();
		Integer balance = 23000;
		Integer existing_pin = 2345;
		if (pin == existing_pin) {
			System.out.println("your balance is :" + balance);
		} else {
			System.out.println("invalid pin");

			System.exit(0);
		}
	}

	public void withdrawal()
	{
		Scanner scan = new Scanner(System.in);
		Integer pin = scan.nextInt();
		Integer existing_pin = 2345;
		Integer balance = 23000;
		Integer withdrawal;
			
		if (pin == existing_pin){
			System.out.println("enter the amount to withdraw");
			withdrawal=scan.nextInt();
			
			if (withdrawal< balance ) {
				balance=balance-withdrawal;
			}
			else {
				System.out.println("Insufficient balance");
				System.exit(0);
				}
		}
			else {
				System.out.println("invalid pin");
               System.exit(0);
			}
				
				
		}
	public void exit()
	{
		System.out.println("you choose exit");
		System.exit(0);
	}
}
	
		

public class choiceselection {

}
