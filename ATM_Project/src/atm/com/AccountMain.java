package atm.com;
import java.text.DecimalFormat;
import java.util.*;
public class AccountMain extends Account {
      static Scanner sc=new Scanner(System.in);
      static DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
     public static HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
     Account account=new Account();
	   public void login() {
		    System.out.println("Welcome to the ATM Project!");
		    data.put(123456789, 1234);
			data.put(123456780, 1230);
			
			System.out.print("Enter Your Customer Number: ");
			account.setCustomerNumber(sc.nextInt());

			System.out.print("Enter Your Pin Number: ");
			account.setPinNumber(sc.nextInt());
			menu();
     }
         	   
		 public void menu() {
		 System.out.println("Checking Account: ");
		 System.out.println("Type 1 - View Balance");
		 System.out.println("Type 2 - Withdraw money");
		 System.out.println("Type 3 - Deposit money");
		 System.out.println("Type 4 - Exit");
		 System.out.print("Choice: ");
		 int option=sc.nextInt();
		 switch(option) {
		 case 1:
				System.out.println("Saving Account Balance: " + moneyFormat.format(account.getSavingBalance()) + "\n");
				menu();
				break;

			case 2:
				account.getSavingWithdrawInput();
				menu();
				break;

			case 3:
				account.getSavingDepositInput();
				menu();
				break;

			case 4:
				System.out.println("Thank You for using this ATM, bye.");
				break;

			default:
				System.out.println("\n" + "Invalid choice." + "\n");
			}
	    }
    }		 

	

