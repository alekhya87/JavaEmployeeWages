package programs;

import utility.EmployeeWageCollectionsLogic;
import utility.EmployeeWageCollectionsObjects;
/*
 * @author:alekhya
 * @created date:21th oct 2020
 * @functionality:manage Employee Wage of multiple companies using Collections
 */
import java.util.ArrayList;

public class EmployeeWageCollections {
    public static void main(String[] argv){
        EmployeeWageCollectionsLogic employeeWageCollectionsLogic=new EmployeeWageCollectionsLogic();

        EmployeeWageCollectionsObjects dmart =new EmployeeWageCollectionsObjects("Dmart",20,20,
                                                                                100);
        EmployeeWageCollectionsObjects bigbasket=new EmployeeWageCollectionsObjects("BigBasket",20,28,
                                                                                    150);
        EmployeeWageCollectionsObjects flipcart=new EmployeeWageCollectionsObjects("FlipCart",20,28,
                                                                                    130);
        EmployeeWageCollectionsObjects amazon=new EmployeeWageCollectionsObjects();
        amazon.setCompany("Amazon");
        amazon.setEmpRatePerHr(20);
        amazon.setNumWorkingDays(25);
        amazon.setMaxWorkingHrsInMonth(120);

        int dmartWages=employeeWageCollectionsLogic.EmployeeWageHrs(dmart.getCompany(),dmart.getEmpRatePerHr(),dmart.getNumWorkingDays(),
                                                                    dmart.getMaxWorkingHrsInMonth());
        System.out.println("Total Dmart Employee wages are :"+dmartWages);
        int bigbasketWages=employeeWageCollectionsLogic.EmployeeWageHrs(bigbasket.getCompany(),bigbasket.getEmpRatePerHr(),bigbasket.getNumWorkingDays(),
                                                                        bigbasket.getMaxWorkingHrsInMonth());
        System.out.println("Total BigBasket Employee wages are :"+bigbasketWages);
        int flipcartWages=employeeWageCollectionsLogic.EmployeeWageHrs(flipcart.getCompany(),flipcart.getEmpRatePerHr(),flipcart.getNumWorkingDays(),
                                                                        flipcart.getMaxWorkingHrsInMonth());
        System.out.println("Total Flipcart Employee wages are :"+flipcartWages);
        int amazonWages=employeeWageCollectionsLogic.EmployeeWageHrs(amazon.getCompany(),amazon.getEmpRatePerHr(),amazon.getNumWorkingDays(),amazon.getMaxWorkingHrsInMonth());
        System.out.println("Total Amazon Employee wages are :"+amazonWages);

        ArrayList<EmployeeWageCollectionsObjects> list = new ArrayList<EmployeeWageCollectionsObjects>();
        list.add(dmart);
        list.add(bigbasket);
        list.add(flipcart);
        list.add(amazon);

        for (EmployeeWageCollectionsObjects Company : list)
            System.out.println(Company);
    }
}
