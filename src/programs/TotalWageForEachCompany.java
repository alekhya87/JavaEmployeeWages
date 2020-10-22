package programs;

import utility.TotalWageForEachCompanyLogic;
import utility.TotalWageForEachCompanyObjects;
/*
 * @author:alekhya
 * @created date:21th oct 2020
 * @functionality:Total Wages for each companies
 */
public class TotalWageForEachCompany {
    public static void main(String[] argv){
        TotalWageForEachCompanyObjects employeeObject=new TotalWageForEachCompanyObjects();
        TotalWageForEachCompanyLogic totalWageForEachCompanyLogic=new TotalWageForEachCompanyLogic();
        employeeObject.setCompany("Dmart");
        employeeObject.setEmpRatePerHr(20);
        employeeObject.setNumWorkingDays(20);
        employeeObject.setMaxWorkingHrsInMonth(100);
        int dmarttotalWages = totalWageForEachCompanyLogic.EmployeeWageHrs(employeeObject.getCompany(), employeeObject.getEmpRatePerHr(), employeeObject.getNumWorkingDays(), employeeObject.getMaxWorkingHrsInMonth());
        System.out.println("Dmart employee total Wages is :" + dmarttotalWages);

        employeeObject.setCompany("Reliance");
        employeeObject.setEmpRatePerHr(15);
        employeeObject.setNumWorkingDays(24);
        employeeObject.setMaxWorkingHrsInMonth(150);
        int reliancetotalWages = totalWageForEachCompanyLogic.EmployeeWageHrs(employeeObject.getCompany(), employeeObject.getEmpRatePerHr(), employeeObject.getNumWorkingDays(), employeeObject.getMaxWorkingHrsInMonth());
        System.out.println("reliance employee total Wages is :" + reliancetotalWages);

    }
}
