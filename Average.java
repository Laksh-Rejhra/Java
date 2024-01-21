
package average;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Three number to calculate the average");
        int ave;
        
        System.out.println("Enter the 1st number");
        int num1=ip.nextInt();
         
        System.out.println("Enter the 2st number");
        int num2=ip.nextInt();
      
        System.out.println("Enter the 3st number");
        int num3=ip.nextInt();
        
        System.out.println("The average of these number is ");
        ave = (num1+num2+num3)/3;
        System.out.println(ave);
        
    }
    
}
