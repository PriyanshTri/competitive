package array;

import java.util.Scanner;

public class Method4ArrayReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the times of rotation:- ");
        int d=sc.nextInt();
        for (int i = 0; i < d/2; i++) {
            int temp=arr[i];
            arr[i]=arr[d-i-1];
            arr[d-i-1]=temp;
        }

        for (int i =d; i <size /2; i++) {
            int temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }

        for (int i = 0; i < size/2; i++) {
            int temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
