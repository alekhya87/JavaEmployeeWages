package programs;

import utility.Utilities;

import java.util.Scanner;
/*
 * @author:alekhya
 * @created date:17th oct 2020
 * @functionality:Add part time employee and their wages
 */
public class PartTimeEmployee {
    public static void main(String[] argv){
        System.out.println("Welcome To Employee Wage Computation");
        Scanner scanner=new Scanner(System.in);
        Utilities utilities=new Utilities();
        double wages=utilities.PartTimeWages();
        if (wages>0)
            System.out.println("Part time Employee is present : "+wages);
        else
            System.out.println("Part time Employee is Absent : "+wages);
        scanner.close();
    }
}
