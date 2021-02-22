//program is done  time used =25 min;

package array;

import java.util.Scanner;

public class ReversalAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the rotation times:-");
        int rotation = sc.nextInt();
        //r(aROTATION)
        for (int i = 0; i < rotation / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[rotation - i - 1];
            arr[rotation - i - 1] = temp;
        }
//        r(aSize)
        for (int i = rotation; i < (size + rotation) / 2; i++) {
            int tempSize=size-1;
            int temp = arr[i];
            arr[i] = arr[tempSize];
            arr[tempSize] = temp;
            tempSize--;
        }
//        r(r(aROTATION)r(aSIZE))
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        //print
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
