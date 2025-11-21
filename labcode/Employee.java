package labcode;

public class Employee extends Object
{
    private String employeeNumber;
    private String name;

    Employee (String employeeNumber, String name)
    {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
;

    public String toString()
    {
        return "Employee Number: " + employeeNumber + ", Name: " + name;
    }

}