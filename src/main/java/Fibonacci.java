import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fib = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        fib.add(s.nextInt());
        fib.add(s.nextInt());
        for(int i = 2; i < 12; i++) {
            fib.add(fib.get(i - 2) + fib.get(i - 1));
        }
        System.out.println(fib);
    }
}
