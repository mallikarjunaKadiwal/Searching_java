package searching;
import java.util.*;

class binary_search {
    int binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == x) {
                return mid;

            } else if (arr[mid] > x) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        binary_search ob = new binary_search();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        System.out.println("Elements present:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Enter the element to be searched");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}