package edu.disease.asn2;

import edu.disease.asn2.InfectiousDisease;
import edu.disease.asn2.NonInfectiousDisease;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DiseaseTest {

    @Test
    public void testGetinfeoctiousExamples() {
        InfectiousDisease infectiousDisease = new InfectiousDisease();
        String[] expectedExamples = {"Flu", "COVID-19", "Malaria", "Measles"};
        assertArrayEquals(expectedExamples, infectiousDisease.getExamples());
    }

    @Test
    public void testGetNoninfectiousExamples() {
        NonInfectiousDisease nonInfectiousDisease = new NonInfectiousDisease();
        String[] expectedExamples = {"Diabetes", "Cancer", "Heart Disease", "Alzheimer's"};
        assertArrayEquals(expectedExamples, nonInfectiousDisease.getExamples());
    }
}
