public class conditionalstatements
{
    public static void main (String args[])
    {
        //Conditional statements
        int x = 28;

        if (true)
        System.out.println("It just works."); //please note that we can perform 1 line instructions without {}
    
        if (x > 10 && x <= 20) // 11 to 20 accepted 
        {
            System.out.println("Hi");
        }

        
        if (x > 10 && x <= 20) // 11 to 20 accepted 
            System.out.println("Hello");
        else 
            System.out.println("Bye");


        x = 2; 
        int y = 5;
        if (x > y)
        {
            System.out.println(x);
            System.out.println("Danke");
        }
        else
        {
        System.out.println(y);
        }

   


    }
}