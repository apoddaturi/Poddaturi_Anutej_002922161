package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author podda
 */
public class Patient extends Person{
    private String phoneNumber;
    private String streetAddress;
    private String community;
    private String city;
    private Long zipcode;
    private EncounterHistory encounterHistory;
    private String patient_id;
    private static int count=0;
    public Patient() {
        setPatient_id("patient_"+(++count));
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public Patient(String phoneNumber, String streetAddress, String community, String city, Long zipcode, EncounterHistory encounterHistory) {
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.community = community;
        this.city = city;
        this.zipcode = zipcode;
        this.encounterHistory = encounterHistory;
    }

    public Patient(String phoneNumber, String streetAddress, String community, String city, Long zipcode, String name, String id, int age, String gender, String role, String userName, String password, EncounterHistory encounterHistory) {
        super(name, id, age, gender, role, userName, password);
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.community = community;
        this.city = city;
        this.zipcode = zipcode;
        this.encounterHistory = encounterHistory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPostalCode() {
        return zipcode;
    }

    public void setPostalCode(Long zipcode) {
        this.zipcode = zipcode;
    }
    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
}
