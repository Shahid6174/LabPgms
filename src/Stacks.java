import java.util.Scanner;

public class Stacks {
    static int stacksize = 10;
    public static void push(int top[], int item, int s[])
    {
        if(top[0] == stacksize - 1)
        {
            System.err.println("Stack overflow...");
            return;
        }
        top[0] += 1;
        s[top[0]] = item;
    }
    public static int pop(int top[], int s[])
    {
        int item;
        if(top[0] == -1)
        {
            return -1;
        }
        item = s[top[0]];
        top[0] -= 1;
        return item;
    }
    public static void display(int top[], int s[])
    {
        if(top[0] == -1)
        {
            System.out.println("Stack is empty...");
            return;
        }
        for(int i = 0; i<=top[0]; i++)
        {
            System.out.print(s[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[stacksize];
        int top[] = {-1};
        System.out.println("Stack underflow...");
        int choice;
        for(;;)
        {
            System.out.println("Enter 1.Push 2.Pop 3.Display 4.Exit: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:System.err.println("Enter the item: ");
                        int item = sc.nextInt();
                        push(top, item, s);
                        break;
                case 2:int y = pop(top, s);
                        if(y==-1)
                            System.out.println("Stack is empty");
                        else
                            System.out.println("Item deleted is " + y);
                        break;
                case 3:display(top, s);
                        break;
                default: System.exit(0);
            }
        }
    }
}
