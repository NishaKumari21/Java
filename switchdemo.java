import java.util.Scanner;
public class switchdemo {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch (age) {
            case 18:
            System.out.println("You are 18");
            break;
            case 24:
            System.out.println("You are 24");
            case 56:
            System.out.println("You are 56");
            default:
            System.out.println("You are not 18, 24, or 56");
                break;
        }

    }
}
