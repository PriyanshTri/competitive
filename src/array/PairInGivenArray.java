package array;
/*
Given an array that is sorted and then rotated around an unknown point.
 Find if the array has a pair with a given sum ‘x’.
 It may be assumed that all elements in the array are distinct.
 */
//time taken = 10;

import java.util.Scanner;

public class PairInGivenArray {
    public static boolean isSumPresent(int[] arr, int x) {
        for (int i : arr) {
            for (int j : arr) {
                if (i + j == x) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of array:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the sum:-");
        int x = sc.nextInt();
        System.out.println("the result is="+PairInGivenArray.isSumPresent(arr, x));
    }
}
