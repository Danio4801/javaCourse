public class randomInJava 
{
    public static void main (String args[])
    {
 
            // multidimensional array
            int numberOfArrays = 3;
            int nuumberOfIndex = 4;


            int multiArray[][] = new int[numberOfArrays][nuumberOfIndex];

            for(int i = 0; i < numberOfArrays;i++)
            {
                for(int j = 0; j < nuumberOfIndex; j++)
                {
                    multiArray[i][j] = (int)(Math.random()*100); 
                }
                System.out.println("");    
            }

            //for tmrw
            for(int x : numberOfArrays)
            {

            }

  
    }
}