
package choicetable;

import java.util.Scanner;
public class Choicetable {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Which Table do you want");
        int Tablenumber = ip.nextInt();
        
        System.out.println("Where do you want to start your table ");
        int StartTable = ip.nextInt();
        System.out.println("Where do you want to end your table ");
        int EndTable = ip.nextInt();
        
        for(int i=StartTable; i<=EndTable; i++){
            System.out.println(Tablenumber +" * "+ i + " = " + (Tablenumber*i));
        }
    
    
    }
    
}
        //    System.out.println(StartTable + " * " + EndTable + " = " + StartTable*EndTable);
