import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the celcius");
        float celcius = scan.nextFloat();
        float farah = (celcius*(9/5))+32;
        System.out.println("F=" +farah);
    }
    
}
