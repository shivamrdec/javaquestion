import java.util.Scanner;

public class Hollowtriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){

                if(j==1||j==i||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
        }
    }
}
