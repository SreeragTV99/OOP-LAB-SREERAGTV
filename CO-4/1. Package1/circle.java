package graphics;
import java.util.Scanner;



public class circle implements inter
{
Scanner sc=new Scanner(System.in);	
double r,ar;
public void area()
{

System.out.println("Enter the radius : ");
 r=sc.nextDouble();
ar=3.14*r*r;
System.out.println("Area is = "+ar);
}
}
