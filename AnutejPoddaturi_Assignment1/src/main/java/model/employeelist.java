/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author podda
 */
public class employeelist {
    private ArrayList<Employee> empArray;

    public ArrayList<Employee> getEmpArray() {
        return empArray;
    }

    public void setEmpArray(ArrayList<Employee> empArray) {
        this.empArray = empArray;
    }
    
    public employeelist(){
        empArray= new ArrayList<Employee>();
        
    }
    
    public Employee addEmployee(){
            Employee newemp = new Employee();
            empArray.add(newemp);
            return newemp;
    }
    public void deleteEmployee(Employee delemp)
    {
        empArray.remove(delemp);
    }
}
