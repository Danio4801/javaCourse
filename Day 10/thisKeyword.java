class Human
{
    private int age; //it simply means this particular variable is only accessible only in the same class
    // no one from the outside world can use it

    private String name = "Navin";

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

public class thisKeyword
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setName("Navin"); //we are assigning the value with the help of method
        obj.setAge(33);
      
        System.out.println(obj.getName());
        System.out.println(obj.getAge());   
        
    }
}