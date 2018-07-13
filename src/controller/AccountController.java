package controller;

import javax.swing.JOptionPane;
import domain.AccountBean;
import domain.MinusAccountBean;
import service.*;
import seviceImpl.AccountserviceImpl;

enum Accbutton{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT,
	DPOSITE,
	WITHDRAW,
	LIST,
	FIND_BY_ID,
	FIND_BY_NAME,
	MINUS_LIST,
	CHANGE_PASS,
	DELETE_ACCOUNT
};
public class AccountController {
	public static void main(String[] args) {
		AccountBean account;
		Accountservice service = new AccountserviceImpl();
		while(true) {
		
			switch((Accbutton) JOptionPane.showInputDialog(null, // frame
					"Select function", // frame title
					"AccountMenu", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					new Accbutton[] {Accbutton.EXIT,
					Accbutton.ACCOUNT,
					Accbutton.MINUS_ACCOUNT,
					Accbutton.DPOSITE,
					Accbutton.WITHDRAW,
					Accbutton.LIST,
					Accbutton.FIND_BY_ID,
					Accbutton.FIND_BY_NAME,
					Accbutton.MINUS_LIST,
					Accbutton.CHANGE_PASS,
					Accbutton.DELETE_ACCOUNT}, // Array of choices
					null // default
							)) {
			case EXIT : return;
			case ACCOUNT :
				
				break;
			case MINUS_ACCOUNT : 
				
				break;
			case DPOSITE : 
				break;
			case WITHDRAW : 
				break;
			case LIST : 
				
				break;
			case FIND_BY_ID : 
			
				
				break;
			case FIND_BY_NAME :
				
				break;
			case MINUS_LIST: 
				
				break;
			case CHANGE_PASS : 
				
				break;
			case DELETE_ACCOUNT : 
				
				break;
			default : break;
			}
		}
	}
}
