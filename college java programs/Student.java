import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks");
        System.out.println("Physics");
        float a = scan.nextFloat();
        System.out.println("Chemistry");
        float b = scan.nextFloat();
        System.out.println("Biology");
        float c = scan.nextFloat();
        System.out.println("Math");
        float d = scan.nextFloat();
        System.out.println("English");
        float e = scan.nextFloat();
        float Totalmarks = a+b+c+d+e;
        float Percentage = (Totalmarks/500)*100;
        System.out.println("Total marks="  +Totalmarks);
        System.out.println("Percentage="+Percentage+"%");

    }
    
}
