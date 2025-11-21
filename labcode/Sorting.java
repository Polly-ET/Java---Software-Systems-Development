package labcode;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting
{
    public static void main(String[] args)
    {
        String name1 = "Hello"; //constant string stored in different place
        String name2 = new String("Hello");
        String name3 = "Hello"; //allocate memory address from name1 not new address

        //comparing memory address not the word itself
        System.out.println(name1 == name2); // false
        System.out.println(name1 == name3); // true


        //using ASCII system - each character has a number value

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        //using lambda expression
        //relates to the employee class

        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee("003", "John"));
        employee.add(new Employee("001", "Alice"));
        employee.add(new Employee("004", "Bob"));
        employee.add(new Employee("002", "Charlie"));


        System.out.println(employee);
        //employee.sort((e1, e2) ->Integer.compareTo(e1.getEmployeeNumber(), e2.getEmployeeNumber()));
        System.out.println(employee);
    }
}
