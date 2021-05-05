import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Programmed by Jacob Roberson
/**
 * @author Jacob Roberson This program is used to assign floating tellers to
 *         branches based on need.
 */
public class FloatingTellerAssignments {
	// Initialize scanner
	Scanner sc = new Scanner(System.in);
	// Initialize variables
	// Number of Floating Tellers available
	int NumberOfFloatingTellers = 0;
	// Number of Branches
	int NumberOfBranches = 0;
	// An integer to be used in loops and for tracking indices
	int i = 0;

	// Stores the names of the Floating Tellers
	List<String> FloatingTellerNames;
	// Stores the names of the Branches
	List<String> BranchNames;
	// Stores the number of average customers for each branch
	int[] BranchCustomers;
	// Stores the number of tellers already working at each branch
	int[] BranchTellers;

	// Introduction Script that runs at the start of the program
	public void IntroScript() {
		System.out.println("Welcome to the Floating Teller Assignment Program");
		System.out.println(
				"Please enter the requested information when prompted in order to generate the floating teller assignments");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------\n");
	}

	// Collects user input regarding floating tellers
	public void FloatingTellerInput() {
		// Receive input from user on the number of available floating tellers
		System.out.println("Please enter the number of Floating Tellers available on this day: ");
		NumberOfFloatingTellers = Integer.parseInt(sc.nextLine());
		FloatingTellerNames = new ArrayList<String>(NumberOfFloatingTellers);

		// Receive input from user on the names of the floating tellers
		for (i = 0; i < NumberOfFloatingTellers; i++) {
			System.out.println("Please enter a name to assign to Floating Teller " + (i + 1) + ": ");
			FloatingTellerNames.add(sc.nextLine());
		}

		// Display the data entered
		System.out.println("\nData Entered:");
		for (i = 0; i < NumberOfFloatingTellers; i++) {
			System.out.println("Floating Teller " + (i + 1) + " is: " + FloatingTellerNames.get(i));
		}
	}

	// Collects user input regarding branches
	public void BranchesInput() {
		// Receive input from user on the number of Branches
		System.out.println("\nPlease enter the number of branch locations: ");
		NumberOfBranches = Integer.parseInt(sc.nextLine());
		BranchNames = new ArrayList<String>(NumberOfBranches);
		BranchCustomers = new int[NumberOfBranches];
		BranchTellers = new int[NumberOfBranches];

		// Receive input from user on the information for the branches
		for (i = 0; i < NumberOfBranches; i++) {
			System.out.println("Please enter a name to assign to Branch " + (i + 1) + ": ");
			BranchNames.add(sc.nextLine());
			System.out.println("How many customers does " + BranchNames.get(i)
					+ " have on average each day? (Please enter a whole number)");
			BranchCustomers[i] = Integer.parseInt(sc.nextLine());
			System.out.println("How many tellers does " + BranchNames.get(i)
					+ " have working on this day? (Please enter a whole number)");
			BranchTellers[i] = Integer.parseInt(sc.nextLine());
		}

		// Display the data entered
		System.out.println("\nData Entered:");
		for (i = 0; i < NumberOfBranches; i++) {
			System.out.println("Branch " + (i + 1) + " is: " + BranchNames.get(i) + "\n" + BranchNames.get(i) + " has "
					+ BranchCustomers[i] + " customers on average each day.\n" + BranchNames.get(i) + " has "
					+ BranchTellers[i] + " tellers on this day.");
		}
	}

	// Calculates the average number of customers per teller for each branch and
	// assigns floating tellers
	public void MakeAssignments() {

	}

	// Main Method
	public static void main(String[] args) {
		FloatingTellerAssignments fta = new FloatingTellerAssignments();
		fta.IntroScript();
		fta.FloatingTellerInput();
		fta.BranchesInput();
		fta.MakeAssignments();
	}
}
