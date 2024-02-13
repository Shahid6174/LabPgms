class Shape
{
    public void display()
    {
        System.out.println("This is a Shape...");
    }
}

class Circle extends Shape
{
    public int r;
    public void draw()
    {
        System.out.println("Draw a circle with radius "+r);
    }
    public void erase()
    {
        System.out.println("Erase the circle");
    }
}

class Triangle extends Shape
{
    public int a, b, c;
    public void draw()
    {
        System.out.println("Draw the triangle with sides "+a+","+b+","+c);
    }
    public void erase()
    {
        System.out.println("Erase the circle");
    }

}

class Square extends Shape
{
    public int side;
    public void draw()
    {
        System.out.println("Draw the square witn side "+ side);
    }
    public void erase()
    {
        System.out.println("Erase the square");
    }
}

public class Poly {
        public static void main(String[] args) {
            Square s = new Square();
            Circle c = new Circle();
            Triangle t = new Triangle();

            c.display();
            c.r = 7;
            c.draw();
            c.erase();
            System.out.println();

            t.display();
            t.a=5;
            t.b=6;
            t.c=7;
            t.draw();
            t.erase();
            System.out.println();

            s.display();
            s.side = 7;
            s.draw();
            s.erase();
            System.out.println();
        }
}
