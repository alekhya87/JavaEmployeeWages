package programs;

import utility.EmpWageRefactorForCompanyLogic;
import utility.EmpWageRefactorForCompanyObject;
import utility.EmployeeWageRefactorObject;
/*
 * @author:alekhya
 * @created date:19th oct 2020
 * @functionality:Refactor the Code to write a Class Method to
                  Compute Employee Wage for a company
 */
public class EmpWageRefactorForCompany {
    public static void main(String[] argv) {
        EmpWageRefactorForCompanyLogic dmartemployeeWage = new EmpWageRefactorForCompanyLogic();
        EmpWageRefactorForCompanyObject employeeObject = new EmpWageRefactorForCompanyObject();
        employeeObject.setCompany("Dmart");
        employeeObject.setEmpRatePerHr(20);
        employeeObject.setNumWorkingDays(20);
        employeeObject.setMaxWorkingHrsInMonth(100);
        int dmarttotalWages = dmartemployeeWage.EmployeeWageHrs(employeeObject.getCompany(), employeeObject.getEmpRatePerHr(), employeeObject.getNumWorkingDays(), employeeObject.getMaxWorkingHrsInMonth());
        System.out.println("Dmart employee total Wages is :" + dmarttotalWages);
        EmpWageRefactorForCompanyLogic relianceemployeeWage = new EmpWageRefactorForCompanyLogic();
        employeeObject.setCompany("Reliance");
        employeeObject.setEmpRatePerHr(15);
        employeeObject.setNumWorkingDays(24);
        employeeObject.setMaxWorkingHrsInMonth(150);
        int reliancetotalWages = relianceemployeeWage.EmployeeWageHrs(employeeObject.getCompany(), employeeObject.getEmpRatePerHr(), employeeObject.getNumWorkingDays(), employeeObject.getMaxWorkingHrsInMonth());
        System.out.println("reliance employee total Wages is :" + reliancetotalWages);
    }
}