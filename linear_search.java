package searching;

import java.util.Scanner;

public class linear_search {
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] a1= {10,20,30,50,70,90};
        System.out.println("Elements present:");
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i] +" ");
        }
        System.out.println(" ");
        System.out.println("Enter the element to be searched:");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
    }
}
