package lab1.My.Solution;

import java.text.ParseException;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the other best practices as explained by your instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public class Startup {

    public static void main(String[] args) throws ParseException {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
         */
        Employer employer = new Employer();
        StringBuilder sb = new StringBuilder();
//        employee.firstName = "Peter";
//        employee.lastName = "Piper";
//        employee.ssn = "333-1234";
        employer.hireEmployee();
        employer.getStatus();
        sb.append("The employee's status is: ");
        sb.append(employer.getStatus());
        System.out.println(sb.toString());
    }

}
