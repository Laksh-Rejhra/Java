
package order_agnostic_binary_search;

public class Order_Agnostic_Binary_search {

    public static void main(String[] args) {
     // descending order 
     int[]  arr = {5,4,3,2,1};
     int target=5;
     int  ans = search(arr, target);
     System.out.println("Descending order: "+ans);
     
     
    //Ascending order
     int[]  arr1 = {1,2,3,4,5};   
     int target2=5;
     int  ans2 = search(arr1, target2);
     System.out.println("Ascending order: "+ans2);
    }

    static int search(int[] arr, int target){
        int s=0;
        int e = arr.length-1;
        
        boolean isAc;
        if(arr[s]<arr[e])
        {
            isAc = true;
        }
        else {
            isAc = false;
        }
        
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            
            if(isAc){
                if(arr[mid]>target){
                    e = mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    e = mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        
        
        return -1;
    }
}
