// Using Brute Force Approach
import java.util.Scanner;
public class EvenOrOddNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}


// Using Teranary Operator
import java.util.Scanner;
public class EvenOrOddNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n = sc.nextInt();
        String Result = n%2==0? "Number is Even" : "Number is Odd";
        System.out.println(Result);

    }
}
