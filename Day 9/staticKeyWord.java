class Mobile
{
    String brand;
    int price;
    static String name = "Smartphone"; 

    public void show()
    {
        System.out.println(" Brand: "+brand + " Price: "+ price + " Name:   "+name);
    }
}

public class staticKeyWord
{
    public static void main(String args[])
    {
        System.out.println("");
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Sony";
        obj1.price = 999;

        Mobile obj2 = new Mobile();
        obj2.brand = "Motorola";
        obj2.price = 799;
        
        obj1.show();
        obj2.show();
        System.out.println("");

        obj2.name = "Cellphone"; //please notice how change in one object also affects other objects
        obj1.show();
        obj2.show();
        System.out.println("");

        Mobile.name = "Phone"; // we can call a class
        obj1.show();
        obj2.show();

    }
}