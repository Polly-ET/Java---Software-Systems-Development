package Weekly_Exercises.week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager
{

    private List<String> names = new ArrayList<String>();

    public void addName(String name)
    {

        names.add(name);
    }

    public void printNames()
    {

        System.out.println("\nNames List is as follows : \n--------------------------\n");

        // iterate over list and print each name
        for(String name : names)
            System.out.println(name);
    }

    public void removeLongNames()
    {

        Iterator<String> iter = names.iterator();

        // iterate over the list looking for long names
        while (iter.hasNext() ) {
            String name = iter.next();

            if ( name.length() > 15 )
                iter.remove();	// remove using only safe method (while iterating)
        }
    }

    // Could also do this using streams, e.g.
    // names = names.stream().filter((x) -> x.length() <= 15).collect(Collectors.toList());


}