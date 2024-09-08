
package binary_search;

public class Binary_Search {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target = 6;
        System.out.println(search(arr, target));
    }
    
    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int mid;
        while(s<=e){
           
            mid= (s+e)/2;
            
            if(arr[mid]>target)
            {
                e=mid-1;
              
              }
            else if(arr[mid]<target){
                s = mid+1;
                }
            
            else{
                return mid;
            }
           }
        return -1;
    }
    
}
