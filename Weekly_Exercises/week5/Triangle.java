package Weekly_Exercises.week5;

public class Triangle
{

    private int sideA;
    private int sideB;
    private int sideC;

    public boolean isIsosceles()
    {

        return (sideA == sideB && sideA != sideC) || (sideB == sideC && sideB != sideA) || (sideC == sideA && sideC != sideB);
    }

    public boolean isEquilateral()
    {

        return (sideA == sideB && sideA == sideC);
    }


    public boolean isScalene()
    {

        return (sideA != sideB && sideA != sideC && sideB != sideC);
    }

    public void setSides(int a, int b, int c)
    {

        sideA = Math.abs(a);
        sideB = Math.abs(b);
        sideC = Math.abs(c);
    }

    public void setSides(int length)
    {

        sideA = sideB = sideC = Math.abs(length);
    }

    public void setSides(int length, int other)
    {

        sideA = sideB = Math.abs(length);

        sideC = Math.abs(other);
    }

    public Triangle copy()
    {

        return new Triangle(sideA, sideB, sideC);
    }


    public int getPerimeter()
    {

        return sideA + sideB + sideB;
    }

    public int getAverageLength()
    {

        return sideA + sideB + sideC / 3;
    }

    public Triangle(int a, int b, int c)
    {

        sideA = Math.abs(a);
        sideB = Math.abs(b);
        sideC = Math.abs(c);
    }

    public Triangle(int length)
    {

        sideA = sideB = sideC = Math.abs(length);
    }

    public Triangle()
    {

        sideA = sideB = sideC = 1;
    }

    @Override
    public String toString()
    {
        return " a=" + sideA + ", b=" + sideB + ", c=" + sideC;
    }

}