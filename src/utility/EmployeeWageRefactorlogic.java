package utility;
/*
 * @author:alekhya
 * @created date:19th oct 2020
 * @functionality:this is a utility file in which it contain the
 *                logic of code for source file
 */
public class EmployeeWageRefactorlogic {
    /*
     * functionality:this method contain the logic of employee wage refactor
     * @return     totalWage        - the output values to the main method
     */
    int empHrs;
    public int WageHrs(String company, int empRatePerHr, int NumWorkingDays, int MaxWorkingHrsInMonth) {
        int totalWages=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        while (totalEmpHrs<MaxWorkingHrsInMonth && totalWorkingDays<NumWorkingDays)
        {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random()*10)%3;
            switch ((int) empCheck)
            {
                case 1:
                    System.out.println("Employee is full time");
                    empHrs = 8;
                    break;
                case 2:
                    System.out.println("Employee is Part time");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalEmpHrs=totalEmpHrs+empHrs;
            totalWages=totalEmpHrs*empRatePerHr;
            System.out.println("Days :"+totalWorkingDays+" employee hours :"+empHrs);
        }
        System.out.println("Name of the company is :"+company+"\n"+"total Employee Working hours is :"+totalEmpHrs );
        return totalWages;
    }

}
