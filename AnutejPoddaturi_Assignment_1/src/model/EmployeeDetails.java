/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author podda
 *
 */
public class EmployeeDetails {
      private ArrayList<HumanResources> details;
  
      public EmployeeDetails(){
          this.details  = new ArrayList<HumanResources>();
          
      }

    public ArrayList<HumanResources> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<HumanResources> details) {
        this.details = details;
    }
        public HumanResources addNewEmployee()
        {
            HumanResources newEmployee = new HumanResources();
            details.add(newEmployee);
            return newEmployee;
            
        }
        public void deleteEmployee(HumanResources emp) {
            details.remove(emp); 
        }
}
