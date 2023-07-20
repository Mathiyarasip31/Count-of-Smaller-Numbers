import java.util.Arrays;
import java.util.Scanner;

public class CountSmallerNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= scanner.nextInt();
        }
        Count(arr,size);
    }
    public static void Count(int arr[],int size)
    {
        int count[]=new int[size];
        Arrays.fill(count,0);
        for(int i=0;i<size;i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    count[i]++;
                }
            }
        }
        for (int i=0;i<size;i++)
        {
            System.out.print(count[i]+" ");
        }

    }
}
