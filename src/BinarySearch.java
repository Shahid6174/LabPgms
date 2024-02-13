import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[20];

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++)
        {
            list[i] = sc.nextInt();
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i<n-1; i++)
        {
            for(int j = 0; j<n-i-1; j++)
            {
                if(list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the key element: ");
        int key = sc.nextInt();
        
        int low  = 0;
        int high = n-1;

        while(low<=high)
        {
            int mid = (low + high)/2;
            if(list[mid] == key)
            {
                System.out.println("The key element = "+key+" is found at "+(mid+1)+" position");
                return;
            }
            if(key>list[mid])
            {
                low  = mid+1;
            }
            if(key<list[mid])
            {
                high = mid-1;
            }
        }
        System.out.println("The key is not found.");
    }   
}
