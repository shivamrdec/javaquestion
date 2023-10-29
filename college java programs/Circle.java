import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");
         float r = scan.nextFloat();
         float  Area =(float)(3.14*r*r);
        System.out.println("Area of circle =" +Area );

    }
    
}
