package programs;

import utility.Utilities;

import java.util.Scanner;

/*
 * @author:alekhya
 * @created date:18th oct 2020
 * @functionality:Calculate Wages till a condition of total
 *                working hours of 100 or max days os 20 is
 *                reached for a month
 */
public class EmployeeWagesMaxDaysHours {
    public static void main(String[] argv)
    {
        Scanner scanner=new Scanner(System.in);
        Utilities utilities=new Utilities();
        int totalwage= utilities.empWageMaxDaysHours();
        System.out.println("total employee wage "+totalwage);
        scanner.close();
    }
}
