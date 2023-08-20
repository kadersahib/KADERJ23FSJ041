import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
public class DiseaseTest {
	@Test
	public void testDisease() {
		
		UUID Diseaseid1=UUID.randomUUID();
		Disease Disease1 = new Disease(Diseaseid1, "COVID");
		
		UUID Diseasid2 = UUID.randomUUID();
		Disease Disease2 = new Disease (Diseasid2, "Influenza");
		
		assertEquals(Disease1,Disease1);//test the object equal or not
		assertNotEquals( Disease1, Disease2);//test the object different
		
	}
	@Test
	public void hashcode() {
		UUID Diseaseid1 = UUID.randomUUID();
		Disease disease1 = new Disease (Diseaseid1 ,"COVID");
		
		UUID Diseaseid2 = UUID.randomUUID();
		Disease disease2 = new Disease (Diseaseid2,"Influenza");
		
		assertEquals(disease1.hashcode(),disease1.hashcode());
		assertNotEquals(disease2.hashcode(),disease2.hashcode());
	}
	@Test
	public void testtoString() {
		UUID Diseaseid1 = UUID.randomUUID();
		new Disease(Diseaseid1,"COVID");
	
		String expectedToString ="Disease{" +
                "diseaseId=" + Diseaseid1 +
                ", name='COVID"  +
                '}';
		assertEquals(expectedToString,Diseaseid1.toString());
    }	
	
}
