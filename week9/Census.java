package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Census
{

    private final List<Person> people = new ArrayList<Person>();

    void addPerson(Person person)
    {

        people.add(person);
    }


    boolean removePerson(Person person)
    {
        return people.remove(person);
    }

    int countPeople()
    {

        return people.size();
    }

    int countMales()
    {

        int count = 0;

        for (Person person : people) {

            if (person.isMale())
                count++;
        }
        return count;
    }

    int countFemales()
    {

        return countPeople() - countMales();
    }

    void sortOnAge()
    {

        // this version uses an anonymous inner class
        Collections.sort(people, new Comparator<Person>()
        {

            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
    }


    void sortOnHeight() {

        // this version uses a lambda expression
        Collections.sort(people, (p1,p2) -> Integer.compare(p1.getHeight(), p2.getHeight()));
    }

    void sortOnGender()
    {
        Collections.sort(people, new Comparator<Person>()
        {

            @Override
            public int compare(Person p1, Person p2) {
                return Boolean.compare(p1.isMale(), p2.isMale());
            }
        });
    }

    @Override
    public String toString()
    {

        StringBuffer buffer = new StringBuffer();

        buffer.append("People in census\n");
        buffer.append("----------------\n");

        for (Person person : people) {

            buffer.append(person);
            buffer.append("\n");
        }

        buffer.append("----------------\n");

        return buffer.toString();
    }

}
