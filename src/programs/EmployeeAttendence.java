package programs;
import java.util.Scanner;
import utility.Utilities;
/*
 * @author:alekhya
 * @created date:17th oct 2020
 * @functionality:attendence of employee if they are
 *                  present or absent
 */
public class EmployeeAttendence {
    public static void main(String[] argv){
        System.out.println("Welcome To Employee Wage Computation");
        Scanner scanner=new Scanner(System.in);
        Utilities utilities=new Utilities();
        double result=utilities.Attendence();
        if (result>0)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Absent");
        scanner.close();
    }

}
