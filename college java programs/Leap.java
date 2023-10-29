import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = scan.nextInt();
        if(a%400==0||a%100!=0&&a%4==0){
        System.out.println("This is leap year");
        }
        else{
        System.out.println("This is not leap year");
        }
        scan.close();
    }
    
}
