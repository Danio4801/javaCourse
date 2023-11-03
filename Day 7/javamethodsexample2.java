class Calculator
{
    int num = 5;
    public int add(int n1, int n2)
    { 
        return n1 + n2; //We can return just result, without creating new variable like result
    }

    public int add(int n1, int n2, int n3)
    { 
        return n1 + n2 + n3; 
    }
    
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

public class  javamethodsexample2
{
    public static void main (String args[])
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(12,32); //we are calling add and passing 2 values
        System.out.println(r1);
        System.out.println("---------------");
        Calculator obj1 = new Calculator();

        System.out.println(obj.num); //referance variable. variable
        System.out.println(obj1.num);
      
        System.out.println("---------------");
        obj.num = 321;
        System.out.println(obj.num); //damage to 1 object does not affect other objects
        System.out.println(obj1.num);
    }
}
