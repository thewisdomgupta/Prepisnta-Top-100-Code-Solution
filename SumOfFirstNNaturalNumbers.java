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


// Using formula of Sum of First N Natural Numbers
import java.util.Scanner;
public class SumOfFirstNNaturalNumbers {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        int result = (num*(num+1))/2;
        System.out.println("Total Sum is");
        System.out.println(result);
    }
}
