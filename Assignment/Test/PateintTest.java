package edu.disease.asn1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;
import edu.disease.asn1.Patient;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



public class PateintTest {
	
	private Patient patient;
	@BeforeEach
	
	public void setter() {
		
		patient  = new Patient(5,10);
		patient.setFirstName("John");
		patient.setLastName("Wick");
		patient.setPatientId(UUID.randomUUID());
		Exposure exposure = new Exposure();
	    patient.addExposure(exposure);
	    UUID diseaseId = UUID.randomUUID();
	    patient.addDisease(diseaseId);
	}
	
	@Test
	void testconstructorinvalidvalues() {
		assertThrows(IllegalArgumentException.class,()->new Patient(0,10));
		assertThrows(IllegalArgumentException.class,()->new Patient(5,10));
	}
	@Test
	
	public void TestsetrandGetPatientId() {
		UUID PatientId= UUID.randomUUID();
		 patient.setPatientId(PatientId);
		  assertEquals(PatientId, patient.getPatientId());
	}
	
	@Test
	
	public void TestSetPatienFirsttName() {
		patient.setFirstName("john");
		assertEquals("john",patient.getFirstName());
	}
	
	@Test
	
	public void TestGetPatientLastName() {
		patient.setLastName("wick");
		assertEquals("wick",patient.getLastName());
	}
	@Test
	 void testExposure() {
		
		Exposure exposure = new Exposure();
		patient.addExposure(exposure);
		Exposure[] exposures= patient.getExposures();
		assertEquals(1,exposures.length);
		assertEquals(exposure,exposures[0]);
	}
	@Test
    void testAddDisease() {
        UUID diseaseId = UUID.randomUUID();
        patient.addDisease(diseaseId);
        UUID[] diseaseIds = patient.getDiseaseIds();
        assertEquals(1, diseaseIds.length);
        assertEquals(diseaseId, diseaseIds[0]);
    }
	
	@Test
	public void testPatientDetails() {
		patient.setPatientId(UUID.randomUUID());
		patient.setFirstName("john");
		patient.setLastName("wick");
		
		Exposure exposure = new Exposure();
		patient.addExposure(exposure);
		
		UUID diseaseId = UUID.randomUUID();
		patient.addDisease(diseaseId);
		
		 String expectedDetails = "Patient ID: " + patient.getPatientId() + "\n"
	                + "First Name: John\n"
	                + "Last Name: Wick\n"
	                + "Exposures: 1\n"
	                + "Diseases: 1\n";

	        
		
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
