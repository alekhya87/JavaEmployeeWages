package programs;

import java.util.Scanner;
import utility.Utilities;

public class EmployeeAttendence {
    public static void main(String[] argv){
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
