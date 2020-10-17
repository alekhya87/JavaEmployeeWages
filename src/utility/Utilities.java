package utility;
public class Utilities {
    int IsFullTime=1;
    public double Attendence(){
        double empCheck =Math.floor(Math.random()*10)%2;
        if (empCheck==IsFullTime)
            return empCheck;
        else
            return 0;
    }
}
