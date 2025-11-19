package week4;


public class Menu {

    public void displayMenuOption(int opt) throws InvalidOptionException
    {

        if (opt < 1 || opt > 2)
        {
            throw new InvalidOptionException("Option " + opt + " is invalid.");
        }

        System.out.println("Menu option " + opt + " selected.");
    }
}
