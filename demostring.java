import java.util.Scanner;
public class demostring {
    public static void main(String[]args){
        String str = "Hello, World!";
        System.out.println(str);
        System.out.printf(str);
        System.out.print(str);
        System.out.format(str);

        float a=6.7f;
        System.out.println(a);
        // used for printing
        System.out.format(str);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(num);
        System.out.println("Enter a string:");
        String s=sc.next();
        System.out.println(s);
    }
}
