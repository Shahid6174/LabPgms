import java.util.Scanner;

public class LinearSearch {
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
        System.out.println("The array is: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the key element: ");
        int key = sc.nextInt();

        for(int i = 0; i<n; i++)
        {
            if(list[i] == key)
            {
                System.out.println("The key element = "+key+" is found at "+(i+1)+" position");
                return;
            }
        }
        System.out.println("The key element is not found.");
    }   
}
