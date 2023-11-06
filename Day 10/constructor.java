class Human
{
    private int age; //it simply means this particular variable is only accessible only in the same class
    // no one from the outside world can use it

    private String name;

    public Human() //default constuctor
    {
        age = 12;
        name = "John";
        System.out.println("In constructor");
    }

    //parameterised constuctor 
    public Human(int age, String name)
    {
        this.name = name;
        this.age = age;
    }



    public  int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age; //this refers to the current object
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

}

public class constructor
{
    public static void main(String args[])
    {
        Human obj = new Human(); //Thanks to the constructor this object will get the default values
        System.out.println(obj.getName());
        System.out.println(obj.getAge());   


        Human obj1 = new Human(34,"Marek");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());   
        
    }
}