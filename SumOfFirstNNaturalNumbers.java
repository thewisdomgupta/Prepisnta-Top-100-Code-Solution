import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        int total = 0;
        for(int i=0; i<=num; i++){
            total= total+i;
        }
        System.out.println("Total Sum is:");
        System.out.println(total);
    }
}
