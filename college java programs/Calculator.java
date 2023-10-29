import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println("Enter an operator(+,-,*,/):");
        char operator = scan.next().charAt(0);
        switch(operator){
        case '+':
            result=a+b;
            System.out.println(a+ "+" +b+ "=" +result);
            break;
        
        case '-':
            result=a-b;
            System.out.println(a+ "-" +b+ "=" +result);
            break;
        
        case '*':
        result=a*b;
        System.out.println(a+ "*" +b+ "=" +result);
        break;
        
        case '/':
        result=a/b;
            System.out.println(a+ "/" +b+ "=" +result);
            break;
        
        default:
        System.out.println("Invalid");
    }
        scan.close();
    

    }
    
}
