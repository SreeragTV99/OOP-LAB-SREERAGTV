package graphics;
import java.util.Scanner;



public class rectangle implements inter
{
Scanner sc=new Scanner(System.in);	
double l,b;

public void area()
{


System.out.println("Enter the length : ");
 l=sc.nextDouble();
System.out.println("Enter the breadth : ");
 b=sc.nextDouble();


System.out.println("Area is = "+l*b);
}
}