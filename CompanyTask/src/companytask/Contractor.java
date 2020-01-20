/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companytask;

/**
 *
 * @author OJO2
 */
public class Contractor extends Employee {
    private int hours;

    public Contractor(int id, String name, int hours) {
        super(id, name);
        setSalary2(hours);
    }
    
    @Override
    public void calculateSalary() {
        System.out.println("Salary for " + getName() + " is: " + hours );
        
    }
    
    public double getHours(int hours){
        return hours;
      }
   
    public void setSalary2(int hours) {
        this.hours = hours *2;
    }

    @Override
    public void reportable() {
       System.out.println("Report for Contractor:");
       System.out.println(getId());
       System.out.println(getName());
       System.out.println(hours);

    
    }
    
    }

