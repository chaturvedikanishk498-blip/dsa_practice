package Java.Searching;

public class binarySearch {

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        while(start<=end) {
            mid = start + (end - start)/2;
            if(arr[mid]==target) {
                return mid;
            } else if(arr[mid]<target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            return -1;
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr = {12,34,56,57,77,81,90};
        int target = 1;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
}
