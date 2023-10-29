import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        int d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a =scan.nextInt();
        System.out.println("Enter the second number");
        int b =scan.nextInt();
        System.out.println("Enter the third number");
        int c =scan.nextInt();
        d=c>(a>b?a:b)?c:((a>b)?a:b);
        // String greatest=(b>c>a)?"second is greater":"second is not greater";
       // String greatest=(c>a>b)?"third is greater":"third is not greater";
        System.out.println("Largest number=" +d);
        
    }
    
}
