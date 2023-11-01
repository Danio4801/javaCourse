public class conditionalinstructions
{
    public static void main(String args[])
    {
        int x = 8;
        int y = 9;
        int z = 7;
        if( x > y && x >z)
        {
            System.out.println(x);
        }
        else if(y > z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }

        //Ternary operator, question mark and colon in java:
        boolean isItEven;
        int n = 4;
        isItEven = n % 2 == 0?true:false; 
        System.out.println(isItEven);


        //Switch statement (based on value some task will be performed  ):
        int num = 423; 
        switch (num) // SWITCH WITHOUT BREAK
        {
            case 1: 
                    System.out.println("1");
            case 2: 
                    System.out.println("2");
            case 3: 
                    System.out.println("3");
            case 6:
                    System.out.println("6");
        }
        System.out.println("------------------");

        switch (num) // SWITCH WITH B REAK
        {
            case 1: 
                    System.out.println("1");
                    break;
            case 2: 
                    System.out.println("2");
                    break;
            case 3: 
                    System.out.println("3");
                    break;
            case 6:
                    System.out.println("6");
                    break;
        }

        System.out.println("------------------");


        switch (num) //SWITCH WITH DEFAULT VALUE
        {
            case 1: 
                    System.out.println("1");
                    break;
            case 2: 
                    System.out.println("2");
                    break;
            case 3: 
                    System.out.println("3");
                    break;
            case 6:
                    System.out.println("6");
                    break;
            default:
                    System.out.println("Hamburg");
                    break;

        }
                System.out.println("------------------");


    }
}