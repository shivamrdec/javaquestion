import java.util.Scanner;

public class Rhombus1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=scan.nextInt();

        for(int i=n; i>0; i--){
            for(int j=0; j<n-i; j++){
                System.out.println(" ");
            }
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
