public class MutableStrings
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length()); 

        sb.append(" Reddy");
        System.out.println(sb);

        sb.setLength(40);
    
        String name = sb.toString(); // if we want to save sb to "normal" string we have to convert it first
        System.out.println(name); 



    }
}