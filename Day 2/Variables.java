public class Variables
{
    public static void main(String args[])
    {
        System.out.print(5 + 6);

        System.out.println(5 + 6); //ln means new line, so just print it in new line
        System.out.println(11 + 54);

        int num1 = 3; //assigment 
        System.out.println(num1);

        int num2 = 5;
        System.out.println(num1 + num2);

        int result = num1 + num2;
        System.out.println(result);


        //DATA TYPES
        float num3 = 5.6f;
        
        long l = 43242423L;  // the values are called literals beacuse they literally a values (stałą wartość przypisaną do zmiennej można nazwać literałem.)
        
        char c = 'k'; //char accept only a single character and we cant use the "", insted for single characters '' is required;
        boolean b = true; // we dont use the "" because true or false is a keyword itself 


        //literals 
        int num4 = 564; // we can use / play with DEC values
        int num5 = 0b101; // we can use / play with BIN values but we have to remember about the 0b at the beginning 
        int num6 = 0x7E; // we can use / play with HEX values but we have to remember about the 0h at the beginning 
        int num7 = 100_000_000; //we can always use the _ just to not get confused with eg. multiple zeros in bank acc number

        double num8 = 56;
        double num9 = 12e10; // we can use epsilon
        System.out.println(num9);


        char a = 'a';
        a += 1;
        System.out.println(a); 
    }
}