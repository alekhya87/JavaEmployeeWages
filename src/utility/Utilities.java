package utility;
/*
 * @author:alekhya
 * @created date:17th oct 2020
 * @functionality:this is a utility file in which it contain the
 *                logic of code for source file
 */
public class Utilities {
    /*
    * functionality:this method contain the logic of employee Attendence
    * @return     empCheck       - the output values
    */

    int IsFullTime=1;
    double empCheck =Math.floor(Math.random()*10)%2;
    public double Attendence(){
        if (empCheck==IsFullTime)
            return empCheck;
        else
            return 0;
    }
    public double EmpDailyWages(){/*
     * functionality:this method contain the logic of employee daily wages
     * @return     wages        - the output values
     */
        int empRatePerHr=20;
        int empHrs=8;
        int wages;
        if(empCheck==IsFullTime)
            return wages=empRatePerHr*empHrs;
        else
            return 0;
    }

}
