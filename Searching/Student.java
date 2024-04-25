package Searching;

public class Student {
    String name;
    float cpi;
    public Student(String name,float cpi)
    {
        this.name=name;
        this.cpi=cpi;
    }
    @Override
    public boolean equals(Object obj)
    {
        Student student = (Student) obj;
        return (this.cpi==student.cpi && this.name.equals(student.name));
    }
}
