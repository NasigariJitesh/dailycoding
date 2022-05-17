import java.io.*;
import java.util.*;
import java.util.Scanner;

public class day1
{
    public static void sort(int arr[]) 
    { 
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < arr.length; j++) 
           {
                if (arr[j] < arr[pos])                  
                {
                    pos = j;
                }
            }

            temp = arr[pos];            
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
    public static boolean prob1(int[] a, int x) {
        sort(a);
        for (int i = 0, j = a.length - 1; i < j;) {
            int sum = a[i] + a[j];
            if (sum < x)
                i++;
            else if (sum > x)
                j--;
            else
                return true;
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int[] array= new int[n];
		System.out.println("Enter array values:");
		for(int i =0;i<n;i++){
		    array[i]=sc.nextInt();
		}
		System.out.println("Enter sum value:");
		int sum = sc.nextInt();
		boolean value = prob1(array,sum);
		System.out.println(value);
	}
}
