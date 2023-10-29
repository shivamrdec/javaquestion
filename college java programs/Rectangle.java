import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length and bredth");
        int l = scan.nextInt();
        int b = scan.nextInt();
        int Area = l*b;
        System.out.println("Area of rectangle=" +Area); 
    }
}