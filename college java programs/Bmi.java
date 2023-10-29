import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter weight in kg");
        float weight = scan.nextFloat();
        System.out.println("enter height in meter");
        float height = scan.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("BMI=" +bmi);
        scan.close();
    }
}
