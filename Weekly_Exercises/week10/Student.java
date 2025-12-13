package Weekly_Exercises.week10;

public class Student
{
    private int id;
    private String name;
    private float grade;


    public int getID()
    {

        return id;
    }

    public String getName()
    {
        return name;
    }

    public float getGrade()
    {

        return grade;
    }

    public String toString()
    {

        return id + " Name : '" + name + "' Grade: " + grade;

    }

    public Student(int id, String name, float grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
