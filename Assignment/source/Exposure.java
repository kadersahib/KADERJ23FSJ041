package edu.disease.asn2;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exposure {
	private UUID patientId;
    private LocalDateTime dateTime;
    private String exposureType;

    // Constructor
    public Exposure(UUID patientId, LocalDateTime dateTime, String exposureType) {
        this.patientId = patientId;
        this.dateTime = dateTime;
        this.exposureType = exposureType;
    }

    public Exposure() {
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
    public UUID getPatientId() {
        return this.patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getExposureType() {
        return this.exposureType;
    }

    public void setExposureType(String exposureType) {
        this.exposureType = exposureType;
    }

    @Override
    public String toString() {
        return "Exposure{" +
                "patientId=" + patientId +
                ", dateTime=" + dateTime +
                ", exposureType='" + exposureType + '\'' +
                '}';
    }

    public static void main(String[] args) {

        UUID patientId = UUID.randomUUID();

        LocalDateTime exposureDateTime = LocalDateTime.of(2023, 8, 19, 10, 30);


        Exposure exposure = new Exposure(patientId, exposureDateTime, "Airborne");

        System.out.println("Exposure details:");
        System.out.println(exposure);
    }
}
