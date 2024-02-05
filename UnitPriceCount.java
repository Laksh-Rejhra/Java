
package unitpricecount;

import java.util.*;

public class UnitPriceCount {

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.println("Please enter your units here! ");
        int unit = Input.nextInt();
        
        // here is the formulas of calculating unit price 
        int Unitprice1_100 = unit*5;
        int Unitprice101_200 = ((unit-100)*10)+500;
        
        int Unitprice201_300 =((unit-200)*20)+1500;
        int Unitprice301_400 = ((unit-300)*30)+3500;
        int Unitprice401_500 = ((unit-400)*40)+6500;
        int Unitprice501 = ((unit-500)*50)+10500;
        
        //This is the logic of unit price to 1 to infinite 
        if(unit>=1 && unit<=100)
        {
            System.out.println("The price of " + unit + " is = " +Unitprice1_100);
        }
        else if(unit>=101 && unit<=200)
        {
            System.out.println("The price of " + unit + " is = " +Unitprice101_200);
        }
         else if(unit>=201 && unit<=300)
        {
            System.out.println("The price of " + unit + " is = " +Unitprice201_300);
        }
         else if(unit>=301 && unit<=400)
        {
            System.out.println("The price of " + unit + " is = " +Unitprice301_400);
        }
        else if(unit>=401 && unit<=500)
        {
            System.out.println("The price of " + unit + " is = " +Unitprice401_500);
        }
        else if(unit>=501 )
        {
            System.out.println("The price of " + unit + " is = " +Unitprice501);
        }
    }
    
}
