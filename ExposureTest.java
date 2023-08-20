import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class ExposureTest {

    @Test
    public void testExposureConstructorAndGetters() {
        UUID patientId = UUID.randomUUID();
        LocalDateTime exposureDateTime = LocalDateTime.of(2023, 8, 19, 10, 30);
        String exposureType = "Airborne";

        Exposure exposure = new Exposure(patientId, exposureDateTime, exposureType);

        assertEquals(patientId, exposure.getPatientId());
        assertEquals(exposureDateTime, exposure.getDateTime());
        assertEquals(exposureType, exposure.getExposureType());
    }

    @Test
    public void testsetters() {
    	UUID patientId = UUID.randomUUID();
    	LocalDateTime exposureDateTime = LocalDateTime.of(2020, 8, 7,8,9);
    	String exposureType="droplet";
    	
    	Exposure exposure = new Exposure(patientId,exposureDateTime,exposureType);
    	
    	exposure.setPatientId(patientId);
    	exposure.setDateTime(exposureDateTime);
    	exposure.setExposureType(exposureType);
    	
    }
    @Test
    public void testExposureToString() {
    	 UUID patientId = UUID.randomUUID();
         LocalDateTime exposureDateTime = LocalDateTime.of(2023, 8, 19, 10, 30);
         String exposureType = "Contact";
         
         Exposure exposure = new Exposure(patientId,exposureDateTime,exposureType);
         
         String expectedToString = "Exposure{" +
                 "patientId=" + patientId +
                 ", dateTime=" + exposureDateTime +
                 ", exposureType='" + exposureType + '\'' +
                 '}';
         assertEquals(expectedToString,exposure.toString());
    }
    
}
