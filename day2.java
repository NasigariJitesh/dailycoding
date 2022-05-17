import java.util.Scanner;
import java.io.*;

public class day2
{
    public static int productfun(int arr[]) 
    { 
        int productval = 1;
        for(int i =0;i<arr.length;i++){
            productval *= arr[i];
        }
        return productval;
    } 
    public static void prob2(int[] a, int[] b) {
        int prod = productfun(a);
        for (int i = 0; i < a.length;i++) {
            b[i] = prod/a[i];
        }
            
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int[] array= new int[n];
		int[] out = new int[n];
		System.out.println("Enter array values:");
		for(int i =0;i<n;i++){
		    array[i]=sc.nextInt();
		}
		prob2(array,out);
		for(int j =0;j<n;j++)
		    System.out.println(out[j]+" ");
	}
}
