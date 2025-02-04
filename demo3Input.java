import java.util.Scanner;
public class demo3Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter num1");
            int num1=sc.nextInt();
            System.out.println(num1);
            System.out.println("Enter your name:");
            // only print the first word
            String name=sc.next();
            System.out.println(name);
            // for full line
            System.out.println("Enter your line:");
            String name1=sc.nextLine();
            System.out.println(name1);
            System.out.println("Enter num2:");
            float num2=sc.nextFloat();
            System.out.println(num2);
            //  to check number entered is int or not?
            // boolean b1=sc.nextBoolean();
            // System.out.println(b1);
        }
        

        
}
}
