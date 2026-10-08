package Java.Searching;
public class linearSearch {

    static int LinearSearch(int []arr, int target) {
    int found = -1;
    for(int i=0;i<arr.length;i++) {
        if(arr[i]==target) {
            found = i;
            break;
        }
    }
    return found;
}
    public static void main(String[] args) {
    int[] arr = {23,45,22,78,97,21,65};
    int target = 21;
    int ans = LinearSearch(arr,target);
    System.out.println(ans);
    }
}
