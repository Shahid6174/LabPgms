import java.util.Scanner;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height); 
    void printSize();
}

class Rectangle implements Resizable
{
    private int height, width;
    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("The resized width is "+ width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("The resized height is "+ height);
    }

    public void printSize()
    {
        System.out.println("The present size of rectangle is "+height+"x"+width);
    }
}

public class Inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial size of rectangle: ");
        int height = sc.nextInt();
        int width = sc.nextInt();
        Resizable obj = new Rectangle(height,width);
        obj.printSize();
        System.out.println("Enter the resized height: ");
        height = sc.nextInt();
        obj.resizeHeight(height);
        System.out.println("Enter the resized width: ");
        width = sc.nextInt();
        obj.resizeWidth(width);
        obj.printSize();
    }
}
