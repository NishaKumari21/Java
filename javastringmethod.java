import java.util.Scanner;
public class javastringmethod {
    
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        // str1="byee";
        // length of string:
        System.out.printf("Length of string:%d\n",str.length());
        System.out.printf("uppercase %s\n",str.toUpperCase());
        System.out.printf("lowercase %s\n",str.toLowerCase());
        System.out.printf("trim\n:",str.trim());
        System.out.println(str.charAt(2));
        System.out.println(str.contains("Java")); 
        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.endsWith("Java")); 
        System.out.println(str.replace('e','a'));
        System.out.println(str.substring(3));
        // System.out.println("Reversed string: " + str.reverse());
        
        
    }
}
