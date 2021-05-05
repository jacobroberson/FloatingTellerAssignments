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
}
