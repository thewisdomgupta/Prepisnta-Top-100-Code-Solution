import java.util.Scanner;
public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any Number:");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Entered Number is Positive");
        }
        else if(n==0){
            System.out.println("Entered Number is Zero");
        }
        else{
            System.out.println("Entered Number is Negative");
        }
    }
}
