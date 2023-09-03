package edu.disease.asn2;
import java.util.UUID;

import edu.disease.asn1.Exposure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Patient implements Comparable<Patient> {
    private String firstName;
    private String lastName;

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Patient otherPatient) {
        int lastNameComparison = this.lastName.compareToIgnoreCase(otherPatient.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return this.firstName.compareToIgnoreCase(otherPatient.firstName);
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Other methods...

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    // Main method for demonstration
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("John", "Doe"));
        patients.add(new Patient("Alice", "Smith"));
        patients.add(new Patient("Bob", "Johnson"));

        System.out.println("Original list:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }

        Collections.sort(patients);

        System.out.println("\nSorted list:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

	public UUID getId() {

		return null;
	}

	public void addExposure(Exposure exposure) {
		// TODO Auto-generated method stub
		
	}

	public void addDisease(Disease disease) {
		// TODO Auto-generated method stub
		
	}

	
}
