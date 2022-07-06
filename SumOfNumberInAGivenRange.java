import java.util.Scanner;
public class SumOfNumberInAGivenRange {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Two Numbers:");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int total = 0;
            for(int i = n; i <= m; i++) {
                total = total + i;
            }
            System.out.println("Total Sum between the range of given numbers");
            System.out.println(total);
        }
    }
