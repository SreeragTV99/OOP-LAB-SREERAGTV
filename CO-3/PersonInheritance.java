import java.util.Scanner;
class person
{
  int age;
  String name,address,gender;
  person()
	{
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter the name of person :");
    name=sc.next();
    System.out.print("\nEnter the address :");
    address=sc.next();
    System.out.print("\nEnter the gender :");
    gender=sc.next();
    System.out.print("\nEnter the age :");
    age=sc.nextInt();
	}
}
class employee extends person
{
 int salary;
 String id,cname,qu;
 employee()
 {
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter the company name :");
    cname=sc.next();
    System.out.print("\nEnter the employee id :");
    id=sc.next();
    System.out.print("\nEnter the qualification :");
    qu=sc.next();
    System.out.print("\nEnter the salary:");
    salary=sc.nextInt();
 }
}
class teacher extends employee
{
	String sub,dept,tid;
	teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the subject name :");
    sub=sc.next();
    System.out.print("\nEnter the department name:");
    dept=sc.next();
    System.out.print("\nEnter the teacher id:");
    tid=sc.next();
	}
 void disp()
 {
  System.out.print("\n the name:"+name);
  System.out.print("\n the address:"+address);
  System.out.print("\n the gender:"+gender);
  System.out.print("\n the age:"+age);
  System.out.print("\n the company name:"+cname);
  System.out.print("\n the employee id:"+id);
  System.out.print("\n the qualification:"+qu);
  System.out.print("\n the salary:"+salary);
  System.out.print("\n the name of subject:"+sub);
  System.out.print("\n the name of department:"+dept);
  System.out.print("\n the id of teacher:"+tid);   
 }
}

class PersonInheritance
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("\nEnter the no.of teacher : ");
    n=sc.nextInt();
    teacher t[]=new teacher[n];
    for(int i=0;i<n;i++)
    {
      t[i]=new teacher();
    }
    System.out.print("\n--details of teacher--");
    for(int i=0;i<n;i++)
    {
      t[i].disp();
    }
  }
}