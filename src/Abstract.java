import java.util.*;

abstract class Fields
{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle extends Fields
{
    private int l, b, h;

    void display(int l,int b, int h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
        System.out.println("This is a triangle...");
    }

    @Override
    void calculateArea() {
        System.out.println("The area of the triangle is "+ (b*h));
       }

    @Override
    void calculatePerimeter() {
        System.out.println("The perimeter of the triangle is "+ (l+b+h));
    }
    
}

class Circle extends Fields
{
    private int r;

    void display(int r)
    {
        this.r = r;
        System.out.println("This is a circle...");
    }
    @Override
    void calculateArea() {
        System.out.println("The area of the circle is "+ (3.142*r*r));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("The perimeter of the circle is "+ (3.142*2*r));
    }
    
}
public class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle C = new Circle();
        Triangle T = new Triangle();
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        C.display(r);
        C.calculateArea();
        C.calculatePerimeter();
        System.out.println("Enter the dimensions of triangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt(); 
        T.display(l,b,h);
        T.calculateArea();
        T.calculatePerimeter();
    }
}
