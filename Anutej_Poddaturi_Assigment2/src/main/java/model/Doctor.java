package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahithigaddam
 */
public class Doctor extends Person{
    private static int count=0;
    private String hospitalName;
    private String hospitalDepartment;
    private String phoneNumber;
    private String DoctorId;

    
    public Doctor() {
        setDoctorId("doc_"+(++count));
        
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    public Doctor(String hospitalName, String hospitalDepartment, String phoneNumber) {
        this.hospitalName = hospitalName;
        this.hospitalDepartment = hospitalDepartment;
        this.phoneNumber = phoneNumber;
    }

    public Doctor(String hospitalName, String hospitalDepartment, String phoneNumber, String name, String id, int age, String gender, String role, String userName, String passWord) {
        super(name, id, age, gender, role, userName, passWord);
        this.hospitalName = hospitalName;
        this.hospitalDepartment = hospitalDepartment;
        this.phoneNumber = phoneNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalDepartment() {
        return hospitalDepartment;
    }

    public void setHospitalDepartment(String hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
