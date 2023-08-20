import java.util.UUID;

class Patient {
    private UUID patientId;
    private String firstName;
    private String lastName;
    private Exposure[] exposures;
    private UUID[] diseaseIds;

    public Patient(int maxDiseases, int maxExposures) {
        if (maxDiseases <= 0 || maxExposures <= 0) {
            throw new IllegalArgumentException("maxDiseases and maxExposures must be positive values");
        }

        this.diseaseIds = new UUID[maxDiseases];
        this.exposures = new Exposure[maxExposures];

      
    }


    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Exposure[] getExposures() {
        return exposures;
    }

    public void setExposures(Exposure[] exposures) {
        this.exposures = exposures;
    }


    public UUID[] getDiseaseIds() {
        return diseaseIds;
    }

    public void setDiseaseIds(UUID[] diseaseIds) {
        this.diseaseIds = diseaseIds;
    }


    public void addExposure(Exposure exposure) {

    }

    // Method to add a disease
    public void addDisease(UUID diseaseId) {

    }


    public void PatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Exposures: " + exposures.length);
        System.out.println("Diseases: " + diseaseIds.length);
    }
       
            public static void main(String[] args) {
                try {
                    Patient patient = new Patient(5, 10); // Create a patient maxDiseases=5 and maxExposures=10


                    patient.setPatientId(UUID.randomUUID());
                    patient.setFirstName("John");
                    patient.setLastName("Wick");


                  //  System.out.println("Patient ID: " + patient.getPatientId());
                   // System.out.println("First Name: " + patient.getFirstName());
                 //   System.out.println("Last Name: " + patient.getLastName());

                    // Add an exposure 
                    Exposure exposure = new Exposure();
                    patient.addExposure(exposure);

                    //Add an Disease
                    UUID diseaseId = UUID.randomUUID();
                    patient.addDisease(diseaseId);

                    
                    patient.PatientDetails();
                } 
                catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            
        

    }
}
