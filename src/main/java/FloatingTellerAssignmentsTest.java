import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class FloatingTellerAssignmentsTest {
	@Test
	// invalid input for NumberOfFloatingTellers
	public void FloatingTellerInputTestNonInteger() {
		String output = null;
		try {
			int NumberOfFloatingTellers = -1;
			List<String> FloatingTellerNames = new ArrayList<String>(NumberOfFloatingTellers);
			output = "Success!";
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		assertEquals("ERROR: You did not enter an integer. Please rerun the program", output);
	}
	
	@Test
	// valid input for NumberOfFloatingTellers
	public void FloatingTellerInputTestInteger() {
		String output = null;
		try {
			int NumberOfFloatingTellers = 3;
			List<String> FloatingTellerNames = new ArrayList<String>(NumberOfFloatingTellers);
			output = "Success!";
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		assertEquals("Success!", output);
	}
	
	@Test
	// invalid input for NumberOfBranches
	public void BranchesInputTestNumberOfBranchesNonInteger() {
		String output = null;
		try {
			int NumberOfBranches = -11;
			List<String> BranchNames = new ArrayList<String>(NumberOfBranches);
			int[] BranchCustomers = new int[NumberOfBranches];
			int[] BranchTellers = new int[NumberOfBranches];
			output = "Success!";
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		assertEquals("ERROR: You did not enter an integer. Please rerun the program", output);
	}
	
	@Test
	// valid input for NumberOfBranches
	public void BranchesInputTestNumberOfBranchesInteger() {
		String output = null;
		try {
			int NumberOfBranches = 8;
			List<String> BranchNames = new ArrayList<String>(NumberOfBranches);
			int[] BranchCustomers = new int[NumberOfBranches];
			int[] BranchTellers = new int[NumberOfBranches];
			output = "Success!";
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		assertEquals("Success!", output);
	}
	
	@Test
	// invalid input for BranchCustomers
	public void BranchesInputTestBranchCustomersNonInteger() {
		String output = null;
		try {
			int NumberOfBranches = 3;
			List<String> BranchNames = new ArrayList<String>(NumberOfBranches);
			int[] BranchCustomers = new int[NumberOfBranches];
			int[] BranchTellers = new int[NumberOfBranches];
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		int BranchCustomers = -7;
		int BranchTellers = 1;
		if(BranchCustomers <= 0 || BranchTellers <= 0) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		else {
			output = "Success!";
		}
		assertEquals("ERROR: You did not enter an integer. Please rerun the program", output);
	}
	
	@Test
	// invalid input for BranchTellers
	public void BranchesInputTestBranchTellersNonInteger() {
		String output = null;
		try {
			int NumberOfBranches = 3;
			List<String> BranchNames = new ArrayList<String>(NumberOfBranches);
			int[] BranchCustomers = new int[NumberOfBranches];
			int[] BranchTellers = new int[NumberOfBranches];
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		int BranchCustomers = 256;
		int BranchTellers = -13;
		if(BranchCustomers <= 0 || BranchTellers <= 0) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		else {
			output = "Success!";
		}
		assertEquals("ERROR: You did not enter an integer. Please rerun the program", output);
	}
	
	@Test
	// invalid input for both BranchCustomers and BranchTellers
	public void BranchesInputTestBothNonInteger() {
		String output = null;
		try {
			int NumberOfBranches = 3;
			List<String> BranchNames = new ArrayList<String>(NumberOfBranches);
			int[] BranchCustomers = new int[NumberOfBranches];
			int[] BranchTellers = new int[NumberOfBranches];
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		int BranchCustomers = -256;
		int BranchTellers = -13;
		if(BranchCustomers <= 0 || BranchTellers <= 0) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		else {
			output = "Success!";
		}
		assertEquals("ERROR: You did not enter an integer. Please rerun the program", output);
	}
	
	@Test
	// valid input for both BranchCustomers and BranchTellers
	public void BranchesInputTestBothInteger() {
		String output = null;
		try {
			int NumberOfBranches = 3;
			List<String> BranchNames = new ArrayList<String>(NumberOfBranches);
			int[] BranchCustomers = new int[NumberOfBranches];
			int[] BranchTellers = new int[NumberOfBranches];
		}
		// Stop program if an integer is not input
		catch (IllegalArgumentException e) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		int BranchCustomers = 256;
		int BranchTellers = 13;
		if(BranchCustomers <= 0 || BranchTellers <= 0) {
			output = "ERROR: You did not enter an integer. Please rerun the program";
		}
		else {
			output = "Success!";
		}
		assertEquals("Success!", output);
	}
}
