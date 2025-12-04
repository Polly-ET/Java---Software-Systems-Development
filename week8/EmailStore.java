package week8;

import java.util.HashSet;
import java.util.Set;

public class EmailStore
{
    private Set<String> emailAddresses = new HashSet<String>();


    public boolean addEmail(String email)
    {

        return emailAddresses.add(email);
    }

    public boolean hasEmail(String email)
    {

        return emailAddresses.contains(email);
    }

    public void displayEmails()
    {

        System.out.println("\nStored email addresses :\n----------------------\n");

        for(String email : emailAddresses) {
            System.out.println(email);
        }
    }

}
