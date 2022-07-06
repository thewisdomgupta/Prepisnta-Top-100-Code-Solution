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
