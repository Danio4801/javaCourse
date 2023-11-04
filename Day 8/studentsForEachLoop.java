class Student
{
    int rollNo;
    String name;
    int marks;
}

public class studentsForEachLoop
{
    public static void main (String args[])
    {
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
 

        Student students[] = new Student[3]; 

        students[0] = obj1; 
        students[1] = obj2; 
        students[2] = obj3; 

        // Enhace for loop
        for(Student stud : students ) 
        {
            System.out.println(stud.name + " "+ stud.marks );
        }
      
  
  
  
  
  
    }
}