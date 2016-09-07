package lab1.My.Solution;

import java.text.ParseException;
import lab1.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the other best practices as explained by your instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;

    /**
     *
     * @param birthDate
     */
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private SimpleDateFormat currentDate = new SimpleDateFormat();
    private String output;
    public Employee() {
        this.currentDate = new SimpleDateFormat();
    }

  

    public void move() {
        this.meetWithHrForBenefitAndSalryInfo(true);
        this.meetDepartmentStaff(true);
        this.reviewDeptPolicies(true);
        this.moveIntoCubicle("F5");
    }

    /**
     *
     * @param birthDate
     * @throws ParseException
     */
    public void setBirthDate(String birthDate) throws ParseException {
        try {
            this.birthDate = new SimpleDateFormat("MM/dd/yyyy").parse(birthDate);
        } catch (ParseException e) {

        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo(boolean MeetingStatus) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        StringBuilder sb = new StringBuilder();
        // System.out.println("Met with Hr on " + fmtDate);
        String fmtDate = sdf.format(currentDate);
        sb.append("Met with HR on ");
        sb.append(fmtDate);
        this.setMetWithHr(true);
        System.out.println(sb.toString());
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public boolean employeeMetHr() {
        boolean result = false;
        if (metWithHr) {
            result = true;
        }
        return result;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean employeeMetDeptStaff() {
        boolean result = false;
        if (metDeptStaff) {
            result = true;
        }
        return result;
    }

    public boolean employeeReviewedDeptPolicies() {
        boolean result = false;
        if (reviewedDeptPolicies) {
            result = true;
        }
        return result;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff(boolean MeetingStatus) {
        StringBuilder sb = new StringBuilder();
        if (employeeMetHr()) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            sb.append("Met with staff on: ");
            sb.append(fmtDate);
            this.setMetDeptStaff(true);
            System.out.println(sb.toString());
            //System.out.println("Met with Dept. Staff on " + fmtDate);
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    // Assume this must be performed third
    public void reviewDeptPolicies(boolean MeetingStatus) {
        StringBuilder sb = new StringBuilder();
        if (employeeMetDeptStaff()) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            //System.out.println("Reviewed Dept. Policies on " + fmtDate);
            sb.append("Reviewed Dept. Policies on ");
            sb.append(fmtDate);
            this.setReviewedDeptPolicies(true);
            System.out.println(sb.toString());
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        StringBuilder sb = new StringBuilder();
        if (employeeMetHr() && employeeMetDeptStaff() && employeeReviewedDeptPolicies()) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            //System.out.println("Moved into cube on " + fmtDate);
            sb.append("Moved into cube on ");
            sb.append(fmtDate);
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }
}
