import java.util.Scanner;
public class MatrixAdd
{
    public static void main(String args[])
    {
    int a[][]=new int[5][5];
    int b[][]=new int[5][5];
    int c[][]=new int[5][5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of rows :");
    int row=sc.nextInt();
    System.out.println("Enter the no of columns :");
    int col=sc.nextInt();
    if(col!=row)
    {
        return;
    }
    System.out.println("Enter the elements of First Matrix :");
    for(int i=0;i<row;i++)
    {     
        for(int j=0;j<col;j++)
        {    
            a[i][j]=sc.nextInt();
        }
    }

    System.out.println("Enter the elements of Second Matrix :");
    for(int i=0;i<row;i++)
    {     
        for(int j=0;j<col;j++)
        {    
            b[i][j]=sc.nextInt();
        }
    }

    System.out.println("The result is :");
    System.out.println();
    for(int i=0;i<row;i++)
    {    
        for(int j=0;j<col;j++)
        {    
            c[i][j]=a[i][j]+b[i][j];   
            System.out.print(c[i][j]+" ");    
        }    
        System.out.println();
    }    
    }
}  