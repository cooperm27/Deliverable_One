import java.util.Scanner;

public class VacationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		System.out.println("What kind of trip would you like to go on, musical, tropical, or adventurous?");	
		
		String tripType = scnr.nextLine();
		
		if (tripType.equalsIgnoreCase ("tropical")) {
			System.out.println("How many are in your group?");
		}
		else if (tripType.equalsIgnoreCase ("musical")) {
			System.out.println("How many are in your group?");
		}
		else if (tripType.equalsIgnoreCase ("adventurous")) {
			System.out.println("How many are in your group?");
		}
		else 
			{System.out.println("Please choose only Musical, Tropical, or Adventurous");	
		}
	
		int groupSize = scnr.nextInt();
		
		if (groupSize <=2 && tripType.equalsIgnoreCase("tropical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a tropical vacation, you should take a first class flight to a beach vacation in Mexico");	
		}
		else if (groupSize ==3 && tripType.equalsIgnoreCase("tropical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a tropical vacation, you should take a helicopter to a beach vacation in Mexico");
		}
		else if (groupSize ==4 && tripType.equalsIgnoreCase("tropical")) {
			System.out.println("Since you’re a group of 4 going on a tropical vacation, you should take a helicopter to a beach vacation in Mexico");
		}
		else if (groupSize ==5 && tripType.equalsIgnoreCase("tropical")) {
			System.out.println("Since you’re a group of 5 going on a tropical vacation, you should take a helicopter to a beach vacation in Mexico");
		}
		else if (groupSize >=6 && tripType.equalsIgnoreCase("tropical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a tropical vacation, you should take a charter flight to a beach vacation in Mexico");
		}
		else if (groupSize <=2 && tripType.equalsIgnoreCase("musical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a musical vacation, you should take a first class flight to New Orleans");	
		}
		else if (groupSize ==3 && tripType.equalsIgnoreCase("musical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a musical vacation, you should take a helicopter to New Orleans");	
		}
		else if (groupSize ==4 && tripType.equalsIgnoreCase("musical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a musical vacation, you should take a helicopter to New Orleans");	
		}
		else if (groupSize ==5 && tripType.equalsIgnoreCase("musical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a musical vacation, you should take a helicopter to New Orleans");	
		}
		else if (groupSize >=6 && tripType.equalsIgnoreCase("musical")) {
			System.out.println("Since you’re a group of " + groupSize + " going on a musical vacation, you should take a charter flight to New Orleans");	
		}
		else if (groupSize <=2 && tripType.equalsIgnoreCase("adventurous")) {
			System.out.println("Since you’re a group of " + groupSize + " going on an adventurous vacation, you should take a first class flight to go white water rafting the Grand Canyon");	
		}
		else if (groupSize ==3 && tripType.equalsIgnoreCase("adventurous")) {
			System.out.println("Since you’re a group of " + groupSize + " going on an adventurous vacation, you should take a helicopter to go white water rafting the Grand Canyon");	
		}
		else if (groupSize ==4 && tripType.equalsIgnoreCase("adventurous")) {
			System.out.println("Since you’re a group of " + groupSize + " going on an adventurous vacation, you should take a helicopter to go white water rafting the Grand Canyon");	
		}
		else if (groupSize ==5 && tripType.equalsIgnoreCase("adventurous")) {
			System.out.println("Since you’re a group of " + groupSize + " going on an adventurous vacation, you should take a helicopter to go white water rafting the Grand Canyon");	
		}
		else if (groupSize >=6 && tripType.equalsIgnoreCase("adventurous")) {
			System.out.println("Since you’re a group of " + groupSize + " going on an adventurous vacation, you should take a charter flight to go white water rafting the Grand Canyon");	
		}
	}	
	
	
	}