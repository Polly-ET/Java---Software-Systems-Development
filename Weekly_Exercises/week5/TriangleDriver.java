package Weekly_Exercises.week5;

public class TriangleDriver
{
    public static void main(String[] args)
    {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(6, 8, 10);

        System.out.println("Triangle 1:" + triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());

        System.out.println("\nTriangle 2:" + triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
    }
}
