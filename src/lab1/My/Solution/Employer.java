/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.My.Solution;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ryan Schissel
 */
public class Employer {
    private Employee employee = new Employee();
    
    public void hireEmployee() throws ParseException{
      employee.setFirstName("Ryan");
      employee.setLastName("Schissel");
      employee.setSsn("333-1234");
      employee.setBirthDate("6/10/1994");
      employee.move();
    }
    public String getStatus(){
        SimpleDateFormat sdf = new SimpleDateFormat().parse(employee.getCurrentDate());       
        StringBuilder sb = new StringBuilder();
        if (employee.employeeMetHr() && employee.employeeMetDeptStaff()
                && employee.employeeReviewedDeptPolicies()) {
            String fmtDate = sdf.format(sdf);
            sb.append("Orientation is completed on: ");
            sb.append(fmtDate);
        } else {
            sb.append(": Orientation in progress...");
        }
        return sb.toString();
    }
}
