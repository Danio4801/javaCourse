class Student
{
    int rollNo;
    String name;
    int marks;
}

public class students
{
    public static void main (String args[])
    {
        //We have to manually create the objects
        Student obj1 = new Student();
        obj1.rollNo = 1;
        obj1.name = "Navin";
        obj1.marks = 88;

        Student obj2 = new Student();
        obj2.rollNo = 2;
        obj2.name = "Harsh";
        obj2.marks = 67;

        Student obj3 = new Student();
        obj3.rollNo = 3;
        obj3.name = "Kiran";
        obj3.marks = 97;

        System.out.println(obj3); // If we try to print the object we get the adress value (Student@1f32e575) (we dont know what this is yet)
        System.out.println(obj3.rollNo +" "+ obj3.name +" "+ obj3.marks); 

        //We are creating an array which can hold student references 
        Student students[] = new Student[3]; //Students became part of the array

        //We are assigning objects to an array
        students[0] = obj1; 
        students[1] = obj2; 
        students[2] = obj3; 

        for(int i = 0; i < students.length; i++)
        { 
            System.out.println(students[i].rollNo +" "+ students[i].name +" "+ students[i].marks); 
        }
    }
}   