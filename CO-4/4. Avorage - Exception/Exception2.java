import java.util.*;
class MyException extends Exception {
    public MyException(String str) {
        System.out.println(str);
    }
}

class Exception2 {
    public static void main(String args[]) {
        int no;
        int i;
        int temp, count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total numbers : ");
        no = sc.nextInt();
        System.out.println("Enter the numbers : ");
        for (i = 0; i < no; i++) {
            try {
                temp = sc.nextInt();
                if (temp > 0) {
                    sum += temp;
                    count += 1;
                } else {
                    throw new MyException("Entered Number is Negative.");
                }
            } catch (MyException ex) {
                System.out.println("Exception occured because -ve number entered !!!");
            }
        }
        System.out.print("Average : ");
        System.out.println(sum / count);
    }
}