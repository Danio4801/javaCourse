class Mobile
{
    String brand; //instance variable
    int price; //instance variable
    static String name;  //static variable

    static //static block, static block will be always called first, no matter what
    {
        name = "Phone";
        System.out.println("Static check");
    }
 

    public Mobile()
    {
        brand = ""; //defrault name
        price = 200; //defrault price
        System.out.println("Constructor check");
    }

    public void show()
    {
        System.out.println(" Brand: "+brand + " Price: "+ price + " Name:   "+name);
    }

    public static void show1()
    {
        System.out.println("In static method"); 
        System.out.println(" Brand: "+obj.brand + " Price: "+obj. price + " Name:   "+obj.name); 
        // We can use a static variable method inside static method
        // BUT WE CANT USE A NOT STATIC VARIABLE INSIDE STATIC METHOD
        // That's because if we use call Mobile.show1(); how can we know to which object we are refering to.
    }

}

public class staticMoreInfo
{
    public static void main(String args[])
    {
        Mobile.show1(); //we can call static method directly with the class name


    }
}