public class loops
{
    public static void main (String args[])
    {
        //WHILE LOOP
        int j = 1;
        
        while (j <= 4)
        {
            System.out.println("Hello world - " + j);
            j++;
        }
        System.out.println(j);

        // DO WHILE LOOP
        do
        {
            System.out.println("Hello Marek - " + j);
            j++;  
        }
        while (j <=4); //!!!!! we have to end this with ";"

        // FOR LOOP
        // the "for" loop first initializes "i", then checks the condition,
        //then executes the instruction, then increments i   
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Hello Bartlomiej - " + i);
        } 
        // we can also make weird looking , unusual for loop like this:
        for(int h = 0; h < 4;)
        {
            //some code
            h++;
        }
        // or this 
            for(;i < 4;)
        {
            //some code
            i++;
        }
        
}