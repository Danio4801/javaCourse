class Calculator
{
    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class Demo
{
    public static void main(String args[])
    {
        int num1 = 4;
        int num2 = 5;
        

        //!!!!!!!!!
        //We created the object below   
        Calculator calc = new Calculator(); 
        //hey, i have calc class and i want to make object based on this "idea", based on Calcualtor class
        // calc - it is the referance variable

        // new Calculator();  - this is how to we create the object
        // new Calculator();  - we wan  t a new object of the design Calculator
        // Calculator calc - we are assigning new object of the Calculator design of type Calculator called calc


        //We can simply call created object
        int result = calc.add(num1, num2);
        System.out.println("Result: " + result);


     
    }
}