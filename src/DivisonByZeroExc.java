class MyException extends Exception
{
    private int ex;
    MyException(int b)
    {
        ex = b;
    }
    public String toString()
    {
        return("MyException: Number is not divisible by "+ex);
    } 
}

public class DivisonByZeroExc 
{

    static void divide(int a, int b) throws MyException
    {
        if(b==0)
            throw new MyException(b);
        else 
            System.out.println("Divison: "+(a/b));      
    }
    public static void main(String[] args)
    {
        try
        {
            divide(100,10);
            divide(10,0);
        }
        catch(MyException me)
        {
            System.out.println(me);
        }
        finally
        {
            System.out.println("Inside Finally Block");
        }
    }
}
