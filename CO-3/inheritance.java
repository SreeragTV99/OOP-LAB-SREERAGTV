import java.util.Scanner;
class inheritance
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	 System.out.println("\nEnter the no.of teacher:");
	 n=sc.nextInt();
	 teacher t[]=new teacher[n];
	 for(int i=0;i<n;i++)
	 {
       t[i]=new teacher();
     }
      System.out.println("\n---DETAILS OF TEACHERS---");
      for(int i=0;i<n;i++)
      {
      	t[i].disp();
      }
  }
}
class employee
{
	int id,salary;
	String name,address;
	employee()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the employee no : ");
      id=sc.nextInt();
      System.out.println("Enter the employee name : ");
      name=sc.next();
      System.out.println("Enter the address : ");
      address=sc.next();
      System.out.println("Enter the salary : ");
      salary=sc.nextInt();
	}
}
class teacher extends employee
{
	String subject,department;
	teacher()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter the subject : ");
      subject=sc.next();
      System.out.println("Enter the department : ");
      department=sc.next();
    } 
    void disp()
    {
        System.out.println("\nID : "+id);
        System.out.println("\nNAME : "+name);
        System.out.println("\nADDRESS : "+address);
        System.out.println("\nSALARY : "+salary);
        System.out.println("\nSUBJECT : "+subject);
        System.out.println("\nDEPARTMENT : "+department);
    }
}