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
public class CompanyTask {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      FullTimeEmployee f = new FullTimeEmployee(1, "Ahmad Sharafeddin", 500.5);
      Employee e = new FullTimeEmployee(2, "Moath Ghareeb", 700);
      Contractor c = new Contractor(3, "Emad Alrasheed", 300);
      
      f.calculateSalary();
      e.calculateSalary();
      c.calculateSalary();
      f.reportable();
      e.reportable();
      c.reportable();
    }

   
    
}
