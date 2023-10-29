import java.util.Scanner;


public class Evenodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        String evenodd =(a%2==0)?"Even":"odd";
        System.out.println(a+ "is" +evenodd);
        
    }
    
}
