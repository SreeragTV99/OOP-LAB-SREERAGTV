import java.util.Scanner;
import graphics.inter;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import graphics.circle;


public class packagenew
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("--MENU--\n\n1.CIRCLE\n2.RECTANGLE\n3.TRIANGLE\n4.SQUARE\n");
            System.out.println("\nENTER YOUR CHOICE:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    circle c=new circle();
                    c.area();
                    break;
                case 2:
                    rectangle b=new rectangle();
                    b.area();
                    break;
                case 3:
                    triangle v=new triangle();
                    v.area();
                    break;
                case 4:
                    square z=new square();
                    z.area();
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }
        while(ch!=5);   
    }
}