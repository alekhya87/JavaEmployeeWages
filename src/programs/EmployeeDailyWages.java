package programs;

import utility.Utilities;

import java.util.Scanner;
/*
 * @author:alekhya
 * @created date:17th oct 2020
 * @functionality:attendence of employee if they are
 *                  present or absent
 */
public class EmployeeDailyWages {
    public static void main(String[] argv){
        System.out.println("Welcome To Employee Wage Computation");
        Scanner scanner=new Scanner(System.in);
        Utilities utilities=new Utilities();
        double wages=utilities.EmpDailyWages();
        /*usecae -2 to calculate employee daily wages*/
        if (wages>0)
            System.out.println("Employee is present : "+wages);
        else
            System.out.println("Employee is Absent : "+wages);
        scanner.close();
    }
}
