public class demological {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=45;
        // logical AND
        if(a>b&&a>c){
            System.out.println("a is greater");
        }
        else if(b>a&&b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
        // logical OR
        if(b>a||a>c){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b or c is greater");
        }
        // logical NOT
        if(a!=0){
            System.out.println("a is not null");
        }
        else{
            System.out.println("a is null");
        }
    
}
}

