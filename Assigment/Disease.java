package edu.disease.asn1;


import java.util.Objects;
import java.util.UUID;


public class Disease {
    private UUID diseaseId;
    private String name;

 
    public Disease(UUID diseaseId, String name) {
        this.diseaseId = diseaseId;
        this.name = name;
    }

  
    public UUID getDiseaseId() {
        return diseaseId;
    }

   
    public void setDiseaseId(UUID diseaseId) {
        this.diseaseId = diseaseId;
    }

   
    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

  
    @Override
    public int hashCode() {
        return Objects.hash(diseaseId);
    }

   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disease disease = (Disease) o;
        return Objects.equals(diseaseId, disease.diseaseId);
    }

  
    @Override
    public String toString() {
        return "Disease{" +
                "diseaseId=" + diseaseId +
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {

        UUID fluUUID = UUID.randomUUID();
        Disease flu = new Disease(fluUUID, "Flu");

        UUID coldUUID = UUID.randomUUID();
        Disease cold = new Disease(coldUUID, "Cold");


        System.out.println("Flu: " + flu);
        System.out.println("Cold: " + cold);

        Disease flu2 = new Disease(fluUUID, "COVID-19");
        System.out.println("Are flu and flu2 equal? " + flu.equals(flu2));
        System.out.println("Hash code of flu: " + flu.hashCode());
        System.out.println("Hash code of flu2: " + flu2.hashCode());
    }
}
