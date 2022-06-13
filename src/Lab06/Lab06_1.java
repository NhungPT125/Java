package Lab06;
import java.util.Scanner;

public class Lab06_1 {
    protected int hrs,m;
    public static double minutes(double hrs, double m){
        return hrs * 60 + m;
    }

    public static void main(String[] args) {
        int hrs,m,sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hours: ");
        hrs = scanner.nextInt();
        System.out.print("Input minutes: ");
        m = scanner.nextInt();
        System.out.println("Total minutes: " +minutes(hrs,m));

    }
}
