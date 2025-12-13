package Weekly_Exercises.week4;

public class ArrayProcessor extends Exception
{

    int count = 0;

    int getArrayLength(Object [] a)
    {
        try
        {
            while(true)
            {
                Object t = a[count];
                count++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            //System.out.println("Exception caught: " + e);
        }
    return count;
    }

}
