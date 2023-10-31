public class assignmentoperators
{
    public static void main (String args[])
    {
        
        int num1 = 7;
        int num2 = 5;

        int result1 = num1 + num2;
        System.out.println(result1);

        int result2 = num1 - num2;
        System.out.println(result2);

        int result3 = num1 / num2;
        System.out.println(result3);

        int result4 = num1 * num2;
        System.out.println(result4);
        
        int result5 = num1 % num2; //way to get remainder, 
        System.out.println(result5);

        num1 = num1 + 2; // way to increment value by 2, ans: 9
        num1 += 2; //shortcut of the: increment value by 2, ans: 11
        System.out.println(num1);
        num1++; //shortcut of the : num1 += 1; 
        
        //instead of saying num1++; we can also say ++num1;
        //what is the difference between first and second code?  (more in notes, day 4)
        num1++; //post - increment 
        ++num1; // pre - increment
        // real example

        int number1 = 7;
        int res1;
        res1 = ++number1;
        System.out.println(res1); //res1 is equal to 8
        System.out.println(number1); //number1 is equal to 8

        int number2 = 7;
        int res2;
        res2 = number2++;
        System.out.println(res2); //res2 is equal to 7 
        System.out.println(number2); //number2 is equal to 8


        //Comibing conditions - relational operators 
        int x = 6;
        int y = 5;

        boolean res0 = x == y;
        System.out.println(res0);

        int a = 8;
        int b = 6;
        boolean res3 = a > b;
        System.out.println(!res3);
        System.out.println(res3);
    }
}