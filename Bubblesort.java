
package bubblesort;


public class Bubblesort {

    public static void main(String[] args) {
    int[] arr = {5,9,8,1,4};
    int k=1;
    int temp;
        for(int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    
        System.out.println("After sorting the array the result is ");
    
        while(k<arr.length)
        {
          for(int j=0; j<arr.length-k; j++)
          {
             if(arr[j]>arr[j+1]) 
             {
                 temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
          }
          k++;
        }
        
                for(int a=0; a<arr.length; a++)
             {
                System.out.println(arr[a]);
        
            }
                
        
    }
    
}
