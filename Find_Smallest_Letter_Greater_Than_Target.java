
package find_smallest_letter_greater_than_target;

public class Find_Smallest_Letter_Greater_Than_Target {

    public static void main(String[] args) {
        char[] let = {'a','b','c'};
        char target= 'd';
        System.out.println(letter(let, target));
    }
    
    static char letter(char[] arr, int target){
          int s=0;
        int e=arr.length-1;
        
        while(s<=e){
           
            int mid= (s+e)/2;
           
            if(arr[mid]>target)
            {
                e=mid-1;
              
              }
            else{
                s = mid+1;
                }
          
           }
        
        return arr[s%arr.length];
    }
    
}
