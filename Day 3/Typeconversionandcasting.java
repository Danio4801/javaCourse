public class Typeconversionandcasting 
{
    public static void main (String args[])
    {
        byte b = 127;
        int a = 12;

        // b = a; !!! WE CANT DO THAT, java not allow this operation because we can lose some data
        a = b; // But we can do that because 'a' is an integer, has a bigger range 
        b = (byte)a; // we are converting interger value to a byte value  // this operation is called: explicit casting

        float f = 5.6F;
        int x;
        x = (int)f; //but we will lose the point values, after the . (dot), so it's 5 from now on


        
        int n = 257;
        byte k = (byte) n;
        System.out.println(k);

        float g = 5.6F;
        int t = (int) g;
        System.out.println(t); // we lost value after .

        byte h = 10;
        byte j = 30;
        int result = h*j; //we are performing operation on byte; 10 * 30 will be out 300, so out of byte range 
        // but since we assign the result of the operation to int java auto promtes h and j to int
        //This is called type promotion   
        System.out.println(result);
    }
}
