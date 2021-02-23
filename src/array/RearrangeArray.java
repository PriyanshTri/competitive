package array;
//Rearrange an array such that arr[i] = i
/*
Ggiven an array of elements of length N, ranging from 0 to N – 1.
 All elements may not be present in the array. If the element is not present then there will be -1 present in the array.
 Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 */
//time taken =10min;
import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of array:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            int flag=0;
            for (int j = 0; j < size; j++) {
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                resultArray[i]=i;
            }
            else{
                resultArray[i]=-1;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(resultArray[i]+" ");
        }
    }

}
