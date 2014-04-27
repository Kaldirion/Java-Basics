import java.util.Scanner;


public class Problem_03 {

	public static void main(String[] args) {
		// given firm has Name,Address,Telephone number, Fax number, website and manager
		// the manager has Name,LastName and Telephone Number.
		// Write program, that reads the company information and prints it out

		Scanner input = new Scanner(System.in);
		
		String FirmName = input.nextLine();
		String TelepfoneNumber = input.nextLine();
		String FaxNumber = input.nextLine();
		String ManagerFirstName = input.nextLine();
		String ManagerLastName = input.nextLine();
		String ManagerTelephoneNumber = input.nextLine();
		
		System.out.println(FirmName);
		System.out.println(TelepfoneNumber);
		System.out.println(FaxNumber);
		System.out.println(ManagerFirstName);
		System.out.println(ManagerLastName);
		System.out.println(ManagerTelephoneNumber);
	}

}
