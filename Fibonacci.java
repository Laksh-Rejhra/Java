
package fibonacci;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci? ");
        int n = input.nextInt();
        long zero = 0;
        long one = 1;
        long nTh;
        System.out.println("The Fibonacci number series is start from here ");
        System.out.println(zero);
        System.out.println(one);
        
        for(int i=1; i<n; i++)
        {
            nTh = zero+one;
            zero = nTh+one;
            one = nTh+zero;
            
            System.out.println(nTh);
            System.out.println(zero);
            System.out.println(one);
        }
        
        
    }
    
}
