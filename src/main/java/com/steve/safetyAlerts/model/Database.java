package com.steve.safetyAlerts.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Person> persons = new ArrayList<Person>();
    private List<FireStation> firestations = new ArrayList<FireStation>();
    private List<MedicalRecord> medicalrecords = new ArrayList<MedicalRecord>();

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<FireStation> getFireStations() {
        return firestations;
    }

    public void setFirestations(List<FireStation> firestations) {
        this.firestations = firestations;
    }

    public List<MedicalRecord> getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(List<MedicalRecord> medicalrecords) {
        this.medicalrecords = medicalrecords;
    }

    @Override
    public String toString() {
        return "Database{" +
                "persons=" + persons +
                ", fireStations=" + firestations +
                ", medicalRecords=" + medicalrecords +
                '}';
    }

}
