/*Write a java program to create an abstract class named Shape that contains an empty
method named numberOfSides( ). Provide three classes named Rectangle, Triangle and

Hexagon such that each one of the classes extends the class Shape. Each one of the class-
es contains only the method numberOfSides( ) that shows the number of sides in the giv-
en geometrical structures. (Exercise to understand polymorphism).*/
abstract class Shapej
{
    public abstract void numberOfSides(int sides);
}

class Rectangle extends Shape{
    public void numberOfSides(int sides)
    {
        System.out.println("The number of sides of Rectangle is: "+sides);
    }
}
class Triangle extends Shape
{
    public void numberOfSides(int sides)
    {
        System.out.println("The number of sides of Triangle is: "+sides);
    }
}
class Hexagon extends Shape
{
    public void numberOfSides(int sides)
    {
        System.out.println("The number of sides of Hexagon is: "+sides);
    }
}
public class Shape{
    public static void main(String args[])
    {
        Rectangle R = new Rectangle();
        Hexagon H = new Hexagon();
        Triangle T = new Triangle();
        
        T.numberOfSides(3);
        H.numberOfSides(6);
        R.numberOfSides(4);
      
    }
}