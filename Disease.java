
import java.util.UUID;
import java.util.Objects;

public class Disease {
	private UUID Diseaseid;
	private String name;
	
	public Disease(UUID Diseaseid , String name) {//constructor
		this.Diseaseid=Diseaseid;
		this.name=name;
	}
	
	public void setDiseaseid(UUID Dieseaseid) {
		this.Diseaseid=Diseaseid;
	}
	public UUID getDiseaseid() {
		return Diseaseid;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}

	
	public int hashcode(){
		return Objects.hash(Diseaseid);
	}
	
	@Override
	  public boolean equals(Object obj) {
	        if (this == obj) 
	        	return true;
	        if (obj == null)
	        	return false;
	       if( getClass() != obj.getClass())
	    	   return false;
	        Disease disease = (Disease) obj;
	        return Objects.equals(Diseaseid, disease.Diseaseid);
	    }

	@Override
	  public String toString() {
	        return "Disease{" +
	                "diseaseId=" + Diseaseid +
	                ", name='" + name + '\'' +
	                '}';
	    }
	  
	  
	 public static void main(String[] args) {
		UUID Diseaseid1 = UUID.randomUUID();
		Disease Disease1  = new Disease (Diseaseid1,"COVID");
		
		UUID Diseaseid2 = UUID.randomUUID();
		Disease Disease2  = new Disease (Diseaseid1,"Influenza");
		
		
		System.out.println(Disease1);
		System.out.println(Disease2);
		
		System.out.println("disese 1 and 2 is equal ? "+Disease1.equals(Disease2));
		
		//System.out.println("Disease 1 Name: " + Disease1.getname());
	   // System.out.println("Disease 2 Name: " + Disease2.getname());
	}
	 	 
}

