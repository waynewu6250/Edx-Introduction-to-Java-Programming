import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
       int x;
       int y;

       IO.output("Enter an integer, x: ");
       x = IO.inputInteger();
       IO.output("Enter an integer, y: ");
       y = IO.inputInteger();

       int calculated_result = x * y;

       IO.outputln("Answer = " + calculated_result);
        
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        double x;
        double y;

        IO.output("Enter the width of the triangle: ");
        x = IO.inputDouble();
        IO.output("Enter the height of the triangle: ");
        y = IO.inputDouble();

        double calculated_area = x * y / 2;

        IO.outputln("The triangle area = " + calculated_area); 
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        double a;
        double b;
        double c;
        double first_x;
        double second_x;
        
        IO.output("Enter a: ");
        a = IO.inputDouble();
        IO.output("Enter b: ");
        b = IO.inputDouble();
        IO.output("Enter c: ");
        c = IO.inputDouble();
        
        first_x = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        second_x = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        
        IO.outputln("First solution for x = " + first_x);
        IO.outputln("Second solution for x = " + second_x);
        
    }
}
