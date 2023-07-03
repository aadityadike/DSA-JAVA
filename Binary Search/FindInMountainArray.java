/** 
 ** https://leetcode.com/problems/find-in-mountain-array/description/
*/

public class FindInMountainArray {
/**
 ** This is MountainArray's API interface.
 ** You should not implement it, or speculate about its implementation
 ** interface MountainArray {
 **    public int get(int index) {}
 **    public int length() {}
 ** }
 
 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // TODO
        int peak = mountainArray(mountainArr);
        int firsthalf = binarySearch(target,mountainArr,0,peak,true);
        if(firsthalf != -1)
        return firsthalf;
        else 
        return binarySearch(target,mountainArr,peak + 1,mountainArr.length()-1,false);
    }
    
    // Find Peak element of Array.
    public int mountainArray(MountainArray mountainArr){
        // TODO
        int start = 0;
        int end = mountainArr.length()-1;
        
        while(start < end){ 
            int mid = start + (end-start) / 2;
            
            if(mountainArr.get(mid) < mountainArr.get(mid+1))
                start = mid + 1;
            else
            end = mid;
        }
        return start;
    }
    
    // Find element target in Array.
    static int binarySearch(int target, MountainArray mountainArr, int start,int end, boolean isAccending) {
        // TODO
        while(start <= end){
            int mid = start + (end - start) / 2; // cause this may surpass the integer value.
            int getMiddelElement = mountainArr.get(mid);
            if(isAccending){ // Check for order.
                if(getMiddelElement < target ){ 
                    start = mid + 1;
                }else if (getMiddelElement > target) {
                    end = mid -1;
                }else{
                    return mid;
                }
            }else {
                if(getMiddelElement > target ){ 
                    start = mid + 1;
                }else if (getMiddelElement < target) {
                    end = mid -1;
                }else{
                    return mid;
                }
            }
        }   
        return -1;
    }
    */ 
}