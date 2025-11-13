package labcode.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestDriver
{
    public static void main(String[] args)
    {}
    private final JUnitExample lab = new JUnitExample();
    int number[] = {2,4,6,8,10};


    @RepeatedTest(value = 5)
    void testEvenNumberWithMultipleDataPoints(RepetitionInfo repetitionInfo)
    {
        int index = repetitionInfo.getCurrentRepetition()-1;
        int indexElement = number[index];
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void testEvenNumberWithDataSourcePoints(int number)
    {
        assertTrue(lab.evenNumber(number));
    }

    @Test
    void testEvenNumberWithPostiveValue()
    {
        assertTrue(JUnitExample.evenNumber(4));
    }

    @Test
    void testAddNumberWithPositiveValues()
    {
        //lab lab = new lab();

        int actual = JUnitExample.addNumber(10,20);
        int expecting = 30;


        assertEquals(expecting,actual);
    }

    @Test
    void testAddNumberWithNegativeValues()

    {
        //lab lab = new lab();

        int actual = JUnitExample.addNumber(-10,-20);
        int expecting = -30;


        assertEquals(expecting,actual);
    }

}