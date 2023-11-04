public class ForEachLoop
{
    public static void main (String args[])
    {
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        for(int n : nums ) // Give me a value! NOT an index number from nums
        //From this nums just give me one value at the time(the value is goin to the n)
        {
            System.out.println(n);
        }
        // Notice that we cant get exception with the loop above which is good 
        
    }
}   