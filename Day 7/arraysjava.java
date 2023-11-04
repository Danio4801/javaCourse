public class  arraysjava
{
    public static void main (String args[])
    {
        int num[] = {5,6,7};
        num[0] = 6;
        System.out.println(num[0]);
        System.out.println("For each loop");
        for(int x : num)
        {
            System.out.println(x); //ChatGPT note:  Pętla for each automatycznie przechodzi przez elementy tablicy, więc x będzie wartością z tablicy, a nie indeksem.
        }
        
        System.out.println("---------");

       
        int nums[] =  new int[4]; //num1 can store up to 4 values      
        for(int i = 0; i < 4; i++)
        System.out.println(nums[i]); //0 - default value inside array
        

        // multidimensional array
        int numberOfArrays = 3;
        int nuumberOfIndex = 4;
        int multiArray[][] = new int[numberOfArrays][nuumberOfIndex];
        for(int i = 0; i < numberOfArrays;i++)
        {
            for(int j = 0; j < nuumberOfIndex; j++)
            {
                System.out.print(multiArray[i][j] + " ");    
            }
            System.out.println("");    
        }
    }    

}
