package userInput;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the applicant age : ");
		int age = Sc.nextInt();
		
		String CanIvote = age >= 18 ? "Yes" : "no";
		System.out.println(CanIvote);
		Sc.close();

	}

}
