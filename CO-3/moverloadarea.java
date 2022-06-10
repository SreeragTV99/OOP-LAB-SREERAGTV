import java.util.Scanner;
class Moverload
{
    void area(float x)
    {
        System.out.println("The area of the square is : "+x*x);
    }
    void area(int a, int b)
    {
        System.out.println("The area of the rectangle is : "+a*b);
    }
    void area(double c)
    {
        System.out.println("The area of the circle is : "+3.14*c*c);
    }
    void area(float d, float e)
    {
        double f = 0.5*d*e;
        System.out.println("The Area of Triangle is : "+f);
    }
}
class moverloadarea 
{
     public static void main(String args[]) 
	{
	   Moverload ob = new Moverload();
       Scanner sc = new Scanner(System.in);
       int a,b;
       float x,d,e;
       double c;
       System.out.println("Enter the length of square : ");
       x = sc.nextFloat();
       ob.area(x);
       System.out.println("Enter the length  and breadth of Reactangle : ");
       a = sc.nextInt();
       b = sc.nextInt();
	   ob.area(a,b);
       System.out.println("Enter the radius of Circle : ");
       c = sc.nextDouble();
	   ob.area(c);
       System.out.println("Enter the Two parameters of Triangle : ");
       d = sc.nextFloat();
       e = sc.nextFloat();
       ob.area(d,e);
    }
}