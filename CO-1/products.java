import java.util.Scanner;
class product{
    String pname;
    int pcode,price;
    void details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product name :");
        pname= sc.nextLine();
        System.out.println("pCode :");
        pcode = sc.nextInt();
        System.out.println("Price :");
        price = sc.nextInt();
        return;
    }
    void display(){
        System.out.println("Product name :"+pname);
        System.out.println("pCode :"+pcode);
        System.out.println("Price :"+price);
    }
}
public class products{
    public static void main(String args[]){
        
        product obj1=new product();
        System.out.println("Details of Product 1");
        obj1.details();
        obj1.display();
        product obj2=new product();
        System.out.println("Details of Product 2");
        obj2.details();
        obj2.display();
        product obj3=new product();
        System.out.println("Details of Product 3");
        obj3.details();
        obj3.display();

        if(obj1.price<obj2.price&&obj1.price<obj3.price){
             System.out.println(obj1.pname+" is the Pruduct with Lowest price "+obj1.price);
        }
        else if(obj2.price<obj3.price&&obj2.price<obj1.price){
             System.out.println(obj2.pname+" is the Pruduct with Lowest price "+obj2.price);
        }
        else{
            System.out.println(obj3.pname+" is the Pruduct with Lowest price "+obj3.price);
        }
    }
}