package edu.disease.asn2;

import java.util.UUID;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
    private Disease[] diseases;
    private Patient[] patients;

    public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
        if (maxDiseases <= 0 || maxPatients <= 0) {
            throw new IllegalArgumentException("Maximum diseases and patients must be positive.");
        }

        diseases = new Disease[maxDiseases];
        patients = new Patient[maxPatients];
    }

    @Override
    public Disease addDisease(String name, boolean infectious) {
        Disease disease = new Disease(name, infectious);
        // Find an empty slot in the diseases array and add the disease
        for (int i = 0; i < diseases.length; i++) {
            if (diseases[i] == null) {
                diseases[i] = disease;
                break;
            }
        }
        return disease;
    }

    @Override
    public Disease getDisease(UUID diseaseId) {
        for (Disease disease : diseases) {
            if (disease != null && disease.getId().equals(diseaseId)) {
                return disease;
            }
        }
        return null;
    }

    @Override
    public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
        Patient patient = new Patient(firstName, lastName, maxDiseases, maxExposures);
        // Find an empty slot in the patients array and add the patient
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                break;
            }
        }
        return patient;
    }

    @Override
    public Patient getPatient(UUID patientId) {
        for (Patient patient : patients) {
            if (patient != null && patient.getId().equals(patientId)) {
                return patient;
            }
        }
        return null;
    }

    @Override
    public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
        Disease disease = getDisease(diseaseId);
        Patient patient = getPatient(patientId);
        if (disease != null && patient != null) {
            patient.addDisease(disease);
        }
    }

    @Override
    public void addExposureToPatient(UUID patientId, Exposure exposure) {
        Patient patient = getPatient(patientId);
        if (patient != null) {
            patient.addExposure(exposure);
        }
    }

    public static void main(String[] args) {
        // Create an instance of DiseaseControlManagerImpl
        DiseaseControlManager manager = new DiseaseControlManagerImpl(10, 50);

        // Add diseases
        Disease covid19 = manager.addDisease("COVID-19", true);
        Disease flu = manager.addDisease("Flu", true);

        // Add patients
        Patient patient1 = manager.addPatient("John", "Doe", 3, 5);
        Patient patient2 = manager.addPatient("Jane", "Smith", 2, 4);

        // Add diseases to patients
        manager.addDiseaseToPatient(patient1.getId(), covid19.getId());
        manager.addDiseaseToPatient(patient2.getId(), flu.getId());

        // Add exposures to a patient
        Exposure exposure1 = new Exposure("2023-08-30", "Public Place");
        manager.addExposureToPatient(patient1.getId(), exposure1);

        // Retrieve patient's diseases and exposures
        Patient retrievedPatient1 = manager.getPatient(patient1.getId());
        if (retrievedPatient1 != null) {
            System.out.println("Patient 1's Diseases:");
            for (Disease disease : retrievedPatient1.getDiseases()) {
                System.out.println("- " + disease.getName());
            }

            System.out.println("Patient 1's Exposures:");
            for (Exposure exposure : retrievedPatient1.getExposures()) {
                System.out.println("- Date: " + exposure.getDate() + ", Location: " + exposure.getLocation());
            }
        }

        // Retrieve patient's diseases
        Patient retrievedPatient2 = manager.getPatient(patient2.getId());
        if (retrievedPatient2 != null) {
            System.out.println("Patient 2's Diseases:");
            for (Disease disease : retrievedPatient2.getDiseases()) {
                System.out.println("- " + disease.getName());
            }
        }
    }

}
