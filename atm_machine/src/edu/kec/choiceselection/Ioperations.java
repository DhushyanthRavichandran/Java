package edu.kec.choiceselection;

public interface Ioperations {
	void showmenu() ;
	boolean pin_verification(int existing_pin);
	int reset_password(int existing_pin);
    void balance(int balance);
	int withdraw(int balance);
}
