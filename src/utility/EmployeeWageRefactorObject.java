package utility;
/*
 * @author:alekhya
 * @created date:19th oct 2020
 * @functionality:this is object file which contains objects of the
 *                original file
 */
public class EmployeeWageRefactorObject {
    private String company;
    private int empRatePerHr;
    private int numWorkingDays;
    private int MaxWorkingHrsInMonth;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }

    public int getNumWorkingDays() {
        return numWorkingDays;
    }

    public void setNumWorkingDays(int numWorkingDays) {
        this.numWorkingDays = numWorkingDays;
    }

    public int getMaxWorkingHrsInMonth() {
        return MaxWorkingHrsInMonth;
    }

    public void setMaxWorkingHrsInMonth(int maxWorkingHrsInMonth) {
        MaxWorkingHrsInMonth = maxWorkingHrsInMonth;
    }

}