package programs;

import utility.Utilities;

import java.util.Scanner;

/*
 * @author:alekhya
 * @created date:18th oct 2020
 * @functionality:employee wages for a month
 */
public class EmployeeWageForMonth {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        Utilities utilities=new Utilities();
        int totalwages = utilities.empWageMonth();
        if(totalwages==1600)
            System.out.println("Part time Employee wages for a month are : "+totalwages);
        else if(totalwages>1600)
            System.out.println("full time Employee wages for a month are : "+totalwages);
        else
            System.out.println("Employee is absent so wages for a month is : "+totalwages);
        scanner.close();

    }
}
