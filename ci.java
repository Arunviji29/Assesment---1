import java.util.Scanner;

public class ci {
    public static void main(String[] args) {
    	Scanner get = new Scanner(System.in);

        System.out.println("Enter the principal (amount), time, and rate::5000");

        int p = get.nextInt();
        int t = get.nextInt();
        int r = get.nextInt();
        float CI;

        CI = (float)(p * (Math.pow((1 + r / 100), t)));

        System.out.println("Compound Interest = " + CI);
    }
}
