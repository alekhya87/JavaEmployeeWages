package programs;

import utility.Utilities;

import java.util.Scanner;

/*
 * @author:alekhya
 * @created date:17th oct 2020
 * @functionality: employee and their wages using switch
 */
public class EmployeeWageUsingSwitch {
    public static void main(String[] argv){
        System.out.println("Welcome To Employee Wage Computation");
        Scanner scanner=new Scanner(System.in);
        Utilities utilities=new Utilities();
        double wages=utilities.empWageSwitch();
        if (wages==80)
            System.out.println("Part time Employee wages are : "+wages);
        else if(wages>80)
            System.out.println("full time Employee wages are :"+wages);
        else
            System.out.println("Employee is Absent : "+wages);
        scanner.close();
    }

}
