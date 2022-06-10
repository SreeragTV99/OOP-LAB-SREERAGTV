package graphics;
import java.util.Scanner;



public class square implements inter
{
Scanner sc=new Scanner(System.in);	
double l;

public void area()
{


System.out.println("Enter the length : ");
 l=sc.nextDouble();


System.out.println("Area is = "+l*l);
}
}