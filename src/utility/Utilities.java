package utility;
/*
 * @author:alekhya
 * @created date:17th oct 2020
 * @functionality:this is a utility file in which it contain the
 *                logic of code for source file
 */
public class Utilities {
    /*
    * functionality:this method contain the logic of adding two numbers
    * @return     empCheck        - the output values
    */

    int IsFullTime=1;
    public double Attendence(){
        double empCheck =Math.floor(Math.random()*10)%2;
        if (empCheck==IsFullTime)
            return empCheck;
        else
            return 0;
    }
}
