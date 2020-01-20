/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companytask;

/**
 *
 * @author Sharafeddin
 */

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        setSalary(salary);
    }
    
   
  
         
    @Override
    public void calculateSalary() {
        System.out.println("Salary for " + getName() + " is: " + salary );
    }
    
    public double getSalary() {
      return salary;
   }            
                
    public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }            
    }

    @Override
    public void reportable() {
        System.out.println("Report for Full Time Employee:");
       System.out.println(getId());
       System.out.println(getName());
       System.out.println(salary);

    }

    

}