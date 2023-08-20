import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
public class PateintTest {
	private Patient patient;
	@BeforeEach
	
	public void setter() {
		
		patient  = new Patient(5,10);
		patient.setFirstName("John");
		patient.setLastName("Wick");
		patient.setPatientId(UUID.randomUUID());
	}
	@Test
	public void testExposure() {
		Exposure exposure = new Exposure();
		patient.addExposure(exposure);
		Exposure[] exposures= patient.getExposures();
		assertEquals(1,exposures.length);
		assertEquals(exposure,exposures[0]);
	}
	@Test
   public void testAddDisease() {
        UUID diseaseId = UUID.randomUUID();
        patient.addDisease(diseaseId);
        UUID[] diseaseIds = patient.getDiseaseIds();
        assertEquals(1, diseaseIds.length);
        assertEquals(diseaseId, diseaseIds[0]);
    }
	
	@Test
	public void testPatientDetails() {
		 String expectedOutput = "Patient ID: " + patient.getPatientId() + "\n" +
                 "First Name: John\n" +
                 "Last Name: wick\n" +
                 "Exposures: 0\n" + 
                 "Diseases: 0\n";
	}
	@Test
    private String getPrintedOutput(Runnable action) {
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            action.run();
            return outputStream.toString().trim();
        } finally {
            System.setOut(originalOut);
        }
    }

}
