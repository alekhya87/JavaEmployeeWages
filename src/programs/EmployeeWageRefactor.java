package programs;

import utility.EmployeeWageRefactorObject;
import utility.EmployeeWageRefactorlogic;
/*
 * @author:alekhya
 * @created date:19th oct 2020
 * @functionality:Refactor the Code to write a Class Method to
                  Compute Employee Wage
 */
public class EmployeeWageRefactor {
    public static void main(String[] argv){
        EmployeeWageRefactorlogic employeeWage=new EmployeeWageRefactorlogic();
        EmployeeWageRefactorObject employeeObject=new EmployeeWageRefactorObject();
        employeeObject.setCompany("Dmart");
        employeeObject.setEmpRatePerHr(20);
        employeeObject.setNumWorkingDays(20);
        employeeObject.setMaxWorkingHrsInMonth(100);
        int totalWages = employeeWage.WageHrs(employeeObject.getCompany(),employeeObject.getEmpRatePerHr(), employeeObject.getNumWorkingDays(), employeeObject.getMaxWorkingHrsInMonth());
        System.out.println("the total Wages of Employee is :" + totalWages);

    }
}
