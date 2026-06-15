package Array.Practice;

public class Student {
    String name;
    int age;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    void display()
    {
        System.err.println("Name of Person: "+name+" Age of Person: "+age);
    }

    public static void main(String[] args) {
        Student s[]=new Student[3];
        s[0]=new Student("chaitali", 21);
        s[1]=new Student("xyz", 22);
        s[2]=new Student("abc", 20);

        s[0].display();
        s[1].display();
        s[2].display();

    }
    
}
