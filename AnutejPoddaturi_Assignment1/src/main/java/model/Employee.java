/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author poddaturi anutej
 * Date:29/09/2022
 */
public class Employee {
    
    private String name,empId,age,gender,startDate,level,teamInfo,positionTitle,contactInfoPhoneNo,contactInfoEmailId,empPhoto;
    
    public Employee(){
        
    }
    
    //    Constructor to initialize objects and assign values to the data members
    
//    public Employee(String name, String empId, String age, String gender,String startDate, String level, String teamInfo, String positionTitle, String ContactInfoPhoneNo,String contactInfoEmailId, String empPhoto)
//    {
//    this.name=name;
//    this.empId=empId;
//    this.age=age;
//    this.gender=gender;
//    this.startDate=startDate;
//    this.level=level;
//    this.teamInfo=teamInfo;
//    this.positionTitle=positionTitle;
//    this.contactInfoPhoneNo=ContactInfoPhoneNo;
//    this.contactInfoEmailId=contactInfoEmailId;
//    this.empPhoto=empPhoto;
//    }
    
    //    Getter and Setter Methods for the Employee Data Members

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getLevel() {
        return level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public String getContactInfoPhoneNo() {
        return contactInfoPhoneNo;
    }

    public String getContactInfoEmailId() {
        return contactInfoEmailId;
    }

    public String getEmpPhoto() {
        return empPhoto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public void setContactInfoPhoneNo(String contactInfoPhoneNo) {
        this.contactInfoPhoneNo = contactInfoPhoneNo;
    }

    public void setContactInfoEmailId(String contactInfoEmailId) {
        this.contactInfoEmailId = contactInfoEmailId;
    }

    public void setEmpPhoto(String empPhoto) {
        this.empPhoto = empPhoto;
    }
    

    
}
