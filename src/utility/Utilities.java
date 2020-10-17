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
    * @return     empCheck        - the output values
    */

    int IsFullTime=1;
    double empCheck =Math.floor(Math.random()*10)%2;
    public double Attendence(){
        if (empCheck==IsFullTime)
            return empCheck;
        else
            return 0;
    }
    int empRatePerHr=20;
    int wages;
    public double EmpDailyWages(){
        /*
        * functionality:this method contain the logic of employee daily wages
        * @return     wages        - the output values
        */
        int empHrs=8;
        if(empCheck==IsFullTime)
            return wages=empRatePerHr*empHrs;
        else
            return 0;
    }
    int IsPartTime=2;
    double randomCheck =Math.floor(Math.random()*10)%3;
    public double PartTimeWages(){
        /*
         * functionality:this method contain the logic of fill time and
         *               part time employee daily wages
         * @return     wages   - the output value of full time employee wages
         * @return     wages   - the output value of  part time employee wages
         */
        if (randomCheck==IsFullTime)
            return wages=empRatePerHr*8;
        else if (randomCheck==IsPartTime)
            return wages=empRatePerHr*4;
        else
            return 0;
    }
    public double empWageSwitch(){
        /*
         * functionality:this method contain the logic of fill time and
         *               part time employee daily wages using switch
         * @return     wages   - the output value of full time employee wages
         * @return     wages   - the output value of  part time employee wages
         */
        switch ((int) randomCheck){
            case 1:
                int IsFullTime=8;
                return wages=empRatePerHr*IsFullTime;
            case 2:
                int IsPartTime=4;
                return wages=empRatePerHr*IsPartTime;
            default:
                return 0;
        }

    }

}
