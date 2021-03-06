// Using Brute Force Approach
import java.util.Scanner;
public class GreatestofTwoNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1 +" " + "is greater");
        }
        else if(num2>num1){
            System.out.println(num2 +" " +"is greater");
        }
        else{
            System.out.println("Numbers are Equal");
        }
    }
}

// Using Ternary Operator
import java.util.Scanner;
public class GreatestofTwoNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Numbers are Equal");

        }
        else{
            String Result = num1>num2 ?  num1+ " "+"is Greater" : num2+" "+"is Greater";
            System.out.println(Result);
        }
    }
}

// Using Inbuilt Method
import java.util.Scanner;
public class GreatestofTwoNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("Numbers are Equal");
        }
        else{
            System.out.println(Math.max(num1,num2)+""+"is Greater");
        }
    }
}
